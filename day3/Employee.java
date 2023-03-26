package day3;

public class Employee 
{
	private int empid;
	private String empname;
	private double salary;
	
	public Employee(int ei, String en, double s)
	{
		empid=ei;
		empname=en;
		salary=s;
	}
	
	public void displayDetails()
	{
		System.out.println("The deatils of employee is ");
		System.out.println(empid+"/"+empname+"/"+salary);
	}
}
