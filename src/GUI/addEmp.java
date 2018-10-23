/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Ch4L1sT
 */
public class addEmp extends javax.swing.JFrame {

    Database.Connections connect = new Database.Connections();
    Connection connects = connect.get_Connections();
    ResultSet res = null;
    PreparedStatement pre = null;
    
    private ImageIcon format=null;
    String filename = null;
    byte[] person_img = null;
    private String gender;
    
    public addEmp() {
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Tel = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        dateOfbirth = new javax.swing.JTextField();
        surname = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        Eid = new javax.swing.JTextField();
        image = new javax.swing.JDesktopPane();
        img = new javax.swing.JLabel();
        zipcode = new javax.swing.JTextField();
        department = new javax.swing.JTextField();
        designation = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        status = new javax.swing.JTextField();
        hired = new javax.swing.JTextField();
        baseSalary = new javax.swing.JTextField();
        addRecord = new javax.swing.JButton();
        cls = new javax.swing.JButton();
        jobtitle = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        position = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        emp = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        date = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(960, 530));
        setMinimumSize(new java.awt.Dimension(960, 530));
        setPreferredSize(new java.awt.Dimension(960, 530));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Adobe Arabic", 1, 14))); // NOI18N
        jPanel3.setLayout(null);

        jLabel7.setText("Contact :");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(370, 70, 50, 14);

        jLabel6.setText("Email :");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(370, 30, 40, 14);

        jLabel11.setText("Gender:");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(20, 270, 50, 14);

        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel3.add(male);
        male.setBounds(140, 270, 60, 23);

        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel3.add(female);
        female.setBounds(210, 270, 80, 23);

        jLabel3.setText("Date of Birth :");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(20, 240, 80, 14);

        jLabel2.setText("Surname :");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(20, 200, 60, 14);

        jLabel1.setText("First name :");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(20, 160, 80, 14);

        jLabel5.setText("Employee id :");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(20, 40, 80, 14);

        jLabel8.setText("Address :");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(20, 340, 60, 14);

        jLabel16.setText("Post Code :");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(370, 390, 70, 14);

        jLabel9.setText("Department :");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(370, 110, 80, 14);

        jLabel17.setText("Status :");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(370, 190, 60, 14);

        jLabel12.setText("Basic Salary :");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(370, 270, 80, 14);

        jLabel18.setText("Date Hired :");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(370, 230, 80, 14);
        jPanel3.add(Tel);
        Tel.setBounds(470, 60, 160, 30);
        jPanel3.add(Email);
        Email.setBounds(470, 20, 160, 30);
        jPanel3.add(dateOfbirth);
        dateOfbirth.setBounds(140, 230, 168, 30);
        jPanel3.add(surname);
        surname.setBounds(140, 190, 168, 30);
        jPanel3.add(name);
        name.setBounds(140, 150, 168, 30);

        Eid.setEditable(false);
        jPanel3.add(Eid);
        Eid.setBounds(140, 30, 168, 30);

