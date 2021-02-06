package databases;

import CSVUser;

import java.io.FileReader;
import java.util.ArrayList;

import au.com.bytecode.opencsv.CSVReader;

public class ReadFromCSVFile {

	public ArrayList readFromCSV(){
		
	
	CSVReader reader;
	
	// Declare ArrayList with POJO generic class.
	
	try{
		reader = new CSVReader(new FileReader("CSV File Name path"));
		String[] newRow;
		
		while((newRow=reader.readNext())!=null){
			// Declare object from POJO class
			
			// call setter methods for each corresponding column index of CSV file. example in the next comment
			
			// user.setName(newRow[0]);
			
			// add POJO object into arraylist by calling add() method
			
				
		}
		
		
		
		
	}catch(Exception e){
		System.out.println(e);
	}
	
	}

}
