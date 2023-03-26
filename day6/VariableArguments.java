package day6;

public class VariableArguments 
{
	private String name;
	public void add(String sn, int ...num)
	{
		int sum=0;
		name=sn;	
		for(int n:num)
		{
			sum=sum+n;
		}
		System.out.println(name+"\t"+" sum is "+(sum));
	}	
	
	public void add(float a, int ... num)
	{
		int sum=0;
		for(int n:num)
		{
			sum=sum+n;
		}
		System.out.println("Total is "+(sum+a));
	}
}
