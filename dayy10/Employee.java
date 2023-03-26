package dayy10;

public class Employee 
{
	protected int empid=100;
	protected String empname;
	protected float salary, hra, da, net;
	
	public Employee(int empid, String empname, float salary)
	{
		this.empid=empid;
		this.empname=empname;
		this.salary=salary;
	}
	
	public String toString()
	{
		return "The ID is "+empid+"\tName "+empname+"\tSalary "+salary;
	}
	
	public void calculateSalary()
	{
		hra=salary*0.08f;
		da=salary*0.10f;
		net=salary+hra+da;
		System.out.println("Total salary is "+net);
		//System.out.println(" ");
	}
}
