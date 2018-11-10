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
public class login extends javax.swing.JFrame {
    
    
    connection.connect connect = new connection.connect();
    Connection connects = connect.get_Connections();
    ResultSet res = null;
    PreparedStatement pre = null;
    //username.setDocument(new Extendtion.limitfield(12));
    
    
    public login() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2,
                size.height/2 - getHeight()/2);
        date();
        //username.setDocument(new Extendtion.limitfield(12));
        
    }
    
    public void date (){
        
        Calendar cal =new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        
        txt_date.setText((month+1)+"/"+day+"/"+year);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        cmd_Login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        selectlevel = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        txt_date = new javax.swing.JMenu();
        command = new javax.swing.JMenu();
        ctrlQ = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(450, 350));
        setMinimumSize(new java.awt.Dimension(450, 350));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setMaximumSize(new java.awt.Dimension(400, 260));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 240));
        jPanel2.setLayout(null);

        cmd_Login.setText("Login");
        cmd_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_LoginActionPerformed(evt);
            }
        });
        cmd_Login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmd_LoginKeyPressed(evt);
            }
        });
        jPanel2.add(cmd_Login);
        cmd_Login.setBounds(160, 190, 110, 40);

        jLabel1.setText("Username:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(80, 80, 90, 18);

        jLabel2.setText("Password:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(80, 120, 80, 18);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Please enter your username and password");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(50, 30, 300, 20);

        username.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameKeyReleased(evt);
            }
        });
        jPanel2.add(username);
        username.setBounds(190, 70, 132, 30);

        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
        });
        jPanel2.add(password);
        password.setBounds(190, 110, 130, 30);

        selectlevel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "User" }));
        selectlevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectlevelActionPerformed(evt);
            }
        });
        jPanel2.add(selectlevel);
        selectlevel.setBounds(190, 150, 130, 30);

        jLabel3.setText("Select Position:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(60, 160, 110, 18);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 260);

        Menu.add(jMenu3);

        txt_date.setText("Date");
        Menu.add(txt_date);

        command.setText("File");

        ctrlQ.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        ctrlQ.setText("Exit");
        ctrlQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctrlQActionPerformed(evt);
            }
        });
        command.add(ctrlQ);

        Menu.add(command);

        setJMenuBar(Menu);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void ctrlQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctrlQActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ctrlQActionPerformed
    
    private void cmd_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_LoginActionPerformed
        
        if(username.getText().equals("")){
            JOptionPane.showMessageDialog(null, "username must not empty");
        }
        else if(password.getText().equals("")){
            JOptionPane.showMessageDialog(null, "password must not empty");
        }
        else{
            String sql = "select username,password,userLevel from mydb.emp where  username=? and password=? and userLevel=?  ";
            try {
                int count =0;
                pre=connects.prepareStatement(sql);
                pre.setString(1, username.getText());
                pre.setString(2, password.getText());
                pre.setString(3, selectlevel.getSelectedItem().toString());
                res=pre.executeQuery();
                
                while(res.next()){
                    String user = res.getString(1);
                    connection.Emp.username=user;
                    count=count+1;
                }
                String access=(selectlevel.getSelectedItem().toString());
                if(access=="Admin"){
                    if(count==1){
                        //if(username.getText().equals(res.getString(1))){System.out.println("reapeat");}
                        JOptionPane.showMessageDialog(null, "success");
                        MainMenu main = new MainMenu();
                        main.setVisible(true);
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
                        String statusC= "login";
                        String eid=connection.Emp.username;
                        String sqlogin="insert into mydb.audit (userlogin,date,time,status) values ('"+eid+"','"+auditdate+"','"+audittime+"','"+statusC+"')";
                        
                        pre=connects.prepareStatement(sqlogin);
                        pre.execute();
                        this.dispose();
                    }
                    else if(count>1){
                        JOptionPane.showMessageDialog(null,"Duplicate Username "
                                + "or Password Access denied" );
                        
                    }
                    else {
                        JOptionPane.showMessageDialog(null,
                                "Username and Password is not correct");
                    }
                }
                else if (access=="User"){
                    if(count==1){
                        JOptionPane.showMessageDialog(null, "success");
                        MainMenuUser user = new MainMenuUser();
                        user.setVisible(true);
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
                        String statusC= "login";
                        String eid=connection.Emp.username;
                        String sqlogin="insert into mydb.audit (userlogin,date,time,status) values ('"+eid+"','"+auditdate+"','"+audittime+"','"+statusC+"')";
                        
                        pre=connects.prepareStatement(sqlogin);
                        pre.execute();
                        //this.dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(null,
                                "Username or Password or Leveluser is not correct");
                    }
                }
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
        }
        
    }//GEN-LAST:event_cmd_LoginActionPerformed
    
    private void cmd_LoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmd_LoginKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmd_LoginKeyPressed
    
    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(username.getText().equals("")){
                JOptionPane.showMessageDialog(null, "username must not empty");
            }
            else if(password.getText().equals("")){
                JOptionPane.showMessageDialog(null, "password must not empty");
            }
            else{
                String sql = "select username,password,userLevel from mydb.emp where  username=? and password=? and userLevel=?  ";
                try {
                    int count =0;
                    pre=connects.prepareStatement(sql);
                    pre.setString(1, username.getText());
                    pre.setString(2, password.getText());
                    pre.setString(3, selectlevel.getSelectedItem().toString());
                    res=pre.executeQuery();
                    
                    while(res.next()){
                        String user = res.getString(1);
                        connection.Emp.username=user;
                        count=count+1;
                    }
                    String access=(selectlevel.getSelectedItem().toString());
                    if(access=="Admin"){
                        if(count==1){
                            JOptionPane.showMessageDialog(null, "success");
                            MainMenu main = new MainMenu();
                            main.setVisible(true);
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
                            String statusC= "login";
                            String eid=connection.Emp.username;
                            String sqlogin="insert into mydb.audit (userlogin,date,time,status) values ('"+eid+"','"+auditdate+"','"+audittime+"','"+statusC+"')";
                            
                            pre=connects.prepareStatement(sqlogin);
                            pre.execute();
                            this.dispose();
                        }
                        else if(count>1){
                            JOptionPane.showMessageDialog(null,"Duplicate Username "
                                    + "or Password Access denied" );
                        }
                        else{
                            JOptionPane.showMessageDialog(null,
                                    "Username and Password is not correct");
                            //JOptionPane.showConfirmDialog(Menu, i)
                        }
                    }
                    else if (access=="User"){
                        if(count==1){
                            JOptionPane.showMessageDialog(null, "success");
                            MainMenuUser main = new MainMenuUser();
                            main.setVisible(true);
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
                            String statusC= "login";
                            String eid=connection.Emp.username;
                            String sqlogin="insert into mydb.audit (userlogin,date,time,status) values ('"+eid+"','"+auditdate+"','"+audittime+"','"+statusC+"')";
                            
                            pre=connects.prepareStatement(sqlogin);
                            pre.execute();
                            this.dispose();
                        }
                        
                        else{
                            JOptionPane.showMessageDialog(null,
                                    "Username or Password or Leveluser is not correct");
                        }
                    }
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
            }
        }
    }//GEN-LAST:event_passwordKeyPressed
    
    private void selectlevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectlevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectlevelActionPerformed
    
    private void usernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyReleased
        if(username.getText().length()>=20){
            JOptionPane.showMessageDialog(null, "can input only 20 character");
            username.setText("");
        }
    }//GEN-LAST:event_usernameKeyReleased
    
    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyReleased
        if(password.getText().length()>=20){
            JOptionPane.showMessageDialog(null, "can input only 20 character");
            password.setText("");
        }
    }//GEN-LAST:event_passwordKeyReleased
    
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JButton cmd_Login;
    private javax.swing.JMenu command;
    private javax.swing.JMenuItem ctrlQ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox selectlevel;
    private javax.swing.JMenu txt_date;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
