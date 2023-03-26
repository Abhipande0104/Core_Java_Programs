package dayy19;
import java.util.*;

public class EmpNameComparator implements Comparator<Employee>
{
	public int compare(Employee emp1, Employee emp2)
	{
		String emp1name=emp1.getName();
		String emp2name=emp2.getName();
		
		if(emp1name.equals(emp2name))
			return 1;
		else
			return 0;
	}
	
	public static void main(String[] args)
	{
		Employee emp1= new Employee(); //default empname=Abhishek
		Employee emp2= new Employee(101,"Abhishek",55000f);
		
		EmpNameComparator ec= new EmpNameComparator();
		int ie= ec.compare(emp1, emp2);
		System.out.println(ie);
	}
}
