package day6;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomReadFile 
{
	public static void main(String[] args)
	{
		RandomAccessFile rin=null;
		try
		{
			rin=new RandomAccessFile("C:\\Users\\Admin\\eclipse-workspace\\SeedClassBook2\\src\\"
					+ "day6\\info.txt", "r");
			rin.seek(5);
			System.out.print("File pointer position: "+ rin.getFilePointer()+ "\n");
			int data=0;
			while((data=rin.read())!=-1)
				System.out.print((char)data);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				rin.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
