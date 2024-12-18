package jdbcapp2;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	
	public class GetAllPrinters {
	
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			String driver, url , user , password;
			driver = "com.mysql.cj.jdbc.Driver";
			url = "jdbc:mysql://localhost:3306/edb_12980";
			user = "root";
			password = "root";
			
			String sql = "select * from printer";
			
			//1.Load the driver
			Class.forName(driver);
			
			//2.Establish Connection
			Connection con = DriverManager.getConnection(url,user,password);
			
			//3.Create Statement Object
			Statement st = con.createStatement();
			
			//4.Process/Execute the  select sql Query
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println("Id:" + rs.getInt("printer_id"));
				System.out.println("Name:" +rs.getString("printer_name"));
				System.out.println("Model:" +rs.getString("model"));
				System.out.println("Type:" +rs.getString("type"));
				System.out.println("Resolution:" +rs.getString("resolution"));
				System.out.println("Price:" +rs.getInt("Price"));
				System.out.println("Purchase:" +rs.getDate("purchase_date"));
				System.out.println("Colour:" +rs.getString("colour"));
				System.out.println("-----------------------------------");
			}
			
			//5.Close the Resources
			rs.close();
			st.close();
			con.close();
		
		}
	}

