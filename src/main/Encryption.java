/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Dahmani
 */
public class Encryption extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException, NoSuchAlgorithmException{
        FXMLLoader laoder = new FXMLLoader(getClass().getResource("/views/home.fxml"));
        Parent root = laoder.load();
        
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        
        primaryStage.setTitle("Encryption App By DahmaniDev");
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/assets/icon.png")));
        primaryStage.setResizable(false);
        
        
        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
