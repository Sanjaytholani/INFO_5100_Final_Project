/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Emergency;

import connection.JDBCConnection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ashis
 */
public class Ambulance extends javax.swing.JFrame {

    /**
     * Creates new form crimeAction
     */
    public Ambulance() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        phoneTxt = new javax.swing.JTextField();
        addressTxt = new javax.swing.JTextField();
        cdTxt = new javax.swing.JTextField();
        ambulanceNoTxt = new javax.swing.JTextField();
        actionTxt = new javax.swing.JTextField();
        viewBtn = new javax.swing.JButton();
        submitBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cbBloodgroup = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        requestBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Id", "Name", "Phone", "Address", "Details"
            }
        ));
        requestTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requestTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(requestTable);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Phone");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Address");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Details");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Ambulance No");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Action Taken");

        nameTxt.setEditable(false);

        phoneTxt.setEditable(false);

        addressTxt.setEditable(false);
        addressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTxtActionPerformed(evt);
            }
        });

        cdTxt.setEditable(false);
        cdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdTxtActionPerformed(evt);
            }
        });

        ambulanceNoTxt.setEditable(false);

        viewBtn.setText("View Record");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Ambulance");

        cbBloodgroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O", "O+" }));
        cbBloodgroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBloodgroupActionPerformed(evt);
            }
        });

        jLabel8.setText("Blood Group");

        requestBtn.setText("Request Blood ");
        requestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(actionTxt)
                    .addComponent(ambulanceNoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(cdTxt)
                    .addComponent(addressTxt)
                    .addComponent(phoneTxt)
                    .addComponent(nameTxt))
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(viewBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitBtn)
                .addGap(186, 186, 186))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(requestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbBloodgroup, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ambulanceNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(actionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBloodgroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(requestBtn)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
          DefaultTableModel tb1Model = (DefaultTableModel)requestTable.getModel();
        tb1Model.setRowCount(0);
        try{
            java.sql.Statement statement = JDBCConnection.Connect().createStatement();
            String studentQuery = "SELECT * FROM AED_Final_Project.ambulanceRequest";
            java.sql.ResultSet requestData = statement.executeQuery(studentQuery);

            while(requestData.next()){
                String id=Integer.toString(requestData.getInt("id"));
                String  name = requestData.getString("name");
                String phone = requestData.getString("phone");
                String address = requestData.getString("address");
                String details = requestData.getString("details");

                
                String tbData[] = {id,name, phone,address,details};
                
                tb1Model.addRow(tbData);
            }
            
         }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
         }       
    }//GEN-LAST:event_viewBtnActionPerformed

    private void addressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTxtActionPerformed

    private void cdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cdTxtActionPerformed

    private void requestTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tb1Model = (DefaultTableModel)requestTable.getModel();
        
        String tb1name = tb1Model.getValueAt(requestTable.getSelectedRow(),0).toString();
       
        String tb1phone = tb1Model.getValueAt(requestTable.getSelectedRow(),1).toString();
        String tb1address = tb1Model.getValueAt(requestTable.getSelectedRow(),2).toString();
        String tb1cd = tb1Model.getValueAt(requestTable.getSelectedRow(),3).toString();
        nameTxt.setText(tb1name);
        phoneTxt.setText(tb1phone);
        addressTxt.setText(tb1address);
        cdTxt.setText(tb1cd);      
    }//GEN-LAST:event_requestTableMouseClicked

    
    
        
        
    public void UpdateAmbulanceRequest(String name, String phone, String address, String cd, String ambulance, String action){
            
             try{
            java.sql.Statement statement = JDBCConnection.Connect().createStatement();
            int id=Integer.parseInt(requestTable.getValueAt(requestTable.getSelectedRow(), 0).toString());
            String query="UPDATE AED_Final_Project.ambulanceRequest SET ambulance = '"+ambulanceNoTxt.getText()+"', action='"+ action +"' WHERE id ='"+id+"'";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(rootPane, "Status Updated");

        }
        catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"please add data in correct format!");
        }      
             
        }
    
    
    
    
    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        
        String name = nameTxt.getText();
        String phone = phoneTxt.getText();
        String address = addressTxt.getText();
        String cd = cdTxt.getText();
        String ambulance = ambulanceNoTxt.getText();
        String action = actionTxt.getText();
        
        if(addressTxt.getText().isEmpty()|| nameTxt.getText().isEmpty()||phoneTxt.getText().isEmpty()||cdTxt.getText().isEmpty()           ){
                 JOptionPane.showMessageDialog(null, "Please Enter All Details!");

        
        } else{

        
        // Community.CreateCommunity(house,person,community,city,hospital);
         UpdateAmbulanceRequest(name,phone,address,cd,ambulance,action);
        }
        
//        DefaultTableModel tb1Model = (DefaultTableModel)crimeTable.getModel();
//        if(crimeTable.getSelectedRowCount()== 1){
//            String name = nameTxt.getText();
//            String phone = phoneTxt.getText();
//            String address = addressTxt.getText();
//            String cd = cdTxt.getText();
//            
//            
//            
//            tb1Model.setValueAt(name,crimeTable.getSelectedRow(), 0);
//            tb1Model.setValueAt(phone,crimeTable.getSelectedRow(), 1);
//            tb1Model.setValueAt(address,crimeTable.getSelectedRow(), 2);
//            tb1Model.setValueAt(cd,crimeTable.getSelectedRow(), 3);
//            
//            
//            JOptionPane.showMessageDialog(this,"Update Successfully");
//
//            
//        }else{
//            if(crimeTable.getRowCount()== 0){
//                     JOptionPane.showMessageDialog(this,"Table is Empty");
//
//            }else{
//                     JOptionPane.showMessageDialog(this,"Please Select Single Row for Update");
//
//            }
//        }




    }//GEN-LAST:event_submitBtnActionPerformed

    private void cbBloodgroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBloodgroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbBloodgroupActionPerformed

    private void requestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestBtnActionPerformed
        // TODO add your handling code here:
        try{
            java.sql.Statement statement = connection.JDBCConnection.Connect().createStatement();
            String query="SELECT * from AED_Final_Project.Donor WHERE BLOOD_GROUP='"+cbBloodgroup.getSelectedItem().toString()+"'";
             ResultSet resultset = statement.executeQuery(query);
             if(resultset.next()){
                 JOptionPane.showMessageDialog(rootPane, "Blood Group Available and will be provided!!");
             }
             else{
                JOptionPane.showMessageDialog(rootPane, "Blood Group Not Available");

             }
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
                setVisible(false);

            }
    }//GEN-LAST:event_requestBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ambulance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ambulance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ambulance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ambulance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ambulance().setVisible(true);
            }
        });
    }
    public void setDetails(String ambulanceNo){
        ambulanceNoTxt.setText(ambulanceNo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField actionTxt;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JTextField ambulanceNoTxt;
    private javax.swing.JComboBox<String> cbBloodgroup;
    private javax.swing.JTextField cdTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JButton requestBtn;
    private javax.swing.JTable requestTable;
    private javax.swing.JButton submitBtn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
