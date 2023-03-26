package day5;

public class EvenOdd 
{
	private int num, flag;
	public EvenOdd(int n)
	{
		num=n;
		flag=0;
	}
	public void checkEvenOdd()
	{
		if(num%2==0)
			flag=1;
	}
	public String toString()
	{
		if(flag==1)
			return num+" is even";
		else
			return num+" is odd";
	}
}
