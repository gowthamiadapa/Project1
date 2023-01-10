package frameworks.csvfiles;

import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class Write_Data_into_Csvfiles
{

	public static void main(String[] args) throws Exception 
	{
	
		//Create file
		String filepath="src\\CSVfiles\\input.csv";
		FileWriter fw=new FileWriter(filepath);
				
		//To write date into csv file create object for csvwriter
		CSVWriter writer=new CSVWriter(fw);
				
		String header[]={"Username","Password"};
		writer.writeNext(header);
			
		String Line1[]={"aakash","Hello1234"};
		writer.writeNext(Line1);
			
		//save and close
		writer.close();

			}


	}


