package day8;

public class Computer extends ElectronicDevice
{
	protected String ComputerName="Dell";
	protected int price=50000;
	
	public void displayComputer()
	{
		//System.out.println("This is computer ");
		System.out.println("The computer is of "+ComputerName+" and price is "+price);
		System.out.println("  ");
	}
}
