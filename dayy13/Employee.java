package dayy13;
import java.util.Scanner;

public class Employee 
{
	
	public static void main(String [] agr)
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String empname;
		//int id;
		float salary;
		
		System.out.println("enter name ");
		empname= sc.next();
	
		System.out.println("enter salary ");
		salary= sc.nextFloat();
		
		EmployeeSalary e = new EmployeeSalary(empname, salary);
		e.display();
		EmployeeSalary e1 = new EmployeeSalary(empname, salary);
		e1.display();
		
		
	}
}

/*
 * gujg
 * 
 */
