package day5;

public class ThreadDemo extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
			
			};
		}
	}
	
	public static void main(String[] args)
	{
		Thread t1= new ThreadDemo();
		Thread t2= new ThreadDemo();
		
		t1.start();
		t1.setPriority(6);
		t2.start();
	}
}
