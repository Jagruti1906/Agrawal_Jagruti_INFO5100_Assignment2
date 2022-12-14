/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SystemAdmin;

import SystemAdmin.system_admin;
import SystemAdmin.CreateHospital;
import SystemAdmin.CreateHouse;
import SystemAdmin.CreatePatient;
import SystemAdmin.CreateCommunityAdmin;
import SystemAdmin.CreateDoctor;
import SystemAdmin.CreateCommunity;
import SystemAdmin.CreateCity;
import static assignment_2.Assignment_2.cities;
import static assignment_2.Assignment_2.doctors;
import static assignment_2.Assignment_2.hospitals;
import static assignment_2.Assignment_2.patients;
import static assignment_2.Assignment_2.users;
import assignment_2.CityClass;
import assignment_2.DoctorClass;
import assignment_2.HospitalClass;
import assignment_2.PatientClass;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jagru
 */
public class ViewForm extends javax.swing.JFrame {

    /**
     * Creates new form ViewForm
     */
    public ViewForm() {
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jButton1)
                .addGap(49, 49, 49)
                .addComponent(jButton2)
                .addGap(46, 46, 46)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(447, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        system_admin system = new system_admin();
        if(jLabel1.getText() == "City") {
//            jLabel1.setText("City");
            this.hide();
            CreateCity city = new CreateCity();
            city.show();
        }
        else if(jLabel1.getText() == "Community") {
            this.hide();
            CreateCommunity com = new CreateCommunity();
            for(int i=0;i<cities.size();i++) {
                com.jComboBox1.addItem(cities.get(i));
            }
            com.show();
        }
        else if(jLabel1.getText() == "Hospitals") {
            this.hide();
            CreateHospital hos = new CreateHospital();
//            for(int i=0;i<hospitals.size();i++) {
//                hos.jComboBox1.addItem(hospitals.get(i));
//            }
            for(int i=0;i<cities.size();i++) {
                hos.jComboBox1.addItem(cities.get(i));
            }
            hos.show();
        }
        else if(jLabel1.getText() == "Doctor") {
            this.hide();
            CreateDoctor doc = new CreateDoctor();
            for(int i=0;i<cities.size();i++) {
                doc.jComboBox1.addItem(cities.get(i));
            }
            doc.show();
        }
        else if(jLabel1.getText() == "Patient") {
            this.hide();
            CreatePatient patient = new CreatePatient();
            for(int i=0;i<cities.size();i++) {
                patient.jComboBox1.addItem(cities.get(i));
            }
            patient.show();
        }
        else if(jLabel1.getText() == "Community Admin") {
            this.hide();
            CreateCommunityAdmin communityAdmin = new CreateCommunityAdmin();
            for(int i=0;i<cities.size();i++) {
                communityAdmin.jComboBox1.addItem(cities.get(i));
            }
            communityAdmin.show();
        }
        else if(jLabel1.getText() == "House") {
            this.hide();
            CreateHouse house = new CreateHouse();
            for(int i=0;i<cities.size();i++) {
                house.jComboBox1.addItem(cities.get(i));
            }
            house.show();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.hide();
        system_admin system = new system_admin();
        system.show();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.hide();
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRowCount() == 1) {
            if(jLabel1.getText() == "Hospitals") {
                int id = Integer.parseInt(tableModel.getValueAt(jTable1.getSelectedRow(), 0).toString());
                CreateHospital hosp = new CreateHospital();
                for (HashMap.Entry<Integer, HospitalClass> set : hospitals.entrySet()) {
                    if(set.getValue().getHospitalID()== id) {
                        hosp.jTextField4.setText(Integer.toString(set.getValue().getHospitalID()));
                        hosp.jTextField4.setEnabled(false);
                        hosp.jTextField1.setText(set.getValue().getHospitalName());
                        hosp.jComboBox1.addItem(set.getValue().getCity());
                        hosp.jComboBox1.setEnabled(false);
                        hosp.jComboBox2.addItem(set.getValue().getCommunityName());
                        hosp.jComboBox2.setEnabled(false);
                        hosp.jTextField2.setText(Integer.toString(set.getValue().getZip()));
                        hosp.jTextField2.setEnabled(false);
                    }
                }
                hosp.show();
            }
            else if(jLabel1.getText() == "Doctor") {
                int id = Integer.parseInt(tableModel.getValueAt(jTable1.getSelectedRow(), 0).toString());
                CreateDoctor doc = new CreateDoctor();
                for (HashMap.Entry<String, DoctorClass> set : doctors.entrySet()) {
                    if(set.getValue().getDoctorID()==id) {
                        doc.jTextField1.setText(set.getValue().getName());
                        doc.jTextField2.setText(Integer.toString(set.getValue().getAge()));
                        doc.jTextField3.setText(set.getValue().getUsername());
                        doc.jTextField3.setEnabled(false);
                        doc.jTextField4.setText(set.getValue().getHouseName());
                        doc.jTextField5.setText(Integer.toString(set.getValue().getZip()));
                        doc.jTextField6.setText(Integer.toString(set.getValue().getDoctorID()));
                        doc.jTextField6.setEnabled(false);
                        for(int i=0;i<cities.size();i++) {
                            doc.jComboBox1.addItem(cities.get(i));
                        }
                        String pass = users.get(set.getValue().getUsername()).getPassword();
                        doc.jTextField7.setText(pass);
                    }
                }
                doc.show();
            }
        }
        else {
            system_admin system = new system_admin();
            system.show();
            if(jTable1.getSelectedRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "The table is empty or select a row.");
            }
            else {
                JOptionPane.showMessageDialog(this, "Select one row at a time.");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRowCount() == 1) {
            if(jLabel1.getText() == "Doctor") {
                int id = Integer.parseInt(tableModel.getValueAt(jTable1.getSelectedRow(), 0).toString());
                for (HashMap.Entry<String, DoctorClass> set : doctors.entrySet()) {
                    if(set.getValue().getDoctorID() == id) {
                        doctors.remove(set.getKey());
                        tableModel.removeRow(jTable1.getSelectedRow());
                    }
                }
            } 
            else if(jLabel1.getText() == "Patient") {
                int id = Integer.parseInt(tableModel.getValueAt(jTable1.getSelectedRow(), 0).toString());
                for (HashMap.Entry<String, PatientClass> set : patients.entrySet()) {
                    if(set.getValue().getPatientID()== id) {
                        patients.remove(set.getKey());
                        tableModel.removeRow(jTable1.getSelectedRow());
                    }
                }
            }
            else if(jLabel1.getText() == "Hospitals") {
                String name = tableModel.getValueAt(jTable1.getSelectedRow(), 1).toString();
                int id = Integer.parseInt(tableModel.getValueAt(jTable1.getSelectedRow(), 0).toString());
                hospitals.remove(id);
                tableModel.removeRow(jTable1.getSelectedRow());
                for (HashMap.Entry<String, DoctorClass> set1 : doctors.entrySet()) {
                    if(set1.getValue().getHospitalName()== name) {
                        doctors.remove(set1.getKey());
                    }
                }
            }
        }
        else {
            if(jTable1.getSelectedRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "The table is empty or select a row.");
            }
            else {
                JOptionPane.showMessageDialog(this, "Select one row at a time.");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
