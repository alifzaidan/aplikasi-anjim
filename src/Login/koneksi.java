package Login;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class koneksi {
    public static Connection con;
    
    public static Connection koneksiDB() throws SQLException{
        if (con == null) {
            try {
            String url = "jdbc:mysql://localhost/dbanjim";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = (Connection) DriverManager.getConnection(url,user,pass); 
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"gagal koneksi "+e.getMessage());
        }}
        return con;
    }
      public static void main (String [ ] args)throws SQLException{
        koneksiDB();
      }}

    

