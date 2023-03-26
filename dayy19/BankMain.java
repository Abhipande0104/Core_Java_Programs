package dayy19;
import java.util.*;

public class BankMain 
{
	public static void main(String[] args)
	{
		Account ac1= new Account(101,"ABC");
		Account ac2= new Account(102,"PQR");
		Account ac3= new Account(103,"XYZ");
		
		ArrayList<Account> listacc= new ArrayList<Account>();
		
		listacc.add(ac1);
		listacc.add(ac2);
		listacc.add(ac3);
		
		Iterator<Account> it= listacc.iterator();
		while(it.hasNext())
		{
			//it.next().display();
			System.out.println(it.next());
		}
	}
}
