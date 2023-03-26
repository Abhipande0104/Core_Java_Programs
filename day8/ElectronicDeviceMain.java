package day8;

public class ElectronicDeviceMain 
{
	public static void main(String[] args)
	{
		Computer obj = new Computer();
		obj.displayElectronics();
		obj.displayComputer();

		Mobile obj1 = new Mobile();
		obj1.displayElectronics();
		obj1.displayMobile();
		
		TV obj2 = new TV();
		obj2.displayElectronics();
		obj2.displayTV();
	}
}
