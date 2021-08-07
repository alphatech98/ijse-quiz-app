/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *  @version 1.0.0
 */
package config;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jayampathi
 */
public class DbConnection {
    private static DbConnection dBConnection;
    private Connection con;
    
    
    private DbConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pos_ijse","root","root");
    }
    
    public static DbConnection getInstance() throws ClassNotFoundException, SQLException{
        return dBConnection==null ? dBConnection=new DbConnection() : dBConnection;
    }
    
    public Connection getConnection(){
        return con;
    }
    
}
