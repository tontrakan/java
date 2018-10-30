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

        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        position = new javax.swing.JComboBox<>();
        name = new javax.swing.JTextField();
        surname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        dateofB = new javax.swing.JTextField();
        userlevel = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
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
        getContentPane().add(username);
        username.setBounds(220, 150, 140, 30);

        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
        });
        getContentPane().add(password);
        password.setBounds(220, 190, 140, 30);

        position.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Programer", "System Analysis", "Business Analysis", "Project Manager" }));
        getContentPane().add(position);
        position.setBounds(220, 270, 140, 30);

        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
        });
        getContentPane().add(name);
        name.setBounds(220, 310, 140, 30);

        surname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                surnameKeyReleased(evt);
            }
        });
        getContentPane().add(surname);
        surname.setBounds(220, 350, 140, 30);
        getContentPane().add(email);
        email.setBounds(520, 150, 140, 30);

        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        getContentPane().add(male);
        male.setBounds(520, 230, 60, 24);

        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        getContentPane().add(female);
        female.setBounds(590, 230, 80, 24);
        getContentPane().add(tel);
        tel.setBounds(520, 260, 140, 30);
        getContentPane().add(basesalary);
        basesalary.setBounds(520, 300, 140, 30);
        getContentPane().add(jobtitle);
        jobtitle.setBounds(520, 340, 140, 30);

        add.setText("Add Record");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(60, 440, 150, 60);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(570, 440, 150, 60);

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear);
        clear.setBounds(230, 440, 150, 60);

        main.setText("Main Menu");
        main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainActionPerformed(evt);
            }
        });
        getContentPane().add(main);
        main.setBounds(400, 440, 150, 60);

        jLabel1.setText("Login As:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(630, 30, 80, 18);
        getContentPane().add(userlogin);
        userlogin.setBounds(710, 30, 80, 20);

        jLabel3.setText("Employees Details");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(310, 80, 140, 18);

        jLabel5.setText("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 100, 750, 10);

        jLabel6.setText("Username:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(110, 160, 110, 18);

        jLabel7.setText("User Level:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(110, 240, 110, 18);

        jLabel8.setText("Gender:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(410, 230, 100, 18);

        jLabel10.setText("Date of birth:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(410, 200, 110, 18);

        jLabel9.setText("Name:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(110, 320, 110, 18);

        jLabel12.setText("Position:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(110, 280, 110, 18);

        jLabel13.setText("Surname:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(110, 360, 110, 18);

        jLabel14.setText("Email:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(410, 160, 110, 18);

        jLabel15.setText("Contract:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(410, 270, 110, 18);

        jLabel16.setText("Basic Salary:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(410, 310, 110, 18);

        jLabel17.setText("Job Title:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(410, 350, 110, 18);

        dateofB.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        getContentPane().add(dateofB);
        dateofB.setBounds(520, 190, 140, 30);

        userlevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        getContentPane().add(userlevel);
        userlevel.setBounds(220, 230, 140, 30);

        jLabel11.setText("Password:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(110, 200, 110, 18);

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
        
        //idemp.setText("");
        username.setText("");
        password.setText("");
        //idemp.setText("");
        position.setSelectedItem(null);
        name.setText("");
        surname.setText("");
        email.setText("");
        dateofB.setText("");
        male.setSelected(false);
        female.setSelected(false);
        tel.setText("");
        basesalary.setText("");
        jobtitle.setText("");
        
    }//GEN-LAST:event_clearActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
                          
            if(name.getText().equals("")||surname.getText().equals("")||username.getText().equals("")||password.getText().equals("")||email.getText().equals("")||dateofB.getText().equals("")||tel.getText().equals("")||basesalary.getText().equals("")||jobtitle.getText().equals("")){
                   JOptionPane.showMessageDialog(null,"field can not empty"); 
            }
            else{
                  int p = JOptionPane.showConfirmDialog(null, 
                "Are you sure you want to add record?","Add Record",
                JOptionPane.YES_NO_OPTION);
                
                
                if(p==0){
                
                    try {
                        String sql = "insert into mydb.emp_detail (Fname,Lname,Email,Tel,DateOfBirth,Gender,BaseSalary,Jobtitle,Position,userlevel,username,password) values(?,?,?,?,?,?,?,?,?,?,?,?)";
                        pre=connects.prepareStatement(sql);
                        
                        pre.setString(1, name.getText());
                        pre.setString(2, surname.getText());
                        pre.setString(3, email.getText());
                        pre.setString(4, tel.getText());
                        pre.setString(5, dateofB.getText());
                        pre.setString(6, gender);
                        pre.setString(7, basesalary.getText());
                        pre.setString(8, jobtitle.getText());
                        pre.setString(9, position.getSelectedItem().toString());
                        pre.setString(10, userlevel.getSelectedItem().toString());
                        pre.setString(11, username.getText());
                        pre.setString(12, password.getText());
                        
                        
                        
                        
                        pre.execute();
                        
                        JOptionPane.showMessageDialog(null,"Data is saved "
                        + "successfully");
                    
                    
                    } 
                    catch (Exception e) { 
                        
                        JOptionPane.showMessageDialog(null,e);
                    }                            
                    try{
                        
                        String sqr = "select * from mydb.emp_detail where (idemp) not in (select idemp from mydb.emp) ";
                        pre=connects.prepareStatement(sqr);
                        res=pre.executeQuery();
                        
                        while (res.next()) {
                            String a1 = res.getString("idemp");
                            String a2 = res.getString("username");
                            String a3 = res.getString("password");
                            String a4 = res.getString("userlevel");
                            String sqe = "insert into mydb.emp (idemp,username,password,userlevel) values ('"+a1+"','"+a2+"','"+a3+"','"+a4+"')";
                            pre=connects.prepareStatement(sqe);
                            pre.execute();
                            JOptionPane.showMessageDialog(null,"User account has been created successfully: " +" Username:  "+a2);
                            
                            
                        }
                        
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null,e);
                    }
                    finally{
                        try {
                            
                            res.close();
                            pre.close();
                            
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null,e);
                        }
                        
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
                       String statusC= "Add Records";
                       String eid=connection.Emp.username;
                       
                        try {
                            
                            String sqlogin="insert into mydb.audit (userlogin,date,time,status) values ('"+eid+"','"+auditdate+"','"+audittime+"','"+statusC+"')";
                       
                            pre=connects.prepareStatement(sqlogin);
                            pre.execute();
                            //this.dispose();
                            
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null,e);
                        }
                        finally {

                            try{
                                res.close();
                                pre.close();

                            }  
                
                            catch(Exception e){
                                JOptionPane.showMessageDialog(null,e);
                            }
                        }
                       
                    }
                    
                }  
            }
                                                            
    }//GEN-LAST:event_addActionPerformed

    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyReleased
        
    }//GEN-LAST:event_passwordKeyReleased

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
         
    }//GEN-LAST:event_nameKeyReleased

    private void surnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_surnameKeyReleased
         
    }//GEN-LAST:event_surnameKeyReleased

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainActionPerformed
        MainMenu main = new MainMenu();
        main.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mainActionPerformed

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
    private javax.swing.JTextField dateofB;
    private javax.swing.JTextField email;
    private javax.swing.JButton exit;
    private javax.swing.JRadioButton female;
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
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox<String> position;
    private javax.swing.JTextField surname;
    private javax.swing.JTextField tel;
    private javax.swing.JComboBox<String> userlevel;
    private javax.swing.JLabel userlogin;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
