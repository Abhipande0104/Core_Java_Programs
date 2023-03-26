package day1;

public class CircleAreaMain 
{
	public static void main(String[] args)
	{
		int r;
		double p;
		//double a;
		CircleArea ca = new CircleArea();
		r=10;
		p=3.14;
		ca.initValue(r,p);
		ca.calculateArea();
		ca.displayArea();
		
	}
}
