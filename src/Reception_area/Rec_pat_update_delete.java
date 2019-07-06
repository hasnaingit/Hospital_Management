/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reception_area;

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
public class Rec_pat_update_delete extends javax.swing.JFrame {
DefaultTableModel model ;
    /**
     * Creates new form Rec_pat_update_delete
     */
    public Rec_pat_update_delete() {
        initComponents();
        model= new DefaultTableModel();
       stable.setModel(model);
       model.addColumn("id");
        model.addColumn("name");
        model.addColumn("age");
        model.addColumn("address");
        model.addColumn("gender");
        model.addColumn("phone");
        model.addColumn("date");
        model.addColumn("problem");
        model.addColumn("doctor_id");
        model.addColumn("doctor_name");
        model.addColumn("room_no");
        model.addColumn("fee");
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
        stable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        sdoc_id = new javax.swing.JTextField();
        sproblem = new javax.swing.JTextField();
        sdate = new javax.swing.JTextField();
        sdoc_name = new javax.swing.JTextField();
        sroom_no = new javax.swing.JTextField();
        sfee = new javax.swing.JTextField();
        sphone = new javax.swing.JTextField();
        sgender = new javax.swing.JTextField();
        saddress = new javax.swing.JTextField();
        sname = new javax.swing.JTextField();
        sid = new javax.swing.JTextField();
        sage = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        update = new javax.swing.JButton();
        sbox = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jp.setBackground(new java.awt.Color(255, 255, 255));
        jp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Manipulate Patient Table");
        jp.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 570, 40));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Patient Id");
        jp.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 110, 40));

        delete.setBackground(new java.awt.Color(153, 255, 204));
        delete.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jp.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 148, 40));

        stable.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        stable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Age", "Address", "gender", "Phone", "date", "problem", "doctor Id", "dr. Name", "Room no", "fee"
            }
        ));
        stable.setSelectionBackground(new java.awt.Color(153, 153, 153));
        stable.setSelectionForeground(new java.awt.Color(0, 204, 204));
        stable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(stable);

        jp.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 1110, 110));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("Room_no");
        jp.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 300, 80, 20));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 0));
        jLabel4.setText("Id");
        jp.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 100, 30));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 0));
        jLabel5.setText("Fee");
        jp.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 340, 80, 20));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 0));
        jLabel6.setText("Doctor_name");
        jp.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 260, 110, 20));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 0));
        jLabel7.setText("Problem");
        jp.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 160, 70, 20));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 0));
        jLabel8.setText("Date");
        jp.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 110, 60, 20));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 0));
        jLabel9.setText("Name");
        jp.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 90, 30));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 0));
        jLabel10.setText("Phone");
        jp.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 80, 20));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 0));
        jLabel11.setText("Doctor_id");
        jp.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 210, 80, 20));

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 0));
        jLabel12.setText("Age");
        jp.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 70, 30));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 0));
        jLabel13.setText("Address");
        jp.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 80, 20));

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 0));
        jLabel14.setText("Gender");
        jp.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 80, 30));

        sdoc_id.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jp.add(sdoc_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 210, 160, -1));

        sproblem.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        sproblem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sproblemActionPerformed(evt);
            }
        });
        jp.add(sproblem, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 160, 160, -1));

        sdate.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jp.add(sdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 110, 160, -1));

        sdoc_name.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jp.add(sdoc_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 260, 160, -1));

        sroom_no.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        sroom_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sroom_noActionPerformed(evt);
            }
        });
        jp.add(sroom_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 300, 160, -1));

        sfee.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        sfee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sfeeActionPerformed(evt);
            }
        });
        jp.add(sfee, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 340, 160, -1));

        sphone.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jp.add(sphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 160, -1));

        sgender.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jp.add(sgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 160, -1));

        saddress.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        saddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saddressActionPerformed(evt);
            }
        });
        jp.add(saddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 160, -1));

        sname.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jp.add(sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 160, -1));

        sid.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        sid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidActionPerformed(evt);
            }
        });
        jp.add(sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 160, -1));

        sage.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jp.add(sage, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 160, -1));

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

        sbox.setBackground(new java.awt.Color(204, 255, 204));
        jp.add(sbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 110, 30));

        jButton1.setBackground(new java.awt.Color(153, 255, 204));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton1.setText("clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jp.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jp, javax.swing.GroupLayout.DEFAULT_SIZE, 1144, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
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
           
            
        
         String query = "delete from patient  WHERE `id` = "+sid.getText();
       pst= con.prepareStatement(query);
       pst.executeUpdate();
       
        JOptionPane.showMessageDialog(rootPane, "patient removed successfully");
        }
        
        
        catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
        
        
        
    }//GEN-LAST:event_deleteActionPerformed

    private void sidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sidActionPerformed

    private void saddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saddressActionPerformed

    private void sproblemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sproblemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sproblemActionPerformed

    private void sroom_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sroom_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sroom_noActionPerformed

    private void sfeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sfeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sfeeActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
