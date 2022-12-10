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
public class AmbulanceModel {
    String id;
    String area;
    String password;
    public AmbulanceModel(String id, String area) {
        this.setArea(area);
        this.setId(id);
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void createAmbulance(){
            try{
                String query = "INSERT INTO AED_Final_Project.ambulance (id,area,password) values(?,?,?)";
                java.sql.PreparedStatement preparedStmt = connection.JDBCConnection.Connect().prepareStatement(query);
                preparedStmt.setString(1,this.id);
                preparedStmt.setString(2,this.area);
                preparedStmt.setString(3,this.password);
                preparedStmt.execute();
            }
            catch(Exception e){
                System.out.println(e);
                JOptionPane.showMessageDialog(null,"please add data in correct format!");
        } 
    }
    public void updateAmbulance(){
            try{
                java.sql.Statement statement = JDBCConnection.Connect().createStatement();
                String profQuery = "UPDATE AED_Final_Project.ambulance SET area = '"+this.area+"', id = '"+this.id+"' WHERE id='"+this.id+"'";
                statement.executeUpdate(profQuery);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);

            }
    }
    public void deleteAmbulance(){
        try{
            java.sql.Statement statement = JDBCConnection.Connect().createStatement();
            String profQuery = "DELETE FROM AED_Final_Project.ambulance WHERE id='"+this.id+"'";
            statement.executeUpdate(profQuery);
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
            }
    }
}
