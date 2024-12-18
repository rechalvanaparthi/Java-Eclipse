package jdbcapp2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class AddPrinter {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			String driver, url , user , password;
			driver = "com.mysql.cj.jdbc.Driver";
			url = "jdbc:mysql://localhost:3306/edb_12980";
			user = "root";
			password = "root";
			
			String sql = "insert into printer values(?,?,?,?,?,?,?,?)";
			
			//1.Load the driver
			Class.forName(driver);
			
			//2.Establish Connection
			Connection con = DriverManager.getConnection(url,user,password);
			
			//3.Create PreparedStatement Object
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,4);
			ps.setString(2, "Samsung");
			ps.setString(3, "Samsung ProXpress SL-M3820DW");
			ps.setString(4, "Laser" );
			ps.setString(5, "1200 x 1200");
			ps.setInt(6, 165);
			java.sql.Date date = new java.sql.Date(2024-12-01);
			ps.setDate(7,date);
			ps.setString(8,"Grey");
					
		//4.Execute Insert sql query
				int status = ps.executeUpdate();         //To Process The DML Operations
				if(status >= 1) {
					System.out.println("New Printer is added");
				}else {
					System.out.println("Failed");
				}
				
				//5.Close Resources
				ps.close();
				con.close();
		
	}
}
