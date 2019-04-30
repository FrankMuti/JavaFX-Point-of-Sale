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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Stein
 */
public class MainController implements Initializable {

    @FXML
    private Label labelUser;
    @FXML
    private Button dashboard;
    @FXML
    private Button pos;
    @FXML
    private Button stock;
    @FXML
    private Button management;
    @FXML
    private BorderPane borderpane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void gotoDashboard(ActionEvent event) {
        loadUI("dashboard");
        System.out.println("Dashboard");
    }

    @FXML
    private void gotoPOS(ActionEvent event) {
        loadUI("pos");
        System.out.println("POS");
    }

    @FXML
    private void gotoStock(ActionEvent event) {
        loadUI("stock");
        System.out.println("Stock");
    }
    

    @FXML
    private void gotoManagement(ActionEvent event) {
        loadUI("management");
        System.out.println("Management");
    }
    
    private void loadUI(String ui){
        Parent root = null;
       
        try {
            root = FXMLLoader.load(getClass().getResource(ui+".fxml"));
        } catch (IOException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        borderpane.setCenter(root);
       
    }
    
}
