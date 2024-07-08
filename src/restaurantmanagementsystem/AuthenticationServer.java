package restaurantmanagementsystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthenticationServer {
    public static void main(String[] args) {
        int port = 5000; // Port to listen on

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected from: " + clientSocket.getInetAddress());

                // Create a new thread to handle each client
                Thread clientHandler = new ClientHandler(clientSocket);
                clientHandler.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ClientHandler extends Thread {
    private final Socket clientSocket;

    public ClientHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try (
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        ) {
            // Read client data
            String clientData = in.readLine();
            System.out.println("Received data from client: " + clientData);

            // Split the client data to get the username and password
            String[] credentials = clientData.split(",");
            String username = credentials[0].split(":")[1];
            String password = credentials[1].split(":")[1];

            // Check client data against the database for authentication
            if (authenticateClient(username, password)) {
                out.println("Authentication successful!");
            } else {
                out.println("Authentication failed. Invalid credentials.");
            }

            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean authenticateClient(String username, String password) {
        // JDBC database connection
        String dbURL = "jdbc:mysql://localhost:3306/restaurant?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String dbUser = "administrator";
        String dbPassword = "admin123";

        try {
            Connection connection = DriverManager.getConnection(dbURL, dbUser, dbPassword);

            // Prepare and execute a query to retrieve user data
            String query = "SELECT Password FROM employee WHERE Username = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String storedPassword = resultSet.getString("Password");
                return storedPassword.equals(password);
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}
