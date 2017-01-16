/*
 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;
import java.sql.SQLException;

/**
 *
 * @author anoop
 */
public class MySqlConnect {
    Connection conn= null;
    public static Connection ConnectDB() throws SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/log","root","password");
            JOptionPane.showMessageDialog(null, "Connected to database");
            return conn;
        }
        catch(ClassNotFoundException | HeadlessException e)
        {JOptionPane.showMessageDialog(null,e);
        return null;
    }
 }
}
