package day2;

public class AccessorMutatorMain 
{

	public static void main(String[] args) 
	{
		AccessorMutator am=new AccessorMutator();
		int n=10;
		am.setNum(n);
		int var=am.getNum();
		System.out.println(var);
	}

}
