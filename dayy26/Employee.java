package day6;

import java.io.Serializable;

public class Employee implements Serializable
{
	private int empId;
	private String name;
	private double basicSalary;
	
	public Employee()
	{
		empId=100;
		name="ABC";
		basicSalary=5000.0;
	}
	public Employee(int empId, String name, double basicSalary)
	{
		this.empId=empId;
		this.name=name;
		this.basicSalary=basicSalary;
	}
	public void display()
	{
		System.out.println("Emp Id= "+empId+" name is "+name+" basic salary is"+basicSalary);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee [empId="+empId+" , name= "+name+" , salary is"+basicSalary+"]";
	}
}
