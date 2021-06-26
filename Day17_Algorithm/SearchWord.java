/**
 * @author PRATHAMESH TIBILE
 *  to read the file and check if the word is in the file or not
 *  @since 24-6-21
 */
package Day17_Algorithm;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SearchWord {
	//Function to read the file and return
	public static void main(String[] args) 
	{
		
		int result = 0;
		System.out.println("ENter Path for file: " );
		String filePath = InputUtility.inputString();
		System.out.println("Enter Name of the File: ");
		String fileName = InputUtility.inputString();
		List<String> list = new ArrayList<>();
		List<String> tempList = new ArrayList<>();
		System.out.println("Enter Words: ");
		
		int i = 0;
		while(i < 5)
		{
			String words = InputUtility.inputString();
			list.add(words);
			i++;
		}
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("Enter Word to Search");
		String toSearch = InputUtility.inputString();
		
		try
		{
			String lines;
			File file = new File(filePath+fileName);
			boolean isCreated = file.createNewFile();
			System.out.println(list);
			FileWriter fileWriter = new FileWriter(file);
			
			FileReader fileReader = new FileReader(file);
			@SuppressWarnings("resource")
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			//String isFetching = bufferedReader.readLine();
			

			if(isCreated)
			{
				
				//for(String str: list)
				//{
					fileWriter.write(list+System.lineSeparator());
					
				//}
				
				System.out.println("File Created Successfully...!!!");
				fileWriter.close();
				lines = bufferedReader.readLine();
				while(lines !=null)
				{
					//result = Collections.binarySearch(list, toSearch);
					tempList.add(lines);
					lines = bufferedReader.readLine();
					System.out.println(tempList);
			         
				}
				
				
			}
			else
				System.out.println("Already Present in the destination");
		}
		catch (Exception e) 
		{
			System.out.println("Exception Occured: ");
			e.printStackTrace();
		}
		
		//reading from file...
		System.out.println("Temporary List: "+tempList);
		result = Collections.binarySearch(tempList, toSearch);
		if (result != -1) 
            System.out.println("Element found at index " + result);
		else
			System.out.println("Not Found");
		
	}
	
}
