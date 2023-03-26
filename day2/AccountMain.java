package day2;

public class AccountMain 
{
	public static void main(String[] args)
	{
		Account acc=new Account();
		int a=101010;
		String o="XYZ";
		double b=25000;
		
		acc.setAccNo(a);
		acc.setOwnerName(o);
		acc.setBalance(b);
		
		int var1=acc.getAccNo();
		String var2=acc.getOwnerName();
		double var3=acc.getBalance();
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);

		
		
	}
}
