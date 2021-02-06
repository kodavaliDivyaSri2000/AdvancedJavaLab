package databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				try {
					//load the jdbc driver-4 into application for mysql.
					Class.forName("com.mysql.jdbc.Driver");
					
					//establish the connection.
					//DriverManager.getConnection(connecctionURL,username,password)
					
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/em","root","");
					//statement object creation.
					String query="select * from ems where saly >?";
					PreparedStatement psmt=(PreparedStatement) con.prepareStatement(query);
					
					psmt.setString(1, "5000");
					
					//execution of sql statement.output is table which is reperesented as resultset in application.
					ResultSet rs=psmt.executeQuery();
					
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
