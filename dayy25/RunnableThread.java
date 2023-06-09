package day5;

public class RunnableThread implements Runnable
{
	public void run()
	{
		for(int i=0; i<500; i++)
		{
			System.out.println(i + " Hello");
		}
	}
	public static void main(String[] args) throws InterruptedException
	{
		Runnable r1= new RunnableThread();
		Thread t1= new Thread(r1);
		Thread t2= new Thread(r1);
		t1.start();
		Thread.yield();
		t1.start();
		t2.start();
	}
}
