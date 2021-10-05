/*
This class establishes connection to the database and it will be refereced for connetion 
through out the program... like this conn = db.database_db();
 */
package course_management_system;

import java.sql.*;
import javax.swing.JOptionPane;

public class db {

    Connection conn = null;

    public static Connection database_db() {
    
            try {
                Class.forName("com.mysql.jdbc.Driver");

                Connection conn = DriverManager.getConnection("jdbc:mysql://sql145.main-hosting.eu:3306/u802954504_cms?autoReconnect=true", "u802954504_cms", "Ua/5^~@i*s3j");
                //JOptionPane.showMessageDialog(null, "Connection to remote server was established");
                
                return conn;

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Failure to connect " + e.getMessage());
                return null;
            }
        
    }
}
