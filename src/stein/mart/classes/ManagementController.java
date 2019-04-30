/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stein.mart.classes;

import stein.mart.utilities.MySQL;
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
import stein.mart.lists.EmployeeList;

/**
 * FXML Controller class
 *
 * @author Stein
 */
public class ManagementController implements Initializable {

    ResultSet rs = null;
    Connection conn = null;
    PreparedStatement pst = null;
    private ObservableList<EmployeeList> data;
    
    @FXML
    private Button addProducts;
    @FXML
    private Button removeEmployees;
    @FXML
    private Button updateEmployees;
    @FXML
    private Button search;
    @FXML
    private TableView<EmployeeList> EmployeeTable;
    @FXML
    private TableColumn<?, ?> ID;
    @FXML
    private TableColumn<?, ?> name;
    @FXML
    private TableColumn<?, ?> gender;
    @FXML
    private TableColumn<?, ?> nat_id;
    @FXML
    private TableColumn<?, ?> department;
    @FXML
    private TableColumn<?, ?> action;

    private void setCellTable(){
        ID.setCellValueFactory(new PropertyValueFactory<>("ID"));
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        gender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        nat_id.setCellValueFactory(new PropertyValueFactory<>("nat_id"));
        department.setCellValueFactory(new PropertyValueFactory<>("department"));
    }
    
    private void loadData(){
        try {
            pst = conn.prepareStatement("SELECT * FROM  employees");
            rs = pst.executeQuery();
            while(rs.next()){
                data.add(new EmployeeList(rs.getString("ID"), rs.getString("NAME"), rs.getString("GENDER"), rs.getString("NAT_ID"), rs.getString("DEPARTMENT")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManagementController.class.getName()).log(Level.SEVERE, null, ex);
        }
        EmployeeTable.setItems(data);
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        conn = MySQL.ConnectDB();
        data = FXCollections.observableArrayList();
        setCellTable();
        loadData();
    }    

    @FXML
    private void addNewEmployee(ActionEvent event) {
    }

    @FXML
    private void deleteProducts(ActionEvent event) {
    }

    @FXML
    private void updateProducts(ActionEvent event) {
    }

    @FXML
    private void addNameToTable(ActionEvent event) {
    }
    
}
