/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SystemAdmin;

import static assignment_2.Assignment_2.cities;
import static assignment_2.Assignment_2.community;
import static assignment_2.Assignment_2.hospitals;
import static assignment_2.Assignment_2.houses;
import assignment_2.CommunityClass;
import assignment_2.HospitalClass;
import assignment_2.HouseClass;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;
import views.HomePage;
import views.login;

/**
 *
 * @author jagru
 */
public class system_admin extends javax.swing.JFrame {

    /**
     * Creates new form system_admin
     */
    public system_admin() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Hospitals");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("City");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Community");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Users");
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

        jButton6.setText("House");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jButton6)
                .addGap(30, 30, 30)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addGap(33, 33, 33)
                .addComponent(jButton4)
                .addGap(37, 37, 37)
                .addComponent(jButton1)
                .addContainerGap(148, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(229, 229, 229))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.hide();
        ViewForm view = new ViewForm();
        view.jLabel1.setText(jButton2.getText());
//        view.jLabel1.setText("City");
        String[] columnNames = {"Cities"};
        String[][] rows = new String[cities.size()][1];
        for(int i=0;i<cities.size();i++) {
            rows[i][0] = cities.get(i);
        }
        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        view.jTable1.setModel(model);
        view.jButton2.setVisible(false);
        view.jButton3.setVisible(false);
        view.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.hide();
        ViewForm view = new ViewForm();
        view.jLabel1.setText(jButton3.getText());
        String[] columnNames = {"Community", "City"};
        String[][] rows = new String[community.size()][2];
        int i=0;
        for (HashMap.Entry<String, CommunityClass> set : community.entrySet()) {
            rows[i][0] = set.getValue().getCommunityName();
            rows[i][1] = set.getValue().getCity();
            i++;
        }
        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        view.jTable1.setModel(model);
        view.jButton2.setVisible(false);
        view.jButton3.setVisible(false);
        view.show();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.hide();
        ViewForm view = new ViewForm();
        view.jLabel1.setText(jButton1.getText());
        String[] columnNames = {"ID","Hospital Name", "Community", "City"};
        String[][] rows = new String[hospitals.size()][4];
        int i=0;
        for (HashMap.Entry<Integer, HospitalClass> set : hospitals.entrySet()) {
            int id = set.getValue().getHospitalID();
            rows[i][0] = Integer.toString(id);
            rows[i][1] = set.getValue().getHospitalName();
            rows[i][2] = set.getValue().getCommunityName();
            rows[i][3] = set.getValue().getCity();
            i++;
        }
        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        view.jTable1.setModel(model);
        view.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.hide();
        UserFrame user = new UserFrame();
        user.show();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.hide();
        HomePage home = new HomePage();
        home.show();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.hide();
        ViewForm view = new ViewForm();
        view.jLabel1.setText(jButton6.getText());
        String[] columnNames = {"House", "Community", "City"};
        String[][] rows = new String[houses.size()][3];
        int i=0;
        for (HashMap.Entry<String, HouseClass> set : houses.entrySet()) {
            rows[i][0] = set.getValue().getHouseName();
            rows[i][1] = set.getValue().getCommunityName();
            rows[i][2] = set.getValue().getCity();
            i++;
        }
        DefaultTableModel model = new DefaultTableModel (rows, columnNames);
        view.jTable1.setModel(model);
        view.jButton2.setVisible(false);
        view.jButton3.setVisible(false);
        view.show();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(system_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(system_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(system_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(system_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new system_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    // End of variables declaration//GEN-END:variables
}
