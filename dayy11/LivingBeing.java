package dayy11;

public class LivingBeing 
{
	public static void main(String[] args)
	{
		Animal anm1 = new Tiger();
		((Tiger)anm1).eat();
		
		Animal anm2 = new Elephant();
		((Elephant)anm2).eat();
	}
}
