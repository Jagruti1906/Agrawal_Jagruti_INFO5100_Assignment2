/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CommunityAdmin;

import assignment_2.Assignment_2;
import static assignment_2.Assignment_2.doctors;
import static assignment_2.Assignment_2.hospitals;
import static assignment_2.Assignment_2.houses;
import static assignment_2.Assignment_2.patients;
import assignment_2.DoctorClass;
import assignment_2.HospitalClass;
import assignment_2.HouseClass;
import assignment_2.PatientClass;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;
import views.HomePage;
import views.login;

/**
 *
 * @author jagru
 */
public class CommunityAdmin extends javax.swing.JFrame {
    
    /**
     * Creates new form CommunityAdmin
     */
    public CommunityAdmin() {
        initComponents();
        if(Assignment_2.comName.length() > 0) {
            jLabel1.setText(Assignment_2.comName);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Hospitals");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Doctors");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Patients");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("House");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Logout");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(139, 139, 139))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(32, 32, 32)
                        .addComponent(jButton2)
                        .addGap(44, 44, 44)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addComponent(jButton4)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void getCom(String communityName, String cityName) {
        jLabel1.setText(communityName);
        Assignment_2.comName = communityName;
        Assignment_2.cityName = cityName;
    }
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.hide();
        HomePage home = new HomePage();
        home.show();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.hide();
        ViewComForm view = new ViewComForm();
        view.jLabel1.setText(jButton1.getText());
        String[] columnNames = {"Hospital Name"};
        String[][] rows = new String[hospitals.size()][1];
        int i=0;
        for (HashMap.Entry<String, HospitalClass> set : hospitals.entrySet()) {
            if(set.getValue().getCommunityName().equals(jLabel1.getText())) {
                rows[i][0] = set.getValue().getHospitalName();
                i++;
            }
        }
        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        view.jTable1.setModel(model);
        view.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.hide();
        ViewComForm view = new ViewComForm();
        view.jLabel1.setText(jButton2.getText());
        String[] columnNames = {"Name", "Hospital Name"};
        String[][] rows = new String[doctors.size()][2];
        int i=0;
        for (HashMap.Entry<String, DoctorClass> set : doctors.entrySet()) {
            if(set.getValue().getCommunityName().equals(jLabel1.getText())) {
                rows[i][0] = set.getValue().getName();
                rows[i][1] = set.getValue().getHospitalName();
                i++;
            }
        }
        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        view.jTable1.setModel(model);
        view.jButton1.setVisible(false);
        view.jButton2.setVisible(false);
        view.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.hide();
        ViewComForm view = new ViewComForm();
        view.jLabel1.setText(jButton3.getText());
        String[] columnNames = {"Name", "House"};
        String[][] rows = new String[patients.size()][2];
        int i=0;
        for (HashMap.Entry<String, PatientClass> set : patients.entrySet()) {
            if(set.getValue().getCommunityName().equals(jLabel1.getText())) {
                rows[i][0] = set.getValue().getName();
                rows[i][1] = set.getValue().getHouseName();
                i++;
            }
        }
        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        view.jTable1.setModel(model);
        view.jButton1.setVisible(false);
        view.jButton2.setVisible(false);
        view.show();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.hide();
        ViewComForm view = new ViewComForm();
        view.jLabel1.setText(jButton4.getText());
        String[] columnNames = {"House"};
        String[][] rows = new String[houses.size()][1];
        int i=0;
        for (HashMap.Entry<String, HouseClass> set : houses.entrySet()) {
            if(set.getValue().getCommunityName().equals(jLabel1.getText())) {
                rows[i][0] = set.getValue().getHouseName();
                i++; 
            }
        }
        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        view.jTable1.setModel(model);
        view.show();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(CommunityAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CommunityAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CommunityAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CommunityAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommunityAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
