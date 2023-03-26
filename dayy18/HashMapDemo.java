package dayy18;
import java.util.*;

public class HashMapDemo 
{
	public static void main(String[] args)
	{
		HashMap<String, Integer> directory=new HashMap<String, Integer>();
		directory.put("ABC", 123);
		directory.put("PQR", 456);
		directory.put("XYZ", 789);
		directory.put("PQR", 852);
		System.out.println(directory);
		
		System.out.println("Phone no is "+directory.get("XYZ"));
	}
}
