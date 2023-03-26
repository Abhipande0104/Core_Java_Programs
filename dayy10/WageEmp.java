package dayy10;

public class WageEmp extends Employee
{
	private float days, rate, salary;
	
	public WageEmp(int empid, String empname, float days, float rate, float salary)
	{
		//this.empid=empid;
		//this.empname=empname;
		super(empid, empname, salary);
		this.rate=500f;
		this.days=25;
	}
	
	public void calculateSalary()
	{
		salary=rate*days;
		System.out.println("The salary of daily wage employees for "+days+" days is "
				+ salary);
	}
}
