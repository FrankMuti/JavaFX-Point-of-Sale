/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stein.mart.classes;

import com.jfoenix.controls.JFXButton;
import java.awt.HeadlessException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import stein.mart.utilities.MySQL;

/**
 * FXML Controller class
 *
 * @author Stein
 */
public class NewProductsController implements Initializable {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst =null;
    
    @FXML
    private Button clear;
    @FXML
    private JFXButton save;
    @FXML
    private JFXButton quit;
    @FXML
    private TextField textID;
    @FXML
    private TextField textProduct;
    @FXML
    private TextField txtUnitPrice;
    @FXML
    private TextField txtDiscount;
    @FXML
    private TextField textStockleft;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    private void update(){
        try {
            conn = MySQL.ConnectDB();
            String sql = "INSERT INTO products" + "(ID, PRODUCT, DISCOUNT, UNITPRICE, STOCKLEFT)" + "VALUES(?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, textID.getText());
            pst.setString(2, textProduct.getText());
            pst.setString(3, txtUnitPrice.getText());
            pst.setString(4, txtDiscount.getText());
            pst.setString(5, textStockleft.getText());
            JOptionPane.showMessageDialog(null, "Succesfully Added");
            System.out.println("Success");
            
        } catch ( SQLException ex) {
             Logger.getLogger(NewProductsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean validate(){
        TextField[] tfs = {textID, textProduct, textStockleft, txtDiscount, txtUnitPrice};
        boolean bool = false;
        for (TextField f : tfs){
            if (("").equals(f.getText())){
                bool = true;break;
            }else            
                bool = true;            
        }
        return bool;     
    }

    @FXML
    private void clearScreen(ActionEvent event) {
        TextField[] tfs = {textID, textProduct, textStockleft, txtDiscount, txtUnitPrice};
        for (TextField f : tfs){
            f.setText("");
        }
    }

    @FXML
    private void saveProducts(ActionEvent event) {
        //if (!validate()){
            update();
        //}
    }

    @FXML
    private void quitS(ActionEvent event) {
        
    }
    
}
