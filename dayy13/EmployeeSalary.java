package dayy13;

public class EmployeeSalary 
{
	static
	{
		empid=100;
		totalsalary=0;
	}
	
	private static int empid;
	private String empname;
	private float salary;
	private static float totalsalary, avgsalary;
	
	public EmployeeSalary(String empname, float salary)
	{
		empid++;
		this.empname=empname;
		this.salary=salary;
		totalsalary=totalsalary+this.salary;
	}
	
	public void display()
	{
		System.out.println("Empid = "+empid+" emp name is "+empname+" salary is "+salary);
		
	}
	public static void calculateAvgSalary()
	{
		avgsalary=totalsalary/3;
		System.out.println("Average of 3 employee salary is "+avgsalary);
	}
}
