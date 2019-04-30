/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stein.mart.classes;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import stein.mart.lists.StockList;

/**
 *
 * @author Stein
 */
public class Stock implements Initializable{

    private Connection conn = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;
    private ObservableList<StockList> data;

    
    @FXML
    private Button addProducts;
    @FXML
    private Button deleteProducts;
    @FXML
    private Button updateProducts;
    @FXML
    private Button search;
    @FXML
    private TableView<StockList> StockTable;
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
    private TableColumn<StockList, String>action;

     @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    
    private void productList(){
        
    }
    
    
    
    @FXML
    private void addProducts(ActionEvent event) {
    }

    @FXML
    private void deleteProducts(ActionEvent event) {
    }

    @FXML
    private void updateProducts(ActionEvent event) {
    }

    @FXML
    private void addProductsToTable(ActionEvent event) {
    }

   
    
    
    
}
