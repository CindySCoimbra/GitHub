/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author coimb
 */
public class cliente {
    private int id_cliente;
    private String nm_cliente;
  
    //contato
    private String NT_cliente;
    private String email_cliente;
    
    //Viagem
    private String Ao_cliente;
    private String AD_cliente;
    private String DP_cliente;
    private String DR_cliente;
    
    // Construtor
    public cliente(int id_cliente, String nm_cliente, String NT_cliente, String email_cliente, String Ao_cliente, String AD_cliente, String DP_cliente, String DR_cliente) {
        this.id_cliente = id_cliente;
        this.nm_cliente = nm_cliente;
        this.NT_cliente = NT_cliente;
        this.email_cliente = email_cliente;
        this.Ao_cliente = Ao_cliente;
        this.AD_cliente = AD_cliente;
        this.DP_cliente = DP_cliente;
        this.DR_cliente = DR_cliente;
    }

    public cliente() {
    //    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //Getters and setters
    
    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNm_cliente() {
        return nm_cliente;
    }

    public void setNm_cliente(String nm_cliente) {
        this.nm_cliente = nm_cliente;
    }

    public String getNT_cliente() {
        return NT_cliente;
    }

    public void setNT_cliente(String NT_cliente) {
        this.NT_cliente = NT_cliente;
    }

    public String getEmail_cliente() {
        return email_cliente;
    }

    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }

    public String getAo_cliente() {
        return Ao_cliente;
    }

    public void setAo_cliente(String Ao_cliente) {
        this.Ao_cliente = Ao_cliente;
    }

    public String getAD_cliente() {
        return AD_cliente;
    }

    public void setAD_cliente(String AD_cliente) {
        this.AD_cliente = AD_cliente;
    }

    public String getDP_cliente() {
        return DP_cliente;
    }

    public void setDP_cliente(String DP_cliente) {
        this.DP_cliente = DP_cliente;
    }

    public String getDR_cliente() {
        return DR_cliente;
    }

    public void setDR_cliente(String DR_cliente) {
        this.DR_cliente = DR_cliente;
    }
  
}