package day3;

public class CircleArea 
{
	private int radius;
	private double pi, area;
	
	public CircleArea(int radius, double pi)
	{
		this.radius=radius;
		this.pi=pi;
		//this.area=area;
	}
	public void calculateCircleArea()
	{
		area=pi*radius*radius;
	}
	public void displayCircleArea()
	{
		System.out.println("The area of circle is "+area);
	}
}
