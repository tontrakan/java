/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class connect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        connect cons = new connect();
        Connection con = null;
        con=cons.get_Connections();
        if(con!=null){
            JOptionPane.showMessageDialog(null, "Conntected");
        }
        else{JOptionPane.showMessageDialog(null, "Conntect failed");}
    }
    
    
    public Connection get_Connections(){
       Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection
            ("jdbc:mysql://localhost:3306/mydb","root","k41i");
            
        } catch (Exception e) {
            System.out.println(e);
        }
       return con;
    }
    
}
