package day5;

import java.awt.*;

public class RunThreeBallsDemo extends Frame implements Runnable
{
	Thread t1, t2, t3;
	int x1, x2, x3;
	public RunThreeBallsDemo()
	{
		t1= new Thread(this);
		t2= new Thread(this);
		t3= new Thread(this);
		t1.start();
		t2.start();
		t3.start();
		
		x1 = x2 = x3 = 50;
	}
	
	@Override
	public void paint(Graphics g)
	{
		// TODO Auto-generated method stub
		g.setColor(Color.red);
		g.fillOval(x1, 50, 50, 50);
		g.setColor(Color.green);
		g.fillOval(x2, 200, 50, 50);
		g.setColor(Color.blue);
		g.fillOval(x3, 350, 50, 50);

	}
	
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		try
		{
			for(;;)
			{
				if(Thread.currentThread()==t1)
				{
					if(x1==400)
					{
						synchronized(this)
						{
							wait();
						}
					}
					else
					{
						x1++;
					}
					Thread.sleep(2);
					repaint();
				}
				if(Thread.currentThread()==t2)
				{
					if(x2==400)
					{
						synchronized(this)
						{
							wait();
						}
					}
					else
					{
						x2++;
					}
					Thread.sleep(4);
					repaint();
				}
				if(Thread.currentThread()==t3)
				{
					if(x3==400)
					{
						synchronized(this)
						{
							x1 = x2 = x3 =50;
							notifyAll();
						}
					}
					else
					{
						x3++;
					}
					Thread.sleep(6);
					repaint();
				}
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args)
	{
		RunThreeBallsDemo ob= new RunThreeBallsDemo();
		ob.setSize(600, 500);
		ob.setLocationByPlatform(true);
		ob.setVisible(true);
	}
}
