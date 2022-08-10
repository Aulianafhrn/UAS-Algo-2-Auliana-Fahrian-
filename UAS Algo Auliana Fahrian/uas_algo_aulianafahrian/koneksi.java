import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * Write a description of class koneksi here.
 * 
 * @author (Aufea) 
 * @version (a version number or a date)
 */
public class koneksi  
{
    public  static String a = "";
    public koneksi()
    {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql:mysql://localhost/test";
        String user = "root";
        String password = "";
        try {
            Class.forName(driver);
            String query = "SELECT * FROM `gerak` WHERE `id` = 1";
            try{
                Connection conn = DriverManager.getConnection(url, user, password);
                Statement stmt = conn.createStatement();
                ResultSet kunci = stmt.executeQuery(query); 
                
                while(gerak.next()){                   
                    a = gerak.getString("gerak");
                }  
                
            } catch (SQLException e) {
                a="gagal";
                System.out.println(e);
            }
            

        } catch (ClassNotFoundException e) {
            a="gagal";
            System.out.println(e);
        }//end try catch
    }

