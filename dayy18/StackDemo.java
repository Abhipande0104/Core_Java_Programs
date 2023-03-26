package dayy18;
import java.util.*;

public class StackDemo 
{
	public static void main(String[] args)
	{
		Stack<Integer> numstack = new Stack<Integer>();
		numstack.push(10);
		numstack.push(20);
		numstack.push(25);
		numstack.push(30);
		System.out.println(numstack);
		
		System.out.println("Top of Stack: "+numstack.peek());
		System.out.println("Element removed "+numstack.pop());
		numstack.push(50);
		
		System.out.println("Before sorting = "+numstack);
		//Collections.sort(numstack);
		System.out.println("After sorting = "+numstack);
		
	}
	
}
