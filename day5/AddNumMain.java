package day5;

public class AddNumMain 
{
	public static void main(String [] args)
	{
		AddNum obj1 = new AddNum(10);
		AddNum obj2 = new AddNum(50);
		obj1.display();
		obj2.display();
		
		AddNum.add(obj1, obj2);
	}
}
