package stein.mart.utilities;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.sqlite.SQLiteDataSource;


public class MySQL {
    
    static Connection conn;
    static SQLiteDataSource ds = new SQLiteDataSource();
    public static Connection ConnectDB(){
        ds.setUrl("jdbc:sqlite:" + System.getProperty("user.dir") + "\\mart.db");
        try {
            conn = ds.getConnection();
            return conn;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }        
    } 
}
