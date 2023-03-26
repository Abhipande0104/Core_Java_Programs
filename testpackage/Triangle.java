package testpackage;

public class Triangle 
{
	private int length;
	private int height;
	private float area;
	
	public Triangle(int l, int h)
	{
		length=l;
		height=h;
	}
	
	public void triangleArea()
	{
		area=0.5f*length*height;
		System.out.println("The area of triangle is "+area);
	}
}
