/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hey;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Dell
 */
public class supplier extends javax.swing.JFrame {
    private static final String USERNAME="root";
private static final String PASSWORD="aaashi789";
private static final String CONN_STRING=
        "jdbc:mysql://localhost:3306/project?autoRecconnect=true&useSSL=false";


    /**
     * Creates new form supplier
     */
    public supplier() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jToggleButton3 = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        jToggleButton4 = new javax.swing.JToggleButton();
        txtsuppid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtsuppname = new javax.swing.JTextField();
        jToggleButton5 = new javax.swing.JToggleButton();
        suppadd = new javax.swing.JTextField();
        suppemail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        suppcont = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel5.setText("E-mail");

        jToggleButton3.setText("DELETE");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jLabel6.setText("Contact");

        jToggleButton4.setText("UPDATE");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jButton1.setText("CLEAR ALL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtsuppname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsuppnameActionPerformed(evt);
            }
        });

        jToggleButton5.setText("MAIN MENU");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("The Queen", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SUPPLIER DEATILS");

        jLabel2.setText("Supplier ID");

        jLabel3.setText("Supplier Name");

        jToggleButton1.setText("INSERT");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Address");

        jToggleButton2.setText("VIEW DEATILS");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jToggleButton5)
                .addGap(284, 284, 284))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtsuppname)
                            .addComponent(txtsuppid)
                            .addComponent(suppadd)
                            .addComponent(suppemail)
                            .addComponent(suppcont, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(117, 117, 117))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jToggleButton1)
                                .addGap(53, 53, 53))
                            .addComponent(jToggleButton2))
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton3)
                        .addGap(21, 21, 21)
                        .addComponent(jToggleButton4)
                        .addGap(22, 22, 22)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtsuppid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtsuppname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(suppadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(suppemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(suppcont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(67, 67, 67)
                .addComponent(jToggleButton5)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsuppnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsuppnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsuppnameActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            System.out.println("Connected");
            Statement stmt = (Statement) conn.createStatement();
            String sid=txtsuppid.getText();
            String sname=txtsuppname.getText();
            String sadd=suppadd.getText();
            String smail=suppemail.getText();
            String scont=suppcont.getText();
            /*String insert = "INSERT INTO 'project'.'login' ('user_id','password','email') VALUES ('"+user_id+"','"+password+"','"+email+"')";
            */
            stmt.executeUpdate("INSERT INTO supplier (supplier_id, supplier_name , supplier_address, supplier_email_id, supplier_contact)" + "VALUES ('"+sid+"','"+sname+"', '"+sadd+"','"+smail+"','"+scont+"')");
                    JOptionPane.showMessageDialog(null,"Record Saved Successfully");            
        }catch(SQLException e){
            System.err.println(e);
        }
    }                                      

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
     
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
txtsuppname.setEditable(false);
suppadd.setEditable(false);
suppemail.setEditable(false);
suppcont.setEditable(false);

String sid=txtsuppid.getText();
    
        Connection conn = null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        try{
            conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            System.out.println("Connected");
            pstmt=conn.prepareStatement("select * from supplier where supplier_id=?");
            pstmt.setString(1, sid);
            rs=pstmt.executeQuery();
            while(rs.next()){
                txtsuppname.setText(rs.getString("supplier_name"));
                suppemail.setText(rs.getString("supplier_email_id"));
                suppadd.setText(rs.getString("supplier_address"));
                suppcont.setText(rs.getString("supplier_contact"));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                conn.close();
                pstmt.close();
                rs.close();
                
            }
            catch(Exception e){
            }
            }


    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
Connection conn = null;
        try{
            conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            System.out.println("Connected"); 
            String sid=txtsuppid.getText();
            String sql = "delete from supplier where supplier_id=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, sid);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"record deleted successfully");
            conn.close();
    }                                        
catch(Exception e)
{
    JOptionPane.showMessageDialog(null, e);
}
      
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
txtsuppname.setText("");
       suppemail.setText("");
       suppadd.setText("");
       suppcont.setText(""); 
       txtsuppid.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
   new mainmenu().setVisible(true);
   this.dispose();
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
       Connection conn = null;
        try{
            conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            System.out.println("Connected"); 
            String id=txtsuppid.getText();
            String name=txtsuppname.getText();
            String mail=suppemail.getText();
            String add=suppadd.getText();
            String cont=suppcont.getText();
            String query="update supplier set supplier_name='"+name+"', supplier_email_id='"+mail+"', supplier_address='"+add+"', supplier_contact='"+cont+"' where supplier_id=?;";
            
            PreparedStatement stmt=conn.prepareStatement(query);
            stmt.setString(1, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"record updated");
            stmt.close();
            conn.close();
    }                                        
  catch(Exception e){
      JOptionPane.showMessageDialog(null,"erroe");
  }
    }//GEN-LAST:event_jToggleButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new supplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JTextField suppadd;
    private javax.swing.JTextField suppcont;
    private javax.swing.JTextField suppemail;
    private javax.swing.JTextField txtsuppid;
    private javax.swing.JTextField txtsuppname;
    // End of variables declaration//GEN-END:variables
}
