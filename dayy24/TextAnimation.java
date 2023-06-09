package day4;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Font;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class TextAnimation extends Frame implements Runnable
{
	Thread t1,t2;
	int x1,x2,y1,y2;
	public TextAnimation()
	{
		t1= new Thread(this);
		t2= new Thread(this);
		
		t1.start();
		t2.start();
		
		x1=50;
		x2=500;
		y1=100;
		y2=150;
	}
	
	@Override
	public void paint(Graphics g)
	{
		// TODO Auto-generated method stub
		Font f= new Font("Arial", Font.BOLD, 30);
		g.setFont(f);
		
		g.setColor(Color.MAGENTA);
		g.drawString("Sinhgad College", x1, y1);
		
		g.setColor(Color.YELLOW);
		g.drawString("Seed Infotech", x2, y2);
	}
	
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		try
		{
			for(int i=0; i<600;i++)
			{
				x1++;
				x2--;
				Thread.sleep(50);
				repaint();
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception occcured");
			e.printStackTrace();
		};
	}
	public static void main(String[] args)
	{
		Frame f= new TextAnimation();
		f.setTitle("Text Animation");
		f.setSize(700,500);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
}
