package databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.sql.PreparedStatement;

import com.mysql.jdbc.PreparedStatement;


public class DBOperations {
	
	public Connection getDBConnection(){
		Connection con=null;
		try {
			// load the jdbc driver-4 into application for mysql.
			Class.forName("com.mysql.jdbc.Driver");
			
			//establish the connection.
			// DriverManager.getConnection(connectionURL, username,password)
			
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SchemaName","Username","Password");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return con;
	}
	
	public void closeDBConnection(Connection con){
		try
        {
            con.close();
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
	}
	
	public int insertRows(ArrayList<E> list){
		int rows=0;
		try{
			Connection con=getDBConnection();
			//create insert query relevent to your application with ? instead of values 
			String query="insert into ";
			
			PreparedStatement psmt=con.prepareStatement(query);
			
			// Create object of Iterator from ArrayList and then iterate through
			
			Iterator<E> it=list.iterator();
			
			while(it.hasNext()){
				// Create POJO object from it.next
				POJOClass object=it.next();
				// call setXXX() methods to set the values with the values of POJO class members by calling its getter in place of each ?
				
				psmt.setString(1, object.getXXX());
				
				
				rows=psmt.executeUpdate();
			}
	      closeDBConnection(con);
		}
		catch(Exception e){
			e.printStackTrace();
		}
				
		return rows;
 }
	
	// define selectqueryN () for each select query in the problem statement. 
	public void selectQuery1(String param1,String param2)
	// Parameter list as per your requirement to set the values into select query
	{
		try{
			// prepare select query relevant to your requirement with ? .
			String query="select ...";
			Connection con=getDBConnection();
			PreparedStatement psmt=con.prepareStatement(query);
			
			// call psmt.setXXX() methods to set the values into all ? in query.
			
			// execute quey
			ResultSet rs=psmt.executeQuery();
			
			// Iterate rs to show results of query
			
			
			closeDBConnection(con);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		
	}

}
