package dayy19;

public class Employee implements Comparable<Employee>
{
	int empid;
	String name;
	float salary;
	
	public Employee()
	{
		empid=100;
		name="Abhishek";
		salary=50000f;
	}
	
	public Employee(int empid, String name, float salary)
	{
		this.empid=empid;
		this.name=name;
		this.salary=salary;
	}
	
	public int getEmpId()
	{
		return empid;
	}
	public String getName()
	{
		return name;
	}
	public float getSalary()
	{
		return salary;
	}
	
	public String toString()
	{
		return(empid+"\t"+name+"\t"+salary+"\t");
	}
	
	public int compareTo(Employee e)
	{
		if(this.salary > e.salary)
			return 1;
		else if (this.salary < e.salary)
			return -1;
		else
			return 0;
	}
	
	public static void main(String[] args)
	{
		Employee emp1= new Employee(); //default empid=100
		Employee emp2= new Employee(10,"Ajay",45000f);
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		int i= emp1.compareTo(emp2);
		System.out.println(i);
	}
}
