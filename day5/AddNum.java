package day5;

public class AddNum 
{
	private int num;
	
	public AddNum(int n)
	{
		num=n;
	}
	public void display()
	{
		System.out.println(num);
	}
	public static void add(AddNum t1, AddNum t2)
	{
		int add;
		add=t1.num+t2.num;
		System.out.println("Answer is "+add);
	}
}
