/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurantmanagementsystem;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Shivani
 */


/**
 *
 * @author Shivani
 */
public class RestaurantManagementSystem extends Application{
   
    @Override
    public void start(Stage stage) throws Exception {
        Parent root=FXMLLoader.load(getClass().getResource("Restaurant.fxml"));
        Scene scene=new Scene(root);
        
        stage.setTitle("Restaurant Management System");
        stage.setMinHeight(450);
        stage.setMinWidth(550);
        stage.setScene(scene);
        stage.show();
    }
     public static void main(String[] args) {
        launch(args);
    }

}
