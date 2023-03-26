package day2;

public class AdditionMain 
{
	public static void main(String[] args)
	{
		Addition ad= new Addition();
		ad.add(10, 20, 30);
		ad.add(10, 20);
		ad.add(12.5f, 12.9f, 15.3f);
		ad.add(12, 12.6f);
		ad.add(12.4f, 12.4f);
		float var=ad.add(12.5f, 12.5f);
		System.out.println(var);

	}
}
