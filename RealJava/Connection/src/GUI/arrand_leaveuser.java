/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import connection.connect;
import java.awt.event.KeyEvent;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class arrand_leaveuser extends javax.swing.JFrame {

    connection.connect connect = new connection.connect();
    Connection connects = connect.get_Connections();
    ResultSet res = null;
    PreparedStatement pre = null;
    public arrand_leaveuser() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2);
        emp.setText(String.valueOf(connection.Emp.username).toString());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        detail = new javax.swing.JTextField();
        s3 = new javax.swing.JComboBox<>();
        s1 = new javax.swing.JComboBox<>();
        s2 = new javax.swing.JComboBox<>();
        a1 = new javax.swing.JComboBox<>();
        e2 = new javax.swing.JComboBox<>();
        e3 = new javax.swing.JComboBox<>();
        e1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        emp = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 330));
        setMinimumSize(new java.awt.Dimension(500, 330));
        setPreferredSize(new java.awt.Dimension(500, 330));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setText("number of day leave");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 200, 150, 18);

        jLabel2.setText("Leave Detail");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 80, 100, 18);

        jLabel3.setText("date start leave");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 120, 120, 18);

        jLabel4.setText("date end leave");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 160, 120, 18);

        jLabel5.setText("Arrand Leave");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(210, 30, 110, 18);
        getContentPane().add(detail);
        detail.setBounds(210, 70, 240, 30);

        s3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2561", "2562", " " }));
        getContentPane().add(s3);
        s3.setBounds(350, 110, 100, 30);

        s1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        getContentPane().add(s1);
        s1.setBounds(210, 110, 70, 30);

        s2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        getContentPane().add(s2);
        s2.setBounds(280, 110, 70, 30);

        a1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        getContentPane().add(a1);
        a1.setBounds(210, 190, 70, 30);

        e2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        getContentPane().add(e2);
        e2.setBounds(280, 150, 70, 30);

        e3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2561", "2562", " " }));
        getContentPane().add(e3);
        e3.setBounds(350, 150, 100, 30);

        e1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        getContentPane().add(e1);
        e1.setBounds(210, 150, 70, 30);

        jButton1.setText("exit to menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(330, 240, 140, 36);

        jButton2.setText("send");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(180, 240, 140, 36);
        getContentPane().add(emp);
        emp.setBounds(90, 10, 80, 20);

        jLabel6.setText("loggin As:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 10, 70, 18);

        jButton3.setText("generate report");
        getContentPane().add(jButton3);
        jButton3.setBounds(30, 240, 140, 36);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        if(detail.getText().equals("")){
           JOptionPane.showMessageDialog(null,"field can not empty"); 
        }
        else{
            int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to Send?","Send Teh Leave",JOptionPane.YES_NO_OPTION);
        if(p==0){
            try {
                String datestart = s1.getSelectedItem().toString()+s2.getSelectedItem().toString()+s3.getSelectedItem().toString();
                String dateend = e1.getSelectedItem().toString()+e2.getSelectedItem().toString()+e3.getSelectedItem().toString();
                String amount = a1.getSelectedItem().toString();
                String Ldetail = detail.getText();
                String user = connection.Emp.username.toString();
                
                String sql = "insert into mydb.errand_leave (leavestartdate,leaveenddate,leaveamount,matenity_detail,username) values ('"+datestart+"','"+dateend+"','"+amount+"','"+Ldetail+"','"+user+"')";
                pre=connects.prepareStatement(sql);
                pre.execute();
                JOptionPane.showMessageDialog(null,"send the leave to server and wait for reply from your boss");
                
            } catch (Exception e) {
            }
        }
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainMenuUser user = new MainMenuUser();
        user.setVisible(true);
        setVisible(false);
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
            java.util.logging.Logger.getLogger(arrand_leaveuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(arrand_leaveuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(arrand_leaveuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(arrand_leaveuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new arrand_leaveuser().setVisible(true);
  }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> a1;
    private javax.swing.JTextField detail;
    private javax.swing.JComboBox<String> e1;
    private javax.swing.JComboBox<String> e2;
    private javax.swing.JComboBox<String> e3;
    private javax.swing.JLabel emp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> s1;
    private javax.swing.JComboBox<String> s2;
    private javax.swing.JComboBox<String> s3;
    // End of variables declaration//GEN-END:variables
}
