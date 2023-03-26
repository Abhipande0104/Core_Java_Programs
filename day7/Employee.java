package day7;

public class Employee 
{
	private int empid;
	private String empname;
	private double salary;
	MyDate1 hiredate;
	
	public Employee(int ei, String en, double s, MyDate1 hire)
	{
		empid=ei;
		empname=en;
		salary=s;
		hiredate=hire;
	}
	
	public void display()
	{
		System.out.println("The details of employee is ");
		System.out.println(empid+"  "+empname+"  "+salary+"  "+hiredate);
		System.out.println("     ");
	}
}
