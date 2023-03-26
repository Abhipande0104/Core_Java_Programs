package day1;

public class AdditionMain 
{
	public static void main(String [] args)
	{
		int n1, n2;
		Addition add1= new Addition();
		n1=90;
		n2=20;
		
		add1.initValues(n1, n2);
		add1.calculateAddition();
		
		Addition add2= new Addition();
		n1=50;
		n2=20;
		
		add2.initValues(n1, n2);
		add2.calculateAddition();
		
		//Addition add= new Addition();
		//add.initValues();
		//add.calculateAddition();
		
		/*Substraction sub =new Substraction();
		sub.initValues();
		sub.calculateSubstraction();
		
		Multiplication mul= new Multiplication();
		mul.initValues();
		mul.calculateMultiplication();
		
		Division div=new Division();
		div.initValues();
		div.calculateDivision();*/
		
	}
}
