package dayy18;
import java.util.*;

public class HashSetDemo 
{
	public static void main(String[] args)
	{
		HashSet<String> skillset= new HashSet<String>();
		skillset.add("RWD");
		skillset.add("cProgramming");
		skillset.add("SQL");
		skillset.add("Java");
		skillset.add("SQL");
		System.out.println(skillset);
		
		Iterator<String> it =skillset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
