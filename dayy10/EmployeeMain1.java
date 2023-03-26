package dayy10;

//import java.util.Collection;
//import java.util.Collections;

public class EmployeeMain1 
{
	public static void main(String[] args)
	{
		Manager mg= new Manager(100,"shivam",12000f);
		System.out.println("Manager = "+mg);
		mg.calculateSalary();
		
		Employee emp1= new Employee(101,"shivani",25000f);
		System.out.println("employee = "+emp1);
		emp1.calculateSalary();
		
		Employee emp2= new Manager(101,"shivani",25000f);
		System.out.println("employee = "+emp2);
		((Manager)emp2).calculateSalary();
		
		System.out.println(emp1 instanceof Manager);
		//Collections.sort();
		
	}
}
