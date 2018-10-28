/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author ostdemon
 */
public class MainMenu extends javax.swing.JFrame {

    connection.connect connect = new connection.connect();
    Connection connects = connect.get_Connections();
    ResultSet res = null;
    PreparedStatement pre = null;
    
    public MainMenu() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2);
        
        loginuser.setText(String.valueOf(connection.Emp.username).toString());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        payment = new javax.swing.JButton();
        deduction = new javax.swing.JButton();
        allowance = new javax.swing.JButton();
        emp_manager = new javax.swing.JButton();
        search = new javax.swing.JButton();
        update_salary = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        loginuser = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        employee = new javax.swing.JMenu();
        emp_reg = new javax.swing.JMenuItem();
        report = new javax.swing.JMenu();
        emp_rep = new javax.swing.JMenuItem();
        allowance_rep = new javax.swing.JMenuItem();
        deduct_rep = new javax.swing.JMenuItem();
        audit_menu = new javax.swing.JMenu();
        add_user = new javax.swing.JMenuItem();
        audit_trail = new javax.swing.JMenuItem();
        about = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(520, 350));
        setMinimumSize(new java.awt.Dimension(520, 350));
        setPreferredSize(new java.awt.Dimension(520, 350));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setMaximumSize(new java.awt.Dimension(600, 290));
        jPanel2.setMinimumSize(new java.awt.Dimension(600, 290));
        jPanel2.setLayout(null);

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.setText("Logout");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel2.add(exit);
        exit.setBounds(220, 220, 90, 50);

        payment.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        payment.setText("Payment");
        payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentActionPerformed(evt);
            }
        });
        jPanel2.add(payment);
        payment.setBounds(270, 170, 197, 31);

        deduction.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        deduction.setText("Deduction");
        deduction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deductionActionPerformed(evt);
            }
        });
        jPanel2.add(deduction);
        deduction.setBounds(50, 170, 197, 31);

        allowance.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        allowance.setText("Allowance");
        allowance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allowanceActionPerformed(evt);
            }
        });
        jPanel2.add(allowance);
        allowance.setBounds(50, 110, 197, 31);

        emp_manager.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        emp_manager.setText("Employee Manager");
        emp_manager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_managerActionPerformed(evt);
            }
        });
        jPanel2.add(emp_manager);
        emp_manager.setBounds(50, 50, 197, 31);

        search.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel2.add(search);
        search.setBounds(270, 50, 197, 31);

        update_salary.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        update_salary.setText("Update Salary");
        update_salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_salaryActionPerformed(evt);
            }
        });
        jPanel2.add(update_salary);
        update_salary.setBounds(270, 110, 197, 31);

        jLabel2.setText("Login As:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 10, 70, 18);

        loginuser.setMaximumSize(new java.awt.Dimension(44, 14));
        loginuser.setMinimumSize(new java.awt.Dimension(44, 14));
        loginuser.setPreferredSize(new java.awt.Dimension(44, 14));
        jPanel2.add(loginuser);
        loginuser.setBounds(90, 10, 90, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 520, 280);

        employee.setText("Employee");

        emp_reg.setText("Employee Registeration");
        emp_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_regActionPerformed(evt);
            }
        });
        employee.add(emp_reg);

        jMenuBar1.add(employee);

        report.setText("Reports");

        emp_rep.setText("Employees RP");
        emp_rep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_repActionPerformed(evt);
            }
        });
        report.add(emp_rep);

        allowance_rep.setText("Employee Total Allowance RP");
        allowance_rep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allowance_repActionPerformed(evt);
            }
        });
        report.add(allowance_rep);

        deduct_rep.setText("Employee Total Deduction RP");
        deduct_rep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deduct_repActionPerformed(evt);
            }
        });
        report.add(deduct_rep);

        jMenuBar1.add(report);

        audit_menu.setText("Audit");

        add_user.setText("Add User");
        add_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_userActionPerformed(evt);
            }
        });
        audit_menu.add(add_user);

        audit_trail.setText("Audit Trail");
        audit_trail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                audit_trailActionPerformed(evt);
            }
        });
        audit_menu.add(audit_trail);

        jMenuBar1.add(audit_menu);

        about.setText("About");

        jMenuItem3.setText("Version 1.0");
        about.add(jMenuItem3);

        jMenuBar1.add(about);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emp_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_regActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_emp_regActionPerformed

    private void emp_repActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_repActionPerformed

    }//GEN-LAST:event_emp_repActionPerformed

    private void allowance_repActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allowance_repActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_allowance_repActionPerformed

    private void deduct_repActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deduct_repActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_deduct_repActionPerformed

    private void add_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_userActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_add_userActionPerformed

    private void audit_trailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_audit_trailActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_audit_trailActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
            login out = new login();
            out.setVisible(true);
            this.dispose();
            try {
            
                Date date = GregorianCalendar
                               .getInstance().getTime();
                       DateFormat format = DateFormat.getDateInstance();
                       String dateE = format.format(date);
                       Date d= new Date();
                       SimpleDateFormat time = 
                               new SimpleDateFormat("HH:mm:ss");
                       String timeSt = time.format(d);
                       
                       String auditdate=dateE;
                       String audittime=timeSt;
                       String statusC= "logout";
                       String eid=connection.Emp.username;
                       String sqlogin="insert into mydb.audit (userlogin,date,time,status) values ('"+eid+"','"+auditdate+"','"+audittime+"','"+statusC+"')";
                       
                       pre=connects.prepareStatement(sqlogin);
                       pre.execute();
                       this.dispose();
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
            finally {           
            try{
                res.close();
                pre.close();
                setVisible(false);                
            }
            catch(Exception e){                
            }             
          }
            
            
            
    }//GEN-LAST:event_exitActionPerformed

    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_paymentActionPerformed

    private void deductionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deductionActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_deductionActionPerformed

    private void allowanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allowanceActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_allowanceActionPerformed

    private void emp_managerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_managerActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_emp_managerActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_searchActionPerformed

    private void update_salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_salaryActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_update_salaryActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu about;
    private javax.swing.JMenuItem add_user;
    private javax.swing.JButton allowance;
    private javax.swing.JMenuItem allowance_rep;
    private javax.swing.JMenu audit_menu;
    private javax.swing.JMenuItem audit_trail;
    private javax.swing.JMenuItem deduct_rep;
    private javax.swing.JButton deduction;
    private javax.swing.JButton emp_manager;
    private javax.swing.JMenuItem emp_reg;
    private javax.swing.JMenuItem emp_rep;
    private javax.swing.JMenu employee;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel loginuser;
    private javax.swing.JButton payment;
    private javax.swing.JMenu report;
    private javax.swing.JButton search;
    private javax.swing.JButton update_salary;
    // End of variables declaration//GEN-END:variables
}
