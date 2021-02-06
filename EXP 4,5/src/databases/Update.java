package databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) {
		try {
			//load the jdbc driver-4 into application for mysql.
			Class.forName("com.mysql.jdbc.Driver");
			
			//establish the connection.
			//DriverManager.getConnection(connecctionURL,username,password)
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/em","root","");
			String query="update ems set saly=? where eno=?";
			PreparedStatement upsmt=(PreparedStatement) con.prepareStatement(query);
			
			upsmt.setString(1, "2500");
			upsmt.setString(2, "18");
			
			int rows=upsmt.executeUpdate();
			//retrieve data from resultset
			System.out.println(rows+" row(s) are updated.");
			
			Statement stmt=con.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from ems");
			
			//retrive the data from resultset
			System.out.println("eno\tename\tsaly\tedept");
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
