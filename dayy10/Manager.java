package dayy10;

public class Manager extends Employee
{
	private float extra;
	
	public Manager(int empid, String empname, float salary)
	{
		super(empid, empname, salary);
		this.extra=4000f;
	}
	
	@Override
	public void calculateSalary() 
	{
		super.calculateSalary();
		net=net+extra;
		System.out.println("Total salary with allowance is "+net);
		//System.out.println(" ");
	}
}
