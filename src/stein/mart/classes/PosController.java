/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stein.mart.classes;

import stein.mart.utilities.MySQL;
import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javax.swing.JOptionPane;
import stein.mart.lists.PosStockList;

/**
 * FXML Controller class
 *
 * @author Stein
 */
public class PosController implements Initializable {
    
    ResultSet rs = null;
    Connection conn = null;
    PreparedStatement pst = null;
    private ObservableList<PosStockList> data;


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
    private Button addCart;
    @FXML
    private Button clearScreen;
    @FXML
    private Label subtotalLabel;
    
    @FXML
    private Label discountLabel;
    @FXML
    private Label ticketNumberLabel;
    
    @FXML
    private Label totalLabel;
    @FXML
    private TextField scanIdTxt;
    @FXML
    private TableColumn<?, ?> colID;
    @FXML
    private TableColumn<?, ?> colProduct;
    @FXML
    private TableColumn<?, ?> colPrice;
    @FXML
    private TableColumn<?, ?> colDiscount;
    @FXML
    private TableColumn<?, ?> colQuantity;
    @FXML
    private TableColumn<?, ?> colAction;
    @FXML
    private Label clientNumber;
    @FXML
    private TableView<PosStockList> posTable;
    @FXML
    private JFXButton shop;

    /**
     * Initializes the controller class.
     */
    
    private void setCellTable(){
        colID.setCellValueFactory(new PropertyValueFactory<>("ID"));
        colProduct.setCellValueFactory(new PropertyValueFactory<>("product"));
        colDiscount.setCellValueFactory(new PropertyValueFactory<>("discount"));
        colPrice.setCellValueFactory(new PropertyValueFactory<>("unitPrice"));
    }
    
    private void callItems(String id){        
        try {
            pst = conn.prepareStatement("SELECT * FROM products WHERE ID = '" + id + "'");    
            rs = pst.executeQuery();
            while(rs.next()){
                data.add(new PosStockList(rs.getString("ID"), rs.getString("PRODUCT"), rs.getString("UNITPRICE"), rs.getString("DISCOUNT")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PosController.class.getName()).log(Level.SEVERE, null, ex);
        }
        posTable.setItems(data);   
    }   
    
    private void searchDB(){
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        clear();
        conn = MySQL.ConnectDB();
        data = FXCollections.observableArrayList();
    }       
   
    // Add to cart static variables 
    static int[] x = new int[50];
    static int i = 0;
    static double currSub = 0;
    static double currDis = 0;
    static double TOTAL = 0;
    
    @FXML
    private void addTocart(ActionEvent event) { 
    
        String id = scanIdTxt.getText();
        setCellTable();

        if (id != null){
            callItems(id);
            
            double tot ,sT = Double.valueOf(String.valueOf(colPrice.getCellData(i)));
            double d = Double.valueOf(String.valueOf(colDiscount.getCellData(i)));
            //colDiscount.setCellValueFactory(new PropertyValueFactory<>(String.valueOf(d)));
            currSub += sT;
            currDis += d ;// 100 * sT;
            TOTAL = currSub - currDis;
            
            subtotalLabel.setText(String.valueOf(currSub));
            discountLabel.setText(String.valueOf(currDis));discountLabel.setText(String.valueOf(currDis));
            totalLabel.setText(String.valueOf(TOTAL));totalLabel.setText(String.valueOf(TOTAL));
            
        }
        scanIdTxt.setText("");
        i++;                           
    } 
    @FXML
    private void clearScreen(ActionEvent event) {
        clear();     
    }
    
    private void clear(){       
        subtotalLabel.setText("0");
        discountLabel.setText("0");
        ticketNumberLabel.setText(null);
        clientNumber.setText(null);
        totalLabel.setText("0");
        i = 0;
        currSub = 0;
   }
    
    private void calculate(){        
    }
    
    private void validateScan(){
        
    }
        

    @FXML
    private void shopAddNextCust(ActionEvent event) {  
        clear();
    }
    
    
    
    
    //subtotal method
   

    //discount
    

    //total
    
    
   
    
}
