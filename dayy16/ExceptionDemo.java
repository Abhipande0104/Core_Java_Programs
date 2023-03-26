package dayy16;
import java.io.*;

public class ExceptionDemo 
{
	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		FileInputStream fs;
		try
		{
			System.out.println("Hello");
			fs = new FileInputStream("student.txt");
			System.out.println("Bye");
		}
		catch(ArithmeticException e)
		{
			System.err.println("Divide by zero not allowed");
		}
		catch(FileNotFoundException e)
		{
			System.err.println("Mentioned file is not found"+e);
		}
		catch(@SuppressWarnings("hiding") IOException e)
		{
			System.out.println("IO exception"+e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally 
		{
		System.out.println("Bye");
		}
	}
}




/*
 * FINALLY BLOCK
 * Some resources that are used in the try block need to be released to avoid
 * resource leakage when the error has occured.
 * 'finally' block is used
 * 'finally' block must follow all catch blocks
 * if no catch blocks are provided, then finally must follow simple try block
 * 
 * finally is always executed.
 * 
 */
