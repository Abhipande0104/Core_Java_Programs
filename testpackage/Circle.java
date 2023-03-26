package testpackage;

public class Circle 
{
	private int radius;
	private float pi=3.14f;
	private float area;
	
	public Circle(int radius)
	{
		this.radius=radius;
	}
	
	public void circleArea()
	{
		area=pi*radius*radius;
		System.out.println("The area of circle is "+area);
	}
}
