package dayy11;

public class HashCodeDemo 
{
	public static void main(String[] abcd)
	{
		//Integer i = new Integer(30);
		//System.out.println("Hashcode of i is "+i.hashCode());
		
		String a = "abc";
		System.out.println("Hash code of abcd is "+a.hashCode());
		
		HashCodeDemo hc = new HashCodeDemo();
		//Class temp=hc.getClass();
		System.out.println(hc.getClass());
	}
}
