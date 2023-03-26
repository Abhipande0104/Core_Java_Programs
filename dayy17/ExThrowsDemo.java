package dayy17;
import java.io.*;
import java.io.FileNotFoundException;

public class ExThrowsDemo 
{
	@SuppressWarnings("unused")
	public void readFile() throws FileNotFoundException
	{
		@SuppressWarnings("resource")
		FileInputStream fs= new FileInputStream("student.txt");
	}
	
	public static void main(String[] args)
	{
		ExThrowsDemo ex= new ExThrowsDemo();
		try
		{
			ex.readFile();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
	}
}





/*
 * throw keyword
 * --used to throw an object of exception class type
 * --it is used from within a method
 * --mandatory in case of application specific exception
 *   (User defined exception)
 *   
 * throws keyword
 * --used to report the exception by a method to its caller method
 * --it is used after method signature to report multiple exceptions
 * --mandatory in case of checked exception only
 */
