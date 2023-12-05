/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.cliente;
import java.sql.Connection;


/**
 *
 * @author coimb
 */
public class clienteRepository {
    private Connection connection;
    
    public clienteRepository(Connection connection){
        this.connection = connection;
    }
    
    public void salvar(cliente cliente) throws SQLException{
        String sql = "INSERT INTO cliente(nm_cliente, NT_cliente, email__cliente, Ao_cliente, AD_cliente, DP_cliente,DR_cliente) VALUES(?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        //statement.setInt(0, cliente.getId_cliente());
        statement.setString(1,cliente.getNm_cliente());
        statement.setString(2,cliente.getNT_cliente());
        statement.setString(3,cliente.getEmail_cliente());
        statement.setString(4,cliente.getAo_cliente());
        statement.setString(5,cliente.getAD_cliente());
        statement.setString(6,cliente.getDP_cliente());
        statement.setString(7,cliente.getDR_cliente());
        statement.executeUpdate();
        
        //id_cliente INT  PRIMARY KEY AUTO_INCREMENT,nm_cliente VARCHAR (255),NT_cliente VARCHAR(10),email__cliente VARCHAR(100),Ao_cliente VARCHAR (100), AD_cliente VARCHAR (100), DP_cliente VARCHAR (20), DR_cliente
    }
    
    public List<cliente> listar() throws SQLException{
        String sql = "SELECT * FROM cliente";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery(sql);
        List<cliente> clientes = new ArrayList<>();
        while (resultSet.next()) {
            cliente cliente = new cliente();
            cliente.setId_cliente(resultSet.getInt("id_aluno"));
            cliente.setNm_cliente(resultSet.getString("nm_cliente"));
            cliente.setNT_cliente(resultSet.getString("NT_cliente"));
            cliente.setEmail_cliente(resultSet.getString("email_cliente"));
            cliente.setAo_cliente(resultSet.getString("Ao_cliente"));
            cliente.setAD_cliente(resultSet.getString("AD_cliente"));
            cliente.setDP_cliente(resultSet.getString("DP_cliente"));
            cliente.setDR_cliente(resultSet.getString("DR_cliente"));
            
            clientes.add(cliente); 
        } 
        return clientes;
    }
}

