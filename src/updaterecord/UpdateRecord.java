/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package updaterecord;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class UpdateRecord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            // TODO code application logic here
            //Update Record Using JDBC
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bca","root","");
            Statement st = (Statement)con.createStatement();
            int i = st.executeUpdate("update register set mobile='90987565' where uid='avadh'");
            if(i>0){
                System.out.println("Update Success");
                
            }
            else{
                 System.out.println("Not Success");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
            
                    
            
       
    }
    
}
