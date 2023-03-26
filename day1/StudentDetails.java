package day1;

public class StudentDetails 
{
	private int rollNo;
	private int year;
	private float percentage;
	
	public void initStudentData(int r, int y, float p)
	{
		rollNo=r;
		year=y;
		percentage=p;
	}
	
	public void displayStudentsDetails()
	{
		System.out.println("The Student data is: roll no "+rollNo+" year "+year+
				" percentage is"+percentage);
	}
}
