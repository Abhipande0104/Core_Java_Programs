package day7;

public class DateMain 
{
	public static void main(String[] args) 
	{
		Account ac= new Account(777,"Abhishek",new MyDate1(01,04,2022));
		ac.display();
		
		Student st= new Student(23,"Ajay",new MyDate1(01,02,2002));
		st.display();
	}
}
