package day2;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutDemo extends JFrame
{
	JButton btnArr[];
	Container contentPane;
	
	public FlowLayoutDemo()
	{
		btnArr=new JButton[5];
		for(int i=0; i<btnArr.length;i++)
		{
			btnArr[i]= new JButton(""+(i+1));
		}
		
		contentPane=getContentPane();
		contentPane.setLayout(new FlowLayout());
		for(int i=0;i<btnArr.length;i++)
		{
			contentPane.add(btnArr[i]);
		}
	}
	
	public static void main(String[] args)
	{
		JFrame f=new FlowLayoutDemo();
		f.setSize(350,250);
		f.setLocation(100,200);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setVisible(true);
	}
}
