package day2;

import java.awt.GridLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo extends JFrame
{
	JButton btnArr[];
	Container contentPane;
	
	public GridLayoutDemo()
	{
		btnArr = new JButton[10];
		for(int i=0;i<btnArr.length;i++)
		{
			btnArr[i]= new JButton(""+i);
		}
		
		contentPane= getContentPane();
		contentPane.setLayout(new GridLayout(3,4));
		for(int i=1;i<btnArr.length;i++)
		{
			contentPane.add(btnArr[i]);
		}
	}
	
	public static void main(String[] rags)
	{
		JFrame f= new GridLayoutDemo();
		f.setSize(350,250);
		f.setLocation(100,200);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setVisible(true);
		
	}
}
