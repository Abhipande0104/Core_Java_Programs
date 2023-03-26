package dayy18;
import java.util.*;

public class QueueDemo 
{
	public static void main (String[] args)
	{
		PriorityQueue<Integer> numq= new PriorityQueue<Integer>();
		numq.add(10);
		numq.add(20);
		numq.add(30);
		numq.add(40);
		numq.add(50);
		
		System.out.println("First is "+numq.peek());
		System.out.println("Queue is "+numq);
		numq.poll();
		System.out.println("First is "+numq.peek());
		System.out.println("After removing element");
		
		Iterator<Integer> it = numq.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
