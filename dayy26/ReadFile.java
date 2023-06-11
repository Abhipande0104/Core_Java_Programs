package day6;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile 
{
	public static void main(String[] at)
	{
		FileInputStream fin= null;
		try
		{
			fin=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\"
					+ "SeedClassBook2\\src\\day6\\info.txt");
			int data=0;
			while((data=fin.read())!=-1)
			{
				System.out.print((char)data);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			try
			{
				fin.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
