package dayy17;
import java.util.ArrayList;
//upperbound

public class WildCardGenerics1 
{
	public static double calculate(ArrayList<? extends Number> li)
	{
		double ans=0.0;
		for(Number n:li)
		{
			ans=ans+n.doubleValue();
		}
		return ans;
	}
	
	public static void main(String[] args)
	{
		ArrayList <Integer> li1 = new ArrayList<Integer>();
		li1.add(10);
		li1.add(20);
		System.out.println("Addition = "+calculate(li1));
		
		ArrayList <Double> li2 = new ArrayList<Double>();
		li2.add(20.5);
		li2.add(23.9);
		System.out.println("Addition = "+calculate(li2));
	}
}
