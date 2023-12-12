package connect;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author giasutinhoc.vn
 */
public class TestConnect {
 public static void main(String[] args) {
  try {
    String dbURL = "jdbc:sqlserver://localhost;databaseName=Quan_Ly_Hoc_Sinh;user=sa;password=12345";
    Connection conn = DriverManager.getConnection(dbURL);
    if (conn != null) {
      System.out.println("Connected success");
//      DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
//      System.out.println("Driver name: " + dm.getDriverName());
//      System.out.println("Driver version: " + dm.getDriverVersion());
//      System.out.println("Product name: " + dm.getDatabaseProductName());
//      System.out.println("Product version: " + dm.getDatabaseProductVersion());
    }
   } catch (SQLException ex) {
     System.err.println("Cannot connect database, " + ex);
   }
  }
}

