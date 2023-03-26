package testpackage;

public class ArithmaticMain {

	public static void main(String[] args) 
	{
		Addition obj1= new Addition(10, 20);
		obj1.add();
		Substraction obj2 = new Substraction(20, 10);
		obj2.sub();
		Multiplication obj3 = new Multiplication(20, 10);
		obj3.mul();
		Division obj4 = new Division(20, 10);
		obj4.div();
	}

}