        image.setLayer(img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout imageLayout = new javax.swing.GroupLayout(image);
        image.setLayout(imageLayout);
        imageLayout.setHorizontalGroup(
            imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addContainerGap())
        );
        imageLayout.setVerticalGroup(
            imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(image);
        image.setBounds(652, 84, 251, 167);
        jPanel3.add(zipcode);
        zipcode.setBounds(470, 380, 90, 30);
        jPanel3.add(department);
        department.setBounds(470, 100, 160, 30);
        jPanel3.add(designation);
        designation.setBounds(470, 140, 160, 30);

        jLabel13.setText("Designation :");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(370, 150, 80, 14);
        jPanel3.add(status);
        status.setBounds(470, 180, 160, 30);
        jPanel3.add(hired);
        hired.setBounds(470, 220, 160, 30);

        baseSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baseSalaryActionPerformed(evt);
            }
        });
        jPanel3.add(baseSalary);
        baseSalary.setBounds(470, 260, 160, 30);

        addRecord.setText("Add Record");
        addRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRecordActionPerformed(evt);
            }
        });
        jPanel3.add(addRecord);
        addRecord.setBounds(660, 270, 120, 44);

        cls.setText("Clear");
        cls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clsActionPerformed(evt);
            }
        });
        jPanel3.add(cls);
        cls.setBounds(780, 270, 120, 44);
        jPanel3.add(jobtitle);
        jobtitle.setBounds(470, 300, 160, 30);

        jLabel20.setText("Job Title :");
        jPanel3.add(jLabel20);
        jLabel20.setBounds(370, 310, 70, 14);

        address.setColumns(20);
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(140, 310, 220, 100);

        jLabel21.setText("position :");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(370, 350, 70, 14);
        jPanel3.add(position);
        position.setBounds(470, 340, 160, 30);

        jLabel4.setText("username:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(20, 80, 70, 14);

        jLabel14.setText("password:");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(20, 120, 70, 14);
        jPanel3.add(username);
        username.setBounds(140, 70, 170, 30);
        jPanel3.add(password);
        password.setBounds(140, 110, 170, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 47, 930, 430);

        emp.setText("emp");
        getContentPane().add(emp);
        emp.setBounds(871, 11, 60, 30);

        jLabel10.setText("Logged in As :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(775, 11, 90, 30);

        File.setText("File");

        jMenuItem1.setText("Attach Image");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        File.add(jMenuItem1);

        jMenuBar1.add(File);

        date.setText("Date");
        jMenuBar1.add(date);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        JFileChooser choose = new JFileChooser();
        choose.showOpenDialog(null);
        File  f= choose.getSelectedFile();
        filename=f.getAbsolutePath();
        ImageIcon imgicon= new ImageIcon(new ImageIcon(filename)
                .getImage().getScaledInstance(
                img.getWidth(), 
                img.getHeight(),
                Image.SCALE_DEFAULT));
        img.setIcon(imgicon);
        
        try {
            File imageS = new File(filename);
            FileInputStream input=new FileInputStream(imageS);
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            for(int readnumpy;(readnumpy=input.read(buffer))!=-1;){
                output.write(buffer,0,readnumpy);
            }
            person_img=output.toByteArray();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        
        gender="Male";
        male.setSelected(true);
        female.setSelected(false);
        
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        
        gender="Female";
        female.setSelected(true);
        male.setSelected(false);

    }//GEN-LAST:event_femaleActionPerformed

    private void baseSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baseSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_baseSalaryActionPerformed

    private void addRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRecordActionPerformed
        
        int p=JOptionPane.showConfirmDialog(null, 
                "Do you want to add record","Add recode",
                JOptionPane.YES_NO_OPTION);
        if(p==0){
            try {
                String sql = "insert into employees_info.emp_det (Fname,Lname,Emial,Address,tel.,dateofbirth,gender,Department,Designation,status,hired,baseSalary,jobtitle,zipcode,position,picture) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";
                pre=connects.prepareStatement(sql);
                pre.setString(1, name.getText());
                pre.setString(2, surname.getText());
                pre.setString(3, Email.getText());
                pre.setString(4, address.getText());
                pre.setString(5,Tel.getText());
                pre.setString(6,dateOfbirth.getText());
                pre.setString(7, gender);
                pre.setString(8, department.getText());
                pre.setString(9, designation.getText());
                pre.setString(10, status.getText());
                pre.setString(11, hired.getText());
                pre.setString(12, baseSalary.getText());
                pre.setString(13, jobtitle.getText());
                pre.setString(14, zipcode.getText());
                pre.setString(15, position.getText());
                pre.setBytes(17, person_img);
                
                pre.execute();
                JOptionPane.showMessageDialog(null, "Data is saved successfully");
                
            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            try {
                String sql2 = "select * from employees_info.emp_det where (Eid) not in (select Eid from employees_info.emp)";
                pre=connects.prepareStatement(sql2);
                res=pre.executeQuery();
                
                while (res.next()) {
                    String add1=res.getString("Eid");
                    String add2=res.getString("Fname");
                    String add3=res.getString("dateofbirth");
                    String result = add3.replace("/", "");
                    String add4=res.getString("Department");
                    
                    String sql3="insert into employees_info.emp (Eid,username,password,userLevel) values ('"+add1+"','"+add2+"','"+result+"','"+add1+"') ";
                    
                }
            } catch (Exception e) {
            }
        }
        
    }//GEN-LAST:event_addRecordActionPerformed

    private void clsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clsActionPerformed
        Eid.setText(""); status.setText("");
        name.setText(""); baseSalary.setText("");
        surname.setText(""); designation.setText("");
        Tel.setText(""); zipcode.setText("");
        Email.setText(""); hired.setText("");
        address.setText(""); jobtitle.setText("");
        department.setText(""); img.setIcon(null);
        dateOfbirth.setText(""); 
        
        
    }//GEN-LAST:event_clsActionPerformed

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
            java.util.logging.Logger.getLogger(addEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addEmp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Eid;
    private javax.swing.JTextField Email;
    private javax.swing.JMenu File;
    private javax.swing.JTextField Tel;
    private javax.swing.JButton addRecord;
    private javax.swing.JTextArea address;
    private javax.swing.JTextField baseSalary;
    private javax.swing.JButton cls;
    private javax.swing.JMenu date;
    private javax.swing.JTextField dateOfbirth;
    private javax.swing.JTextField department;
    private javax.swing.JTextField designation;
    private javax.swing.JLabel emp;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField hired;
    private javax.swing.JDesktopPane image;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jobtitle;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField position;
    private javax.swing.JTextField status;
    private javax.swing.JTextField surname;
    private javax.swing.JTextField username;
    private javax.swing.JTextField zipcode;
    // End of variables declaration//GEN-END:variables
}