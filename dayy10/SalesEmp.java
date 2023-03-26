package dayy10;

public class SalesEmp extends Employee
{
	private float incentive, total;
	
	public SalesEmp(int empid, String empname, float salary, float incentive)
	{
		//this.empid=empid;
		//this.empname=empname;
		//this.salary=salary;
		super(empid, empname, salary);
		this.incentive=incentive;
	}
	
	public void calculateSalary()
	{
		total=salary+((salary*incentive)/100);
		System.out.println("Total salary of Sales Employee is "+total);
		System.err.println("  ");
	}
}
