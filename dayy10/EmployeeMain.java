package dayy10;

public class EmployeeMain 
{
	public static void main(String[] abcd)
	{
		Manager mg = new Manager(100,"ABHI",50000f);
		System.out.println(mg);
		mg.calculateSalary();
		
		SalesEmp se = new SalesEmp(101,"AJAY",50000,10);
		System.out.println(se);
		se.calculateSalary();
		
		//WageEmp we = new WageEmp(102,"XYZ",25f,500f);
		//we.calculateSalary();
		
	}
}
