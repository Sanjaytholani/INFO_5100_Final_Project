/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pharmacy.model;

import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author prathamesh
 */
public class CompanyModel {

   
    int id;
    String name;
    String address;
    String expertise;
    String phone;
    String location;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    
    public CompanyModel(int id, String name, String address, String expertise, String phone, String location) {
        this.setId(id);
        this.setName(name);
        this.setAddress(address);
        this.setExpertise(expertise);
        this.setPhone(phone);
        this.setLocation(location);
        
        
    }
    
    public void insertCompanies() {
        try{
                java.sql.Statement statement = connection.JDBCConnection.Connect().createStatement();

                statement.executeUpdate("insert into AED_Final_Project.Company" + "(id, name, address, expertise, phone, location)" + "values ('"+this.getId()+"','"+this.getName()+"','"+this.getAddress()+"','"+this.getExpertise()+"','"+this.getPhone()+"','"+this.getLocation()+" ')");
                JOptionPane.showMessageDialog(null, "User successfully added!");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());

            }
    }
    
    public void updateCompanies(){
        try{
                java.sql.Statement statement = connection.JDBCConnection.Connect().createStatement();
                String sql = "UPDATE AED_Final_Project.Company SET id = '"+this.getId()+"',name = '"+this.getName()+"',address = '"+this.getAddress()+"', expertise = '"+this.getExpertise()+"', phone = '"+this.getPhone()+"', location = '"+this.getLocation()+"' WHERE id ='" +this.getId()+"'";
                statement.executeUpdate(sql);

            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());

            }
    }
    
    public void deleteCompanies(){
        try{
                java.sql.Statement statement = connection.JDBCConnection.Connect().createStatement();
                String sql = "DELETE FROM AED_Final_Project.Company WHERE id ='" +this.getId()+"'";
                statement.executeUpdate(sql);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());

            }
    }
    
}
