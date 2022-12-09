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
public class MedicineModel {

    
    int id ;
    String medicine;
    String price;
    String quantity;
    String production;
    String expiry;
    String company;
    
    public MedicineModel(int id, String medicine, String price, String quantity, String production, String expiry, String company) {
        this.setId(id);
        this.setMedicine(medicine);
        this.setPrice(price);
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
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
    
    
    
    public void insertMedicines() {
        try{
                java.sql.Statement statement = connection.JDBCConnection.Connect().createStatement();

                statement.executeUpdate("insert into AED_Final_Project.Medicine" + "(id, medicine_name, price, quantity, production_date, expiry_date, company)" + "values ('"+this.getId()+"','"+this.getMedicine()+"','"+this.getPrice()+"','"+this.getQuantity()+"','"+this.getProduction()+"','"+this.getExpiry()+" ', '"+this.getCompany()+"')");
                JOptionPane.showMessageDialog(null, "User successfully added!");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());

            }
    }
    
    public void updateMedicines(){
        try{
                java.sql.Statement statement = connection.JDBCConnection.Connect().createStatement();
                String sql = "UPDATE AED_Final_Project.Medicine SET id = '"+this.getId()+"',medicine_name = '"+this.getMedicine()+"',price = '"+this.getPrice()+"', quantity = '"+this.getQuantity()+"', production_date = '"+this.getProduction()+"', expiry_date = '"+this.getExpiry()+"', company = '"+this.getCompany()+"' WHERE id ='" +this.getId()+"'";
                statement.executeUpdate(sql);

            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());

            }
    }
    
    public void deleteMedicines(){
        try{
                java.sql.Statement statement = connection.JDBCConnection.Connect().createStatement();
                String sql = "DELETE FROM AED_Final_Project.Medicine WHERE id ='" +this.getId()+"'";
                statement.executeUpdate(sql);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());

            }
    }
      
}
