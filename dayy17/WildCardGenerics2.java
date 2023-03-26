package dayy17;

import java.util.ArrayList;

public class WildCardGenerics2 
{
	static void printList(ArrayList <? super Integer> li)
	{
		for(Object num:li)
		{
			System.out.println(num);
		}
	}
	
	public static void main(String[] args)
	{
		ArrayList<Number> li = new ArrayList<Number>();
		li.add(10);
		li.add(20.36);
		li.add(8);
		printList(li);
	}
}
