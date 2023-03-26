package testpackage;

public class Rectangle 
{
	private int length;
	private int height;
	private float area;
	
	public Rectangle(int l, int h)
	{
		length=l;
		height=h;
	}
	
	public void rectangleArea()
	{
		area=length*height;
		System.out.println("The area of rectangle is "+area);
	}
}
