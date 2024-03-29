/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reception_area;

import Admin_area.DBConnection;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Walton
 */
public class Rec_pat_bill extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    /**
     * Creates new form Rec_pat_bill
     */
    public Rec_pat_bill() {
        initComponents();
con=DBConnection.getDBConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        barea = new javax.swing.JTextArea();
        bday = new javax.swing.JTextField();
        bbed = new javax.swing.JTextField();
        bdoctor = new javax.swing.JTextField();
        bpathe = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bextra = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        bid = new javax.swing.JTextField();
        blabfee = new javax.swing.JTextField();
        bname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        total_cost = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Patient Bill");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 157, 29));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("Id");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 90, 20));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 90, 20));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("lab-fee");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 90, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("pathelogy fee");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 153));
        jLabel9.setText("total day");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 90, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 153));
        jLabel10.setText("doctor fee");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 100, -1));

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 153));
        jLabel14.setText("bed fee");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 90, -1));

        jButton1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 255));
        jButton1.setText("generate bill");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, 150, 38));

        jButton2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 255));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 100, 38));

        barea.setColumns(20);
        barea.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        barea.setRows(5);
        barea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane1.setViewportView(barea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 400, 480));

        bday.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 153)));
        jPanel1.add(bday, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 144, 30));

        bbed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 153)));
        bbed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbedActionPerformed(evt);
            }
        });
        jPanel1.add(bbed, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 144, 30));

        bdoctor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 153)));
        jPanel1.add(bdoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 144, 30));

        bpathe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 153)));
        jPanel1.add(bpathe, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 144, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Dhaka City Hospital");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 410, 47));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 153));
        jLabel8.setText("Extra charge");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 100, -1));

        bextra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 153)));
        bextra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bextraActionPerformed(evt);
            }
        });
        jPanel1.add(bextra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 144, 30));

        jButton3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 255));
        jButton3.setText("print");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, 90, 38));

        bid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 153)));
        bid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bidActionPerformed(evt);
            }
        });
        jPanel1.add(bid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 144, 30));

        blabfee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 153)));
        blabfee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blabfeeActionPerformed(evt);
            }
        });
        jPanel1.add(blabfee, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 144, 30));

        bname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 153)));
        bname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnameActionPerformed(evt);
            }
        });
        jPanel1.add(bname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 144, 30));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 153));
        jLabel7.setText("total cost");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 80, 30));

        total_cost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 153)));
        jPanel1.add(total_cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bbedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bbedActionPerformed

    private void bextraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bextraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bextraActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        barea.setText(barea.getText() + "\n");
        barea.setText(barea.getText() + "\n");
        barea.setText(barea.getText() + "                           Dhaka City Hospital              \n");
        barea.setText(barea.getText() + "                               Total Bill                     \n");
        Date obj = new Date();
        String date = obj.toString();
        barea.setText(barea.getText() + "\n");
        barea.setText(barea.getText() + "             " + date + "      \n");
        barea.setText(barea.getText() + " ---------------------------------------------\n");
        barea.setText(barea.getText() + "             Patient Id        : " + bid.getText() + "\n");
        barea.setText(barea.getText() + "             Patient Name   : " + bname.getText() + "\n");
        barea.setText(barea.getText() + "             Total days        : " + bday.getText() + "\n");
        barea.setText(barea.getText() + " -------------------------------------------- \n");
        barea.setText(barea.getText() + "\n");

        barea.setText(barea.getText() + "            Lab fee                :" + blabfee.getText() + "\n");
        barea.setText(barea.getText() + "            Pathelogy fee      :" + bpathe.getText() + "\n");
        barea.setText(barea.getText() + "            Doctor fee           :" + bdoctor.getText() + "\n");
        barea.setText(barea.getText() + "            Bed fee                :" + bbed.getText() + "\n");
        barea.setText(barea.getText() + "            Extra charge        :" + bextra.getText() + "\n");

        barea.setText(barea.getText() + "------------------------------------------- \n");

        int l, p, d, b, e, total;

        l = Integer.parseInt(blabfee.getText());
        p = Integer.parseInt(bpathe.getText());
        d = Integer.parseInt(bdoctor.getText());
        b = Integer.parseInt(bbed.getText());
        e = Integer.parseInt(bextra.getText());
        total = (l + p + d + b + e);

        barea.setText(barea.getText() + "   the total fee is               " + total + "                         \n");
        barea.setText(barea.getText() + "\n");
        barea.setText(barea.getText() + "\n");

        barea.setText(barea.getText() + "--------Thank you , Come Again--------\n");

save();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            barea.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Rec_pat_bill.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void bidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bidActionPerformed

    private void blabfeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blabfeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blabfeeActionPerformed

    private void bnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bnameActionPerformed

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
            java.util.logging.Logger.getLogger(Rec_pat_bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rec_pat_bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rec_pat_bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rec_pat_bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rec_pat_bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea barea;
    private javax.swing.JTextField bbed;
    private javax.swing.JTextField bday;
    private javax.swing.JTextField bdoctor;
    private javax.swing.JTextField bextra;
    private javax.swing.JTextField bid;
    private javax.swing.JTextField blabfee;
    private javax.swing.JTextField bname;
    private javax.swing.JTextField bpathe;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField total_cost;
    // End of variables declaration//GEN-END:variables

    public void save() {
        try {
            String query = "insert into bill(id, name,labfee,pathology_fee,doctor_fee,bed_fee,extra_fee, total_day,total_cost)values(?,?,?,?,?,?,?,?,?) ";

            pst = con.prepareStatement(query);
            int id = Integer.parseInt(bid.getText());
            pst.setInt(1, id);

            pst.setString(2, bname.getText());
            pst.setString(3, blabfee.getText());
            pst.setString(4, bpathe.getText());
            pst.setString(5, bdoctor.getText());
            pst.setString(6, bbed.getText());
            pst.setString(7, bextra.getText());
            int day = Integer.parseInt(bday.getText());
            pst.setInt(8, day);
            int total = Integer.parseInt(total_cost.getText());
            pst.setInt(9, total);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Successful saved");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
}
