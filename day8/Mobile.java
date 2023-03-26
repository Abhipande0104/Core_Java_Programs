package day8;

public class Mobile extends ElectronicDevice
{
	protected String MobileName="Samsung";
	protected int price=25000;
	
	public void displayMobile()
	{
		//System.out.println("This is Mobile ");
		System.out.println("The Mobile is of "+MobileName+" and price is "+price);
		System.out.println("  ");
	}
}