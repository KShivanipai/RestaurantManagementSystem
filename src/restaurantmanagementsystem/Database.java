/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurantmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 *
 * @author Shivani
 */
public class Database {

    public static Connection connectDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant?zeroDateTimeBehavior=CONVERT_TO_NULL", "administrator", "admin123");
            return connect;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
