package day8;

public class Manager extends Employee
{
	protected int net, basic;
	protected double hra=0.08;
	protected double da=0.07;
	
	public Manager(int empid, String empname, float bsalary)
	{
		this.empid=empid;
		this.empname=empname;
		this.bsalary=bsalary;
	}
	
	public void calculateSalary()
	{
		double net=bsalary+hra*bsalary+da*bsalary;
		System.out.println("The total salary of manager including hra and da is "+net);
		System.out.println(" ");
	}
}
