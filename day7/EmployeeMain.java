package day7;

public class EmployeeMain 
{
	public static void main(String[] args) 
	{
		Employee md= new Employee(100,"XYZ",25000.0,new MyDate1(01,04,2002));
		md.display();
		
		Employee md1= new Employee(101,"PQR",35000.0,new MyDate1(02,04,2002));
		md1.display();
		
		Employee md2= new Employee(102,"ABC",45000.0,new MyDate1(03,04,2002));
		md2.display();
	}
}
