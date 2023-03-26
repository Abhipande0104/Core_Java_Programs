package day2;

public class Multiplication 
{
	private int ans;
	private float ans1;
	
	public float mulitply(float n1, float n2)
	{
		ans1=n1*n2;
		return ans1;
	}
	public void multiply(int n1, int n2, int n3)
	{
		ans=n1*n2*n3;
		System.out.println("The multiplication of 3 int is "+ ans);
	}
	public void multiply(float n1, int n2)
	{
		ans1=n1*n2;
		System.out.println("The multiplication of 1 float and 1 int is "+ ans1);
	}
	public int multiply(int n1, int n2)
	{
		ans=n1*n2;
		return ans;
	}
	
}
