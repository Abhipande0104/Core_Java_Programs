package day4;

public class RunnableThread implements Runnable
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(i+" Hello");
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
		Runnable r1= new RunnableThread();
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r1);
		Thread t3=new Thread(r1);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
