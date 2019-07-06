/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rec_doctor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Walton
 */
public class Rec_Search_Doc extends javax.swing.JFrame {
DefaultTableModel model;
    /**
     * Creates new form Rec_Search_Doc
     */
    public Rec_Search_Doc() {
        initComponents();
         model= new DefaultTableModel();
       dtable.setModel(model);
       model.addColumn("id");
        model.addColumn("name");
        model.addColumn("degree");
        model.addColumn("address");
        model.addColumn("gender");
        model.addColumn("phone");
        model.addColumn("division");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dtable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ddivision = new javax.swing.JTextField();
        dgender = new javax.swing.JTextField();
        dphone = new javax.swing.JTextField();
        daddress = new javax.swing.JTextField();
        ddegree = new javax.swing.JTextField();
        dname = new javax.swing.JTextField();
        did = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        update = new javax.swing.JButton();
        dbox = new javax.swing.JTextField();
        clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jp.setBackground(new java.awt.Color(255, 255, 255));
        jp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153), 3));
        jp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Doctor Table");
        jp.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 280, 50));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Doctor Id");
        jp.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, 40));

        delete.setBackground(new java.awt.Color(153, 255, 204));
        delete.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jp.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 148, 40));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 0), 2));

        dtable.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        dtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "degree", "Address", "gender", "Phone", "division"
            }
        ));
        dtable.setSelectionBackground(new java.awt.Color(153, 153, 153));
        dtable.setSelectionForeground(new java.awt.Color(0, 204, 204));
        dtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dtable);

        jp.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 680, 110));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("Id");
        jp.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 100, 30));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 255));
        jLabel7.setText("gender");
        jp.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 70, 20));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 255));
        jLabel9.setText("Name");
        jp.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 90, 30));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 255));
        jLabel10.setText("Phone");
        jp.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 80, 20));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 255));
        jLabel11.setText("division");
        jp.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 80, 20));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 255));
        jLabel13.setText("degree");
        jp.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 80, 20));

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 255));
        jLabel14.setText("address");
        jp.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 80, 30));

        ddivision.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ddivision.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        jp.add(ddivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 160, -1));

        dgender.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        dgender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        dgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dgenderActionPerformed(evt);
            }
        });
        jp.add(dgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 160, -1));

        dphone.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        dphone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        jp.add(dphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 160, -1));

        daddress.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        daddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        jp.add(daddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 160, -1));

        ddegree.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ddegree.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        ddegree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddegreeActionPerformed(evt);
            }
        });
        jp.add(ddegree, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 160, -1));

        dname.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        dname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        jp.add(dname, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 160, -1));

        did.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        did.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        did.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                didActionPerformed(evt);
            }
        });
        jp.add(did, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 160, -1));

        search.setBackground(new java.awt.Color(153, 255, 204));
        search.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jp.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 148, 40));

        update.setBackground(new java.awt.Color(153, 255, 204));
        update.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jp.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 148, 40));

        dbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        jp.add(dbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 90, 30));

        clear.setBackground(new java.awt.Color(153, 255, 204));
        clear.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        clear.setText("clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jp.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        Connection con;
        PreparedStatement pst;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");

            String query = "delete from doctor  WHERE `id` = "+did.getText();
            pst= con.prepareStatement(query);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(rootPane, "doctor removed successfully");
        }

        catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }

    }//GEN-LAST:event_deleteActionPerformed

    private void dtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dtableMouseClicked

        int i = dtable.getSelectedRow();

        TableModel model = dtable.getModel();

        // Display Slected Row In JTexteFields
        did.setText(model.getValueAt(i,0).toString());
        dname.setText(model.getValueAt(i,1).toString());      
        ddegree.setText(model.getValueAt(i,2).toString());
        daddress.setText(model.getValueAt(i,3).toString());

        dgender.setText(model.getValueAt(i,4).toString());       
        dphone.setText(model.getValueAt(i,5).toString());
        ddivision.setText(model.getValueAt(i,6).toString());      
    }//GEN-LAST:event_dtableMouseClicked

    private void dgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dgenderActionPerformed

    private void ddegreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddegreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddegreeActionPerformed

    private void didActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_didActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_didActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        showInTable();

    }//GEN-LAST:event_searchActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        Connection con;
        PreparedStatement pst;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");

            String query = "UPDATE `doctor` SET `name`='"+dname.getText()+"',`degree`='"+ddegree.getText()+"',`address`='"+daddress.getText()+"',`gender`='"+dgender.getText()+"',`phone`='"+dphone.getText()+"',`division`="+ddivision.getText()+" WHERE `id` = "+did.getText();
            pst= con.prepareStatement(query);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(rootPane, " doctor updated successfully");
        }

        catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }

    }//GEN-LAST:event_updateActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        did.setText("");
        dname.setText("");
       
        ddegree.setText("");
        daddress.setText("");
        dphone.setText("");

     
        dgender.setText("");
        ddivision.setText("");
        

        if(dtable.getRowCount()>0){
            for (int i = dtable.getRowCount()-1; i > -1; i--) {
                model.removeRow(i);
            }
        }

    }//GEN-LAST:event_clearActionPerformed

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
            java.util.logging.Logger.getLogger(Rec_Search_Doc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rec_Search_Doc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rec_Search_Doc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rec_Search_Doc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rec_Search_Doc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JTextField daddress;
    private javax.swing.JTextField dbox;
    private javax.swing.JTextField ddegree;
    private javax.swing.JTextField ddivision;
    private javax.swing.JButton delete;
    private javax.swing.JTextField dgender;
    private javax.swing.JTextField did;
    private javax.swing.JTextField dname;
    private javax.swing.JTextField dphone;
    private javax.swing.JTable dtable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jp;
    private javax.swing.JButton search;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

public void showInTable(){
    // this code is for displaying database data into jtable. this method was called above in the SEARCH button action event;
    ResultSet rs;
    Connection con;
        PreparedStatement pst;
        String textvalue = dbox.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");
             String query= "select * from doctor where id= "+textvalue; 
             pst= con.prepareStatement(query);
    
    rs= pst.executeQuery();
    
    while(rs.next()){
        model.addRow(new Object[]{rs.getInt("id"), rs.getString("name"), rs.getString("degree"), rs.getString("address"), rs.getString("gender"), rs.getString("phone"), rs.getString("division")});
    }             
      }                       
        catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
           
        }    
        this.pack();
}






}
