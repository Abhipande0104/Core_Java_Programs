package day6;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize
{
	public static void main(String[] args)
	{
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try
		{
			Employee ob=null;
			fis=new FileInputStream("serial.txt");
			ois=new ObjectInputStream(fis);
			ob= (Employee) ois.readObject();
			ob.display();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				ois.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
