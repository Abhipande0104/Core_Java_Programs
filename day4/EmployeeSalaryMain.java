package day4;

public class EmployeeSalaryMain 
{

	public static void main(String[] args) 
	{
		EmployeeSalary es = new EmployeeSalary("xyz",20000.0f);
		es.display();
		EmployeeSalary es1 = new EmployeeSalary("qwe",30000.0f);
		es1.display();
		EmployeeSalary es2 = new EmployeeSalary("wer",40000.0f);
		es2.display();
		//EmployeeSalary es3 = new EmployeeSalary("rty",50000.0f);
		//es3.display();
		//es2.calculateAvgSalary();
	}

}
