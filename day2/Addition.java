package day2;

public class Addition 
{
	private int ans;
	private float ans1;

	
	public void add(int n1, int n2)
	{
		ans=n1+n2;
		System.out.println("addition of 2 int is "+ans);
	}
	public void add(int n1, int n2, int n3)
	{
		ans=n1+n2+n3;
		System.out.println("addition of 3 int is "+ans);
	}
	public void add(float n1, float n2, float n3)
	{
		ans1=n1+n2+n3;
		System.out.println("addition of 3 float is "+ans1);
	}
	public void add(int n1, float n2)
	{
		ans1=n1+n2;
		System.out.println("addition of 1 int and 1 float is "+ans1);
	}
	public float add(float n1, float n2)
	{
		ans1=n1+n2;
		return ans1;
	}
}
