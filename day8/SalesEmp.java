package day8;

public class SalesEmp extends Employee
{
	private double incentive=0.08;
	private double net;
	
	public SalesEmp(int empid, String empname, float bsalary)
	{
		this.empid=empid;
		this.empname=empname;
		this.bsalary=bsalary;
	}
	
	public void calculateIncentive()
	{
		net=bsalary+incentive*bsalary;
		System.out.println("The total salary of SalesEmployee including "
				+ "incentive is  "+net);
				
	}
}
