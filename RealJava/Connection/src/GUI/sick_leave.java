/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author ostdemon
 */
public class sick_leave extends javax.swing.JFrame {

    /**
     * Creates new form leave
     */
    public sick_leave() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        emp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 310));
        setMinimumSize(new java.awt.Dimension(500, 310));
        setPreferredSize(new java.awt.Dimension(500, 310));
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

        jLabel5.setText("Sick Leave");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(210, 30, 80, 18);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(210, 70, 240, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2555", "2556", "2557", "2558", "2559", "2560", "2561", "2562", " " }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(350, 110, 100, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(210, 110, 70, 30);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(280, 110, 70, 30);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        getContentPane().add(jComboBox4);
        jComboBox4.setBounds(210, 190, 70, 30);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        getContentPane().add(jComboBox5);
        jComboBox5.setBounds(280, 150, 70, 30);

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2555", "2556", "2557", "2558", "2559", "2560", "2561", "2562", " " }));
        getContentPane().add(jComboBox6);
        jComboBox6.setBounds(350, 150, 100, 30);

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        getContentPane().add(jComboBox7);
        jComboBox7.setBounds(210, 150, 70, 30);

        jButton1.setText("exit to menu");
        getContentPane().add(jButton1);
        jButton1.setBounds(250, 240, 110, 36);

        jButton2.setText("send");
        getContentPane().add(jButton2);
        jButton2.setBounds(120, 240, 110, 36);

        jLabel6.setText("loggin As:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 70, 18);
        getContentPane().add(emp);
        emp.setBounds(80, 0, 80, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(sick_leave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sick_leave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sick_leave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sick_leave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sick_leave().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel emp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
