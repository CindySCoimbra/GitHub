package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    
    public static Connection conectar()throws ClassNotFoundException{
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/fatec","root","root");
        }catch (SQLException e){
            System.err.println(""+e.getMessage());
        }
        return conn;
    }

    //public Connection conexao() {
    //    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}

}
