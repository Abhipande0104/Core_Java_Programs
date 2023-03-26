package dayy15;

public class StaticOuterMain 
{
	public static void main(String[] args)
	{
		StaticOuterClass out = new StaticOuterClass();
		out.display();
		
		StaticOuterClass.Inner.test();
	}
}
