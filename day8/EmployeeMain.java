package day8;

public class EmployeeMain 
{
	public static void main(String[] abhi)
	{
		Manager obj= new Manager(101,"Abhishek",50000.2f);
		obj.display();
		obj.calculateSalary(); 
		
		SalesEmp obj1=new SalesEmp(202,"Ajay",50000.2f);
		obj1.display();
		obj1.calculateIncentive();
	}
}