showInTable();        
        
        
    }//GEN-LAST:event_searchActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
     
         Connection con;
        PreparedStatement pst;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");
           
            
        
         String query = "UPDATE `patient` SET `name`='"+sname.getText()+"',`age`='"+sage.getText()+"',`address`='"+saddress.getText()+"',`gender`='"+sgender.getText()+"',`phone`='"+sphone.getText()+"',`date`='"+sdate.getText()+"',`problem`='"+sproblem.getText()+"',`doctor_id`='"+sdoc_id.getText()+"',`doctor_name`='"+sdoc_name.getText()+"',`room_no`='"+sroom_no.getText()+"',`fee`="+sfee.getText()+"   WHERE `id` = "+sid.getText();
       pst= con.prepareStatement(query);
       pst.executeUpdate();
       
        JOptionPane.showMessageDialog(rootPane, " patient updated successfully");
        }
        
        
        catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
        
    }//GEN-LAST:event_updateActionPerformed

    private void stableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stableMouseClicked
      
        int i = stable.getSelectedRow();

        TableModel model = stable.getModel();
        
        
         // Display Slected Row In JTexteFields
        sid.setText(model.getValueAt(i,0).toString());

        sname.setText(model.getValueAt(i,1).toString());
        sage.setText(model.getValueAt(i,2).toString());

        saddress.setText(model.getValueAt(i,3).toString());
        sgender.setText(model.getValueAt(i,4).toString());

        sphone.setText(model.getValueAt(i,5).toString());
        sdate.setText(model.getValueAt(i,6).toString());

        sproblem.setText(model.getValueAt(i,7).toString());
        sdoc_id.setText(model.getValueAt(i,8).toString());

        sdoc_name.setText(model.getValueAt(i,9).toString());
        sroom_no.setText(model.getValueAt(i,10).toString());

        sfee.setText(model.getValueAt(i,11).toString());       
    }//GEN-LAST:event_stableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      sid.setText("");
       sname.setText("");
        sage.setText("");
         saddress.setText("");
          sgender.setText("");
           sphone.setText("");
           
           sdate.setText("");
            sproblem.setText("");
             sdoc_id.setText("");
              sdoc_name.setText("");
               sroom_no.setText("");
                sfee.setText("");
                
        if(stable.getRowCount()>0){
            for (int i = stable.getRowCount()-1; i > -1; i--) {
                model.removeRow(i);                
            }
        }         
                
      
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Rec_pat_update_delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rec_pat_update_delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rec_pat_update_delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rec_pat_update_delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rec_pat_update_delete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jp;
    private javax.swing.JTextField saddress;
    private javax.swing.JTextField sage;
    private javax.swing.JTextField sbox;
    private javax.swing.JTextField sdate;
    private javax.swing.JTextField sdoc_id;
    private javax.swing.JTextField sdoc_name;
    private javax.swing.JButton search;
    private javax.swing.JTextField sfee;
    private javax.swing.JTextField sgender;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField sname;
    private javax.swing.JTextField sphone;
    private javax.swing.JTextField sproblem;
    private javax.swing.JTextField sroom_no;
    private javax.swing.JTable stable;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

public void showInTable(){
    // this code is for displaying database data into jtable. this method was called above in the SEARCH button action event;
    ResultSet rs;
    Connection con;
        PreparedStatement pst;
        String textvalue = sbox.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");
             String query= "select * from patient where id= "+textvalue; 
             pst= con.prepareStatement(query);
    
    rs= pst.executeQuery();
    
    while(rs.next()){
        model.addRow(new Object[]{rs.getInt("id"), rs.getString("name"), rs.getString("age"), rs.getString("address"), rs.getString("gender"), rs.getString("phone"), rs.getString("date"), rs.getString("problem"), rs.getInt("doctor_id"), rs.getString("doctor_name"), rs.getString("room_no"),rs.getInt("fee")});
    }             
      }                       
        catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
           
        }    
        this.pack();
}



}
