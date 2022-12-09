/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Emergency.model;

import connection.JDBCConnection;
import javax.swing.JOptionPane;

/**
 *
 * @author sanjaytholani
 */
public class AmbulanceRequestModel {
    String name;
    String phone;
    String address;
    String details;

    public AmbulanceRequestModel(String name, String phone, String address, String details) {
        this.setName(name);
        this.setAddress(address);
        this.setPhone(phone);
        this.setDetails(details);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
    public void createAmbulanceRequest(){
        try{
            String query = "INSERT INTO AED_Final_Project.ambulanceRequest (name,phone,address,details) values(?,?,?,?)";
            java.sql.PreparedStatement preparedStmt = JDBCConnection.Connect().prepareStatement(query);
            preparedStmt.setString(1,this.name);            
            preparedStmt.setString(2,this.phone);
            preparedStmt.setString(3,this.address);
            preparedStmt.setString(4,this.details);
            preparedStmt.execute();
        }
         catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"please add data in correct format!");
        }  
    }
}
