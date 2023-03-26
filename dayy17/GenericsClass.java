package dayy17;
import java.util.ArrayList;

public class GenericsClass
{
	public static void main(String[] args)
	{
		ArrayList<Integer> li1 = new ArrayList<Integer>();
		li1.add(10);
	//	li1.add("ABC");
		
		ArrayList<String> li2= new ArrayList<String>();
		li2.add("Abhishek");
	//	li2.add(10);
		
		System.out.println(li1);
		System.out.println(li2);
	}
}
