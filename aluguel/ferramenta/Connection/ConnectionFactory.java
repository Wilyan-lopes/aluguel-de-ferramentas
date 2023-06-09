/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.aluguel.ferramenta.Connection;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class ConnectionFactory {
    
    private static final String URL = "jdbc:mysql://localhost:3306/aluguel ferramentas";
    private static final String USER = "root";
    private static final String PASS = "dunha123";
    
    
    
    public static Connection getConnection(){
        
        try{
            
            
                return DriverManager.getConnection(URL, USER, PASS);
                    
       
        }catch (SQLException ex) {
                throw new RuntimeException("Erro na conexão com o banco de dados: " + ex);
                
        }
    }
    
    public static void closeConnection(Connection conn){
        
        try {
              if(conn != null){
                  
                  conn.close();
              }  
            } catch (SQLException ex) {
                throw new RuntimeException("Erro a o encerrar conexão com o banco de dados: " + ex);
            }
    }
    
    public static void closeConnection(Connection conn, PreparedStatement stmt){
        
        closeConnection(conn);
        
        try 
        {
            if(stmt != null){
                
                stmt.close();
            }
   
            
        } catch (SQLException ex) {
                throw new RuntimeException("Erro a o encerrar conexão com o banco de dados: " + ex);
            
        }
    }
    
    public static void closeConnection(Connection conn, PreparedStatement stmt, ResultSet rs){
        
        closeConnection(conn, stmt);
        
        try 
        {
            if(rs != null){
              rs.close();  
            }
             
        
        }catch (SQLException ex) {
                throw new RuntimeException("Erro a o encerrar conexão com o banco de dados: " + ex);
   
        }
    }
            
    
}
