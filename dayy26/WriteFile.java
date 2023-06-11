package day6;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile
{
	public static void main(String[] args)
	{
		FileOutputStream fout=null;
		try
		{
			fout=new FileOutputStream("data.txt", true);
			String s = "\n All the best";
			for(int i=0; i<s.length(); i++)
				fout.write(s.charAt(i));
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
				fout.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
