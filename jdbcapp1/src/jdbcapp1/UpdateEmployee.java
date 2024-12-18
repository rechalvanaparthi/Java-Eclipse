package jdbcapp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateEmployee {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver, url , user , password;
		driver = "com.mysql.cj.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/edb_12980";
		user = "root";
		password = "root";
		
		String sql = "update employee set name=?,email=? where id=?";
		
		//1.Load the driver
		Class.forName(driver);
		
		//2.Establish Connection
		Connection con = DriverManager.getConnection(url,user,password);
		
		//3.Create PreparedStatement Object
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, "Wilson");
		ps.setString(2, "wilson@gmail.com");
		ps.setInt(3, 1);
		
		//4.Execute Insert sql query
		int status = ps.executeUpdate();          //To Process The DML Operations
		if(status >= 1) {
			System.out.println("success");
		}else {
			System.out.println("Failed");
		}
		
		//5.Close Resources
		ps.close();
		con.close();
}
}
