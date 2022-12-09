/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.model;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sanjaytholani
 */
public class User {
    String name;
    String username;
    String password;
    String role;

    public User(String name, String username, String password, String role) {
        this.setName(name);
        this.setUsername(username);
        this.setPassword(password);
        this.setRole(role);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    public void insertUser(){
        try {
            java.sql.Statement statement = connection.JDBCConnection.Connect().createStatement();
            statement.executeUpdate("insert into AED_Final_Project.user" + "(role, username, password, name)" + "values ('"+this.getRole()+"','"+this.getUsername()+"', '"+this.getPassword()+"', '"+this.getName()+"')");
        } 
        catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
            } 
    }
    public void updateUser(){
        try {
            java.sql.Statement statement = connection.JDBCConnection.Connect().createStatement();
            String sql = "UPDATE AED_Final_Project.user SET name = '"+this.getName()+"' WHERE username ='" +this.getUsername()+"'";
            statement.executeUpdate(sql);
        } 
        catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
            }
    }
    public void deleteUser(){
        try {
            java.sql.Statement statement = connection.JDBCConnection.Connect().createStatement();
            String sql = "DELETE FROM AED_Final_Project.user WHERE username ='" +this.getUsername()+"'";
            statement.executeUpdate(sql);
        } 
        catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
        }
    }
}
