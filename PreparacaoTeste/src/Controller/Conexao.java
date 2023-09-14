/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Celso Mongane
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class Conexao{
    private static final String url = "jdbc:mysql://localhost:3306/escola";
    private static final String user = "root";
    private static final String password ="celsosebastiao@";
    
    public static  Connection conn;
       
    public static Connection getConexao(){
        try {
            if(conn == null){// se a conexao for igual a nulo ele vai criar a conexao e retorna se nao ele so retorna, 
                conn = DriverManager.getConnection(url, user, password);// 
                return conn;
            }else{
                return conn;
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}