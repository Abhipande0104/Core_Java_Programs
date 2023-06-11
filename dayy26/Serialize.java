package day6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize
{
	public static void main(String[] args)
	{
		FileOutputStream fos= null;
		ObjectOutputStream oos = null;
		try
		{
			Employee emp=new Employee(1001, "PQR", 10000.0);
			fos=new FileOutputStream("serial.txt");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(emp);
			System.out.println("Employee object is serialized successfully");			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				oos.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
