package day6;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomWriteFile
{
	public static void main(String[] args)
	{
		RandomAccessFile rout = null;
		try
		{
			rout = new RandomAccessFile("C:\\Users\\Admin\\eclipse-workspace"
					+ "\\SeedClassBook2\\src\\day6\\info.txt", "rw");
			rout.seek(5);
			String s= "Core Java Book2";
			
			for (int i=0; i<s.length(); i++)
				rout.write(s.charAt(i));
			System.out.println("data is written successfully");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				rout.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
