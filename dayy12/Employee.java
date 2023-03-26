package dayy12;

public class Employee implements printable
{
	private int empid;
	private String empname;
	private float salary;
	
	public Employee(int empid, String empname, float salary)
	{
		this.empid=empid;
		this.empname=empname;
		this.salary=salary;
	}
	public void print()
	{
		System.out.println("Employee ID "+empid+" Employee name "+empname
				+" Salary "+salary);
	}
}
