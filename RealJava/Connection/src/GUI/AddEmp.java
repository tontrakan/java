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

public class AddEmp extends javax.swing.JFrame {

    
    private String gender;
    
    connection.connect connect = new connection.connect();
    Connection connects = connect.get_Connections();
    ResultSet res = null;
    PreparedStatement pre = null;
    
    public AddEmp() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2);
        date();
    }
    
    public void date (){
        
        Calendar cal =new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        
        date.setText((month+1)+"/"+day+"/"+year);       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idemp = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        position = new javax.swing.JComboBox<>();
        name = new javax.swing.JTextField();
        surname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        day = new javax.swing.JComboBox<>();
        month = new javax.swing.JComboBox<>();
        years = new javax.swing.JComboBox<>();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        tel = new javax.swing.JTextField();
        basesalary = new javax.swing.JTextField();
        jobtitle = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        main = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        userlogin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        date = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        idemp.setEditable(false);
        idemp.setEnabled(false);
        getContentPane().add(idemp);
        idemp.setBounds(210, 120, 140, 30);
        getContentPane().add(username);
        username.setBounds(210, 160, 140, 30);
        getContentPane().add(password);
        password.setBounds(210, 200, 140, 30);

        position.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Programer", "System Analysis", "Business Analysis", "Project Manager" }));
        getContentPane().add(position);
        position.setBounds(210, 240, 140, 30);
        getContentPane().add(name);
        name.setBounds(210, 280, 140, 30);
        getContentPane().add(surname);
        surname.setBounds(210, 320, 140, 30);
        getContentPane().add(email);
        email.setBounds(210, 360, 140, 30);

        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(day);
        day.setBounds(530, 120, 70, 30);

        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        getContentPane().add(month);
        month.setBounds(600, 120, 70, 30);

        years.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012" }));
        getContentPane().add(years);
        years.setBounds(530, 150, 140, 30);

        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        getContentPane().add(male);
        male.setBounds(530, 190, 60, 24);

        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        getContentPane().add(female);
        female.setBounds(600, 190, 80, 24);
        getContentPane().add(tel);
        tel.setBounds(530, 220, 140, 30);
        getContentPane().add(basesalary);
        basesalary.setBounds(530, 260, 140, 30);
        getContentPane().add(jobtitle);
        jobtitle.setBounds(530, 300, 140, 30);

        add.setText("Add Record");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(70, 440, 150, 60);

        exit.setText("Exit");
        getContentPane().add(exit);
        exit.setBounds(590, 440, 140, 60);

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear);
        clear.setBounds(250, 440, 140, 60);

        main.setText("Main Menu");
        getContentPane().add(main);
        main.setBounds(420, 440, 140, 60);

        jLabel1.setText("Login As:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(630, 30, 80, 18);
        getContentPane().add(userlogin);
        userlogin.setBounds(710, 30, 80, 20);

        jLabel3.setText("Employees Details");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(310, 50, 140, 18);

        jLabel4.setText("Employees ID:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 130, 110, 18);

        jLabel5.setText("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 70, 750, 10);

        jLabel6.setText("Username:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 170, 110, 18);

        jLabel7.setText("Password:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(100, 210, 110, 18);

        jLabel8.setText("Gender:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(420, 190, 100, 18);

        jLabel10.setText("Date of birth:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(420, 130, 110, 18);

        jLabel9.setText("Name:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(100, 290, 110, 18);

        jLabel11.setText("DD/MM/YYYY");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(420, 160, 100, 18);

        jLabel12.setText("Position:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(100, 250, 110, 18);

        jLabel13.setText("Surname:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(100, 330, 110, 18);

        jLabel14.setText("Email:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(100, 370, 110, 18);

        jLabel15.setText("Contract:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(420, 230, 110, 18);

        jLabel16.setText("Basic Salary:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(420, 270, 110, 18);

        jLabel17.setText("Job Title:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(420, 310, 110, 18);

        jMenu1.setText("File");

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        date.setText("date");
        jMenuBar1.add(date);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        gender = "Male";
        male.setSelected(true);
        female.setSelected(false);
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        gender="Female";
        female.setSelected(true);
        male.setSelected(false);
    }//GEN-LAST:event_femaleActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        
        idemp.setText("");
        username.setText("");
        password.setText("");
        idemp.setText("");
        position.setSelectedItem(null);
        name.setText("");
        surname.setText("");
        email.setText("");
        day.setSelectedItem(null);
        month.setSelectedItem(null);
        years.setSelectedItem(null);
        male.setSelected(false);
        female.setSelected(false);
        tel.setText("");
        basesalary.setText("");
        jobtitle.setText("");
        
    }//GEN-LAST:event_clearActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
                          
                int p = JOptionPane.showConfirmDialog(null, 
                "Are you sure you want to add record?","Add Record",
                JOptionPane.YES_NO_OPTION);
                String idp = "P001";
                String dateofb=day.getSelectedItem().toString()+month.getSelectedItem().toString()+years.getSelectedItem().toString();
                
                if(p==0){
                
                    try {
                        
                        String idemp=idp;
                        String empname = name.getText();
                        String empsurname=surname.getText();
                        String empemail=email.getText();
                        String empTel=tel.getText();
                        String empdate=dateofb;
                        String empGender=gender;
                        String empSalary=basesalary.getText();
                        String empjob=jobtitle.getText();
                        String empPo =  position.getSelectedItem().toString();
                    
                        String sql = "insert into mydb.emp_detail (emp_idemp,Fname,Lname,Email,Tel.,DateOfBirth,Gender,BaseSalary,Jobtitle,Position) values('"+idemp+"','"+empname+"','"+empsurname+"','"+empemail+",'"+empTel+"','"+empdate+"','"+empGender+"','"+empSalary+"','"+empjob+"','"+empPo+"') ";
                        pre=connects.prepareStatement(sql);

                        pre.execute();
                        
                        JOptionPane.showMessageDialog(null,"Data is saved "
                        + "successfully");
                    
                    
                    } 
                    catch (Exception e) { 
                        
                        JOptionPane.showMessageDialog(null,e);
                    }
                    finally {           
                        try{
                            res.close();
                            pre.close(); 
                            //setVisible(false);
                        }
                        catch(Exception e){
                            JOptionPane.showMessageDialog(null, e);
                        }
                    }
                }                                            
    }//GEN-LAST:event_addActionPerformed

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
            java.util.logging.Logger.getLogger(AddEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField basesalary;
    private javax.swing.JButton clear;
    private javax.swing.JMenu date;
    private javax.swing.JComboBox<String> day;
    private javax.swing.JTextField email;
    private javax.swing.JButton exit;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField idemp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField jobtitle;
    private javax.swing.JButton main;
    private javax.swing.JRadioButton male;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox<String> position;
    private javax.swing.JTextField surname;
    private javax.swing.JTextField tel;
    private javax.swing.JLabel userlogin;
    private javax.swing.JTextField username;
    private javax.swing.JComboBox<String> years;
    // End of variables declaration//GEN-END:variables
}
