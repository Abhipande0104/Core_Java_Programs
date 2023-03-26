package day8;

public class TV extends ElectronicDevice
{
	protected String TVName="Onida";
	protected int price=80000;
	
	public void displayTV()
	{
		//System.out.println("This is TV ");
		System.out.println("The TV is of "+TVName+" and price is "+price);
		System.out.println("  ");
	}
}
