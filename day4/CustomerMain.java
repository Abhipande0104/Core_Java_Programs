package day4;

public class CustomerMain 
{
	public static void main(String[] args)
	{
		Customer obj = new Customer("abhishek",80000f,2f);
		obj.calculateSimpleInterest();
		obj.displayCustomerDetails();
		
		Customer obj1 = new Customer("ajay",20000f,2f);
		obj1.calculateSimpleInterest();
		obj1.displayCustomerDetails();
		
		Customer obj2 = new Customer("sahil",10000f,2f);
		obj2.calculateSimpleInterest();
		obj2.displayCustomerDetails();
	}
}
