package day2;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo extends JFrame
{
	JButton btnArr[];
	Container contentPane;
	
	public BorderLayoutDemo()
	{
		btnArr= new JButton[5];
		for(int i=0; i<btnArr.length;i++)
		{
			btnArr[i]= new JButton(""+(i+1));
		}
		
		contentPane= getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		contentPane.add(btnArr[0],BorderLayout.NORTH);
		contentPane.add(btnArr[1],BorderLayout.SOUTH);
		contentPane.add(btnArr[2],BorderLayout.EAST);
		contentPane.add(btnArr[3],BorderLayout.WEST);
		contentPane.add(btnArr[4],BorderLayout.CENTER);
		//default location is center if not mentioned
	}
	
	public static void main(String[] args)
	{
		JFrame f= new BorderLayoutDemo();
		f.setSize(350,250);
		f.setLocation(100,200);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setVisible(true);
	}
}
