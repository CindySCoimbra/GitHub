/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import dao.ConexaoBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.cliente;
import repository.clienteRepository;


public class app {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //0 ,"Francisco Abreu","111","11","11","11","11", "11"
        cliente c = new cliente();
        ConexaoBD cb = new ConexaoBD();
        Connection conn = cb.conectar();
        
        //Statement stm = conn.createStatement
        //boolean status = stm.execute("INSERT INTO ALUNO VALUES(NULL,'João Augusto,'M','1998-08-01')");
        //if(status){
            //System.out.println("Falaha ao inserir o dado");}
        
        clienteRepository ar = new clienteRepository(conn);
        //ar.salvar(c); 
        
        List<cliente> clientes = new ArrayList<>();
        clientes = ar.listar();
        clientes.forEach(cliente -> System.out.println(cliente.getNm_cliente()));
        clientes.forEach(cliente -> System.out.println(cliente.getNT_cliente()));
        clientes.forEach(cliente -> System.out.println(cliente.getEmail_cliente()));
        clientes.forEach(cliente -> System.out.println(cliente.getAo_cliente()));
        clientes.forEach(cliente -> System.out.println(cliente.getAD_cliente()));
        clientes.forEach(cliente -> System.out.println(cliente.getDP_cliente()));
        clientes.forEach(cliente -> System.out.println(cliente.getDR_cliente()));
        
        
        
       /* 
        ConexaoBD cb = new ConexaoBD();
        Connection conn = cb.conectar();
        Statement stm= conn.createStatement();
        */
         
    }
}
   

