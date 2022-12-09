/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BloodBank.model;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author SHREYAS
 */
public class BloodBank {
    
    String DonorID;
    String Name;
    String BloodGroup;
    String Address;
    String PhoneNumber;
    


    public BloodBank(String DonorID, String Name, String BloodGroup, String Address, String PhoneNumber) {
        this.setDonorID(DonorID);
        this.setName(Name);
        this.setBloodGroup(BloodGroup);
        this.setAddress(Address);
        this.setPhoneNumber(PhoneNumber);
    }
    

    public String getDonorID() {
        return DonorID;
    }

    public void setDonorID(String DonorID) {
        this.DonorID = DonorID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getBloodGroup() {
        return BloodGroup;
    }

    public void setBloodGroup(String BloodGroup) {
        this.BloodGroup = BloodGroup;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }
    
    
    public void insertPatient(){
        try{
                java.sql.Statement statement = connection.JDBCConnection.Connect().createStatement();

                statement.executeUpdate("insert into AED_Final_Project.patient" + "(DonorID, Name, BloodGroup, Address, PhoneNumber)" + "values ('"+this.getDonorID()+"','"+this.getName()+"','"+this.getBloodGroup()+"','"+this.getAddress()+"','"+this.getPhoneNumber()+"')");
                JOptionPane.showMessageDialog(null, "User successfully added!");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());

            }
    }
    
    public void updatePatient(){
        try{
                java.sql.Statement statement = connection.JDBCConnection.Connect().createStatement();
                String sql = "UPDATE AED_Final_Project.patient SET Name = '"+this.getName()+"',BloodGroup = '"+this.getBloodGroup()+ " ',Address ='"+this.getAddress()+"',PhoneNumber = '"+this.getPhoneNumber()+"' WHERE DonorID ='" +this.getDonorID()+"'";
                statement.executeUpdate(sql);

            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());

            }
    }
    
    public void deletePatient(){
        try{
                java.sql.Statement statement = connection.JDBCConnection.Connect().createStatement();
                String sql = "DELETE FROM AED_Final_Project.patient WHERE DonorID ='" +this.getDonorID()+"'";
                statement.executeUpdate(sql);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());

            }
    }
}






    
