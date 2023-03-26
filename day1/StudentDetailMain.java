package day1;

public class StudentDetailMain 
{
	public static void main(String [] args)
	{
		int r, y, p;
		StudentDetails sd= new StudentDetails();
		r=112040;
		y=2020;
		p=90;
		sd.initStudentData(r,y,p);
		sd.displayStudentsDetails();
	}
}
