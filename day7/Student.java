package day7;

public class Student 
{
	private int rollNo;
	private String name;
	MyDate1 birthDate;
	
	public Student()
	{
		rollNo=22;
		name="Abhishek";
	}
	public Student(int roll, String n, MyDate1 bd)
	{
		rollNo=roll;
		name=n;
		birthDate=bd;
	}
	public void display()
	{
		System.out.println("The details of student is ");
		System.out.println("Roll No is "+rollNo+"   Name is "+name+"   BirthDate is "+
								birthDate);
		System.out.println("     ");
	}
}
