package dayy18;

import java.util.*;

public class CountriesDetails
{
	public static void main(String[] args)
	{
		ArrayList<String> countries= new ArrayList<String>();
		countries.add("India");
		countries.add("Thailand");
		countries.add("Japan");
		countries.add("America");
		System.out.println(countries);
		
		Iterator<String> it = countries.iterator();
		while(it.hasNext())
		{									
			String country = it.next();
			System.out.println(country);
		}	
		
		countries.remove(1);
		System.out.println(countries);

	}
}
