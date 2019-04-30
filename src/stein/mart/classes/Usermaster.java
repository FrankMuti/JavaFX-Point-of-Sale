/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stein.mart.classes;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Stein
 */
public class Usermaster {
    
    public SimpleStringProperty itemID = new SimpleStringProperty();

    /**
     * @return the itemID
     */
    public String getItemID() {
        return itemID.get();
    }

    
    
}
