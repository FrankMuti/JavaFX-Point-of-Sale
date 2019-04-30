/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stein.mart.classes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Stein
 */
public class DashboardController implements Initializable {

    @FXML
    private Button totalSales;
    @FXML
    private Button online;
    @FXML
    private Button offline;
    @FXML
    private Button profits;
    @FXML
    private Label cashierName;
    @FXML
    private Label cashierID;
    @FXML
    private Label cashierAddress;
    @FXML
    private Label cashierPhone;
    @FXML
    private Label cashierMail;
    @FXML
    private ImageView cashierImage;
    @FXML
    private Button clearCenter;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        cashierName.setText(null);
//        cashierID.setText(null);
//        cashierAddress.setText(null);
//        cashierPhone.setText(null);
//        cashierMail.setText(null);
        
    }    

    @FXML
    private void callTotal(ActionEvent event) {
        
        
        
        
    }

    @FXML
    private void callOnline(ActionEvent event) {
    }

    @FXML
    private void callOffline(ActionEvent event) {
    }

    @FXML
    private void callProfits(ActionEvent event) {
    }

    @FXML
    private void clearCenter(ActionEvent event) {
        
    }
    
    
}
