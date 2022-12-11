/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BloodBank.model;

import javax.swing.JOptionPane;

/**
 *
 * @author prathamesh
 */
public class DonorModel {

    
    int id;
    String name;
    String bloodgroup;
    String address;
    String phone;
    
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

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
    public DonorModel(int id, String name, String bloodgroup, String address, String phone){
        this.setId(id);
        this.setName(name);
        this.setBloodgroup(bloodgroup);
        this.setAddress(address);
        this.setPhone(phone);
        
    }
    
    public void insertDonor() {
        try{
                java.sql.Statement statement = connection.JDBCConnection.Connect().createStatement();

                statement.executeUpdate("insert into AED_Final_Project.Donor" + "(id, name, blood_group, address, phone)" + "values ('"+this.getId()+"','"+this.getName()+"','"+this.getBloodgroup()+"','"+this.getAddress()+"','"+this.getPhone()+"')");
                JOptionPane.showMessageDialog(null, "User successfully added!");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());

            }
    }
    
    public void updateDonor(){
        try{
                java.sql.Statement statement = connection.JDBCConnection.Connect().createStatement();
                String sql = "UPDATE AED_Final_Project.Donor SET id = '"+this.getId()+"',name = '"+this.getName()+"',blood_group = '"+this.getBloodgroup()+"' WHERE id ='" +this.getId()+"'";
                statement.executeUpdate(sql);

            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());

            }
    }
    public void deleteDonor(){
        try{
                java.sql.Statement statement = connection.JDBCConnection.Connect().createStatement();
                String sql = "DELETE FROM AED_Final_Project.Donor WHERE id ='" +this.getId()+"'";
                statement.executeUpdate(sql);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());

            }
    }
    
    
    
    
}
