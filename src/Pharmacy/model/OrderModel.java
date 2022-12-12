/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pharmacy.model;

import javax.swing.JOptionPane;

/**
 *
 * @author prathamesh
 */
public class OrderModel {

    
    int id;
    String medicine;
    String quantity;
    String production;
    String expiry;
    String company; 
    
    public OrderModel (int id, String medicine, String quantity, String production, String expiry, String company) {
        this.setId(id);
        this.setMedicine(medicine);
        this.setQuantity(quantity);
        this.setProduction(production);
        this.setExpiry(expiry);
        this.setCompany(company);
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    
    
    public void insertMedicinesOrder() {
        try{
                java.sql.Statement statement = connection.JDBCConnection.Connect().createStatement();

                statement.executeUpdate("insert into AED_Final_Project.Order" + "(id, medicine_name, quantity, production_date, expiry_date, company)" + "values ('"+this.getId()+"','"+this.getMedicine()+"', '"+this.getQuantity()+"','"+this.getProduction()+"','"+this.getExpiry()+" ', '"+this.getCompany()+"')");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());

            }
    }
    
}
