package jdbcapp2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class DeletePrinter {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			String driver, url , user , password;
			driver = "com.mysql.cj.jdbc.Driver";
			url = "jdbc:mysql://localhost:3306/edb_12980";
			user = "root";
			password = "root";
			
			String sql = "delete from printer where printer_id=?";
			
			//1.Load the driver
			Class.forName(driver);
			
			//2.Establish Connection
			Connection con = DriverManager.getConnection(url,user,password);
			
			//3.Create PreparedStatement Object
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1,3);
					
		//4.Execute Insert sql query
				int status = ps.executeUpdate();         //To Process The DML Operations
				if(status >= 1) {
					System.out.println("Success");
				}else {
					System.out.println("Failed");
				}
				
				//5.Close Resources
				ps.close();
				con.close();
		
	}
}
