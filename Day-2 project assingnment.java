import java.sql.*;
class DatabaseConnection {
	public static void main(String[] args) {
		try{
			// Register the Driver
			// Get MySQL connector for Java

			Class.forName("com.mysql.cj.jdbc.Driver");

			// Create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/essentials", "root", "system");

			//Create Statement
			Statement st = con.createStatement();

			//Executing Query
			ResultSet rs = st.executeQuery("select * from student;");

			while(rs.next())
			{
				System.out.println("Roll: " + rs.getInt(1));
				System.out.println("Name: " + rs.getString(2));
				System.out.println("Mark: " + rs.getInt(3));
			}
		
			//Close connection
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("Exception Handled");
		}
		

	}

}
