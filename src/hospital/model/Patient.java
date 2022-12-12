/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.model;

import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author sanjaytholani
 */
public class Patient {
    String name;
    String age;
    String username;
    String address;
    String password;
    String email;
    
    public Patient(String name, String age, String username, String address, String password, String email) {
        this.setName(name);
        this.setAddress(address);
        this.setPassword(password);
        this.setUsername(username);
        this.setAge(age);
        this.setEmail(email);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void insertPatient(){
        try{
                java.sql.Statement statement = connection.JDBCConnection.Connect().createStatement();

                statement.executeUpdate("insert into AED_Final_Project.patient" + "(name, age, address, username, password, email)" + "values ('"+this.getName()+"','"+this.getAge()+"','"+this.getAddress()+"','"+this.getUsername()+"','"+this.getPassword()+"','"+this.getEmail()+"' )");
                JOptionPane.showMessageDialog(null, "User successfully added!");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());

            }
    }
    public void updatePatient(){
        try{
                java.sql.Statement statement = connection.JDBCConnection.Connect().createStatement();
                String sql = "UPDATE AED_Final_Project.patient SET name = '"+this.getName()+"',age = '"+this.getAge()+"',address = '"+this.getAddress()+"' WHERE username ='" +this.getUsername()+"'";
                statement.executeUpdate(sql);

            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());

            }
    }
    public void deletePatient(){
        try{
                java.sql.Statement statement = connection.JDBCConnection.Connect().createStatement();
                String sql = "DELETE FROM AED_Final_Project.patient WHERE username ='" +this.getUsername()+"'";
                statement.executeUpdate(sql);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());

            }
    }
}
