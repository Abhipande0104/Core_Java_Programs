package day6;

public class VariableArguemntsMain 
{
	public static void main(String[] args)
	{
		VariableArguments obj=new VariableArguments();
		obj.add("xyz",9,15,29);
		obj.add(10.96f,2,4);
		obj.add(9.69f,16,99);
		obj.add(5.0f);
	}
}

/* 
 * varArgs
 * 
 * method that accepts zero to many arguments is called varArgs method
 * used to reduce versions of overloaded methods in the appllication.
 * */ 
