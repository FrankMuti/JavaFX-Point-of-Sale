/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stein.mart.classes;

import stein.mart.utilities.MySQL;
import stein.mart.lists.StockList;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 * FXML Controller class
 *
 * @author Stein
 */
public class StockController implements Initializable {
    
    ResultSet rs = null;
    Connection conn = null;
    PreparedStatement pst = null;
    private ObservableList<StockList> data;
    

    @FXML
    private Button updateProducts;
    @FXML
    private TableColumn<StockList, String> ID;
    @FXML
    private TableColumn<StockList, String> product;
    @FXML
    private TableColumn<StockList, String> unitPrice;
    @FXML
    private TableColumn<StockList, String> discount;
    @FXML
    private TableColumn<StockList, String> stockLeft;
    @FXML
    private TableView<StockList> StockTable;
    @FXML
    private Button addProducts;
    @FXML
    private Button deleteProducts;
    @FXML
    private Button search;
    @FXML
    private TableColumn<?, ?> action;

     
    private void setCellTable(){
        ID.setCellValueFactory(new PropertyValueFactory<>("ID"));
        product.setCellValueFactory(new PropertyValueFactory<>("product"));
        unitPrice.setCellValueFactory(new PropertyValueFactory<>("unitPrice"));
        discount.setCellValueFactory(new PropertyValueFactory<>("discount"));
        stockLeft.setCellValueFactory(new PropertyValueFactory<>("stockLeft"));
        
    }
    
    private void loadData(){
        try {
            pst = conn.prepareStatement("SELECT * FROM products");

            rs = pst.executeQuery();
            while(rs.next()){
                data.add(new StockList(rs.getString("ID"), rs.getString("PRODUCT"), rs.getString("UNITPRICE"), rs.getString("DISCOUNT"), rs.getString("STOCKLEFT")));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StockController.class.getName()).log(Level.SEVERE, null, ex);
        }
        StockTable.setItems(data);
    }
     
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        conn = MySQL.ConnectDB();
       data = FXCollections.observableArrayList();        
        setCellTable();
        loadData();
    }    

    @FXML
    private void addProducts(ActionEvent event) {
        conn = MySQL.ConnectDB();
        data = FXCollections.observableArrayList();        
        setCellTable();
        loadData();
        
        System.out.print("added products");
    }


    @FXML
    private void updateProducts(ActionEvent event) {
    }

    @FXML
    private void deleteProducts(ActionEvent event) {
    }

    @FXML
    private void addProductsToTable(ActionEvent event) {
    }

    

    

    
}
































