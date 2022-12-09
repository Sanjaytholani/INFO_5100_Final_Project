/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.model;

import javax.swing.JOptionPane;

/**
 *
 * @author sanjaytholani
 */
public class Appointment {
    String doctor;
    String patient;
    int id;
    String status;
    String prescription;
    public Appointment(String doctor, String patient) {
        this.setDoctor(doctor);
        this.setPatient(patient);
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }
    
    public void createAppointment(){
        try{
                java.sql.Statement statement = connection.JDBCConnection.Connect().createStatement();

                statement.executeUpdate("insert into AED_Final_Project.appointment" + "(doctor, patient)" + "values ('"+this.getDoctor()+"', '"+this.getPatient()+"')");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
            }
    }
    public void updateAppointment(){
        try{
                java.sql.Statement statement = connection.JDBCConnection.Connect().createStatement();
                String sql = "UPDATE AED_Final_Project.appointment SET doctor = '"+this.doctor+"', patient = '"+this.patient+"' WHERE id ='" +this.id+"'";
                statement.executeUpdate(sql);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
            }
    }
    public void deleteAppointment(){
         try{
                java.sql.Statement statement = connection.JDBCConnection.Connect().createStatement();
                String sql = "DELETE FROM AED_Final_Project.appointment WHERE id ='" +this.id+"'";
                statement.executeUpdate(sql);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
            }
    }
}
