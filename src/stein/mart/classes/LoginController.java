/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stein.mart.classes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.rgb;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Stein
 */
public class LoginController implements Initializable {

    @FXML
    private Button login;
    @FXML
    private Label forgotPassword;
    @FXML
    private Button close;
    @FXML
    private TextField txtUser;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Label lblError;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    @FXML
    private void processLogin(ActionEvent event) throws IOException  {
        if(txtUser.getText().equals("frank") && txtPassword.getText().equals("1234")){
            ((Node) event.getSource()).getScene().getWindow().hide();
            Parent parent = FXMLLoader.load(getClass().getResource("main.fxml")); 
            Stage stage = new Stage();
            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.setTitle("STEIN MART");
            stage.setResizable(false);
            stage.show();
        }else{
            lblError.setText("username or password is incorrect");
            
        }     
    }

    @FXML
    private void forgotPass(MouseEvent event) {
    }

    

    @FXML
    private void close(ActionEvent event) {
        System.exit(0);
    }

    
    
    
    
    
    
}
