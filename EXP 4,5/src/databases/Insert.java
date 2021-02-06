package databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//load the jdbc driver-4 into application for mysql.
			Class.forName("com.mysql.jdbc.Driver");
			
			//establish the connection.
			//DriverManager.getConnection(connecctionURL,username,password)
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/em","root","");
			//statement object creation.
			String query="insert into ems values(?,?,?,?)";
			PreparedStatement psmt=(PreparedStatement) con.prepareStatement(query);
			
			psmt.setString(1, "17");
			psmt.setString(2, "pooja");
			psmt.setString(3, "5000");
			psmt.setString(4, "clerk");
			
			
			//execution of sql statement.output is table which is reperesented as resultset in application.
			int rows=psmt.executeUpdate();
			//retrive the data from resultset.
			
			System.out.println(rows+"row(s) are updated.");
			Statement stmt =con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from ems");
			
			
			System.out.println("eno\tename\tsaly\tedep");
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
				
			} 
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		

	}

}
