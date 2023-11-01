package OOPS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Compileexception {

	public static void main(String[] args) throws FileNotFoundException {
		try
		{
		FileInputStream f=new FileInputStream("C:\\Users\\HP\\OneDrive\\Documents\\SOFTWARE TESTING\\javaprograms\\pkg");
		System.out.println("arya");
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
