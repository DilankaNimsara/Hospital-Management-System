/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagementSystem;

/**
 *
 * @author u
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class NurseDatabase {

    Connection conn;
    
    public static Connection connectDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\u\\Documents\\NetBeansProjects\\Progect\\HospitalManagementSystem.sqlite");
            return conn;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
        
    }
}
