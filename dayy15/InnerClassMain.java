package dayy15;

public class InnerClassMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SimpleOuter out = new SimpleOuter();
		out.display();
		
		SimpleOuter.Inner in = new SimpleOuter().new Inner();
		in.test();

	}

}
