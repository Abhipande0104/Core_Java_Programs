package day8;

public class Employee 
{
	protected int empid;
	protected String empname;
	protected float bsalary;
	
	public void display()
	{
		System.out.println("Employee ID is "+empid+"\tEmployeee Name is "+empname+
					"\tBaseSalary is "+bsalary);
		System.out.println("  ");
	}
}
