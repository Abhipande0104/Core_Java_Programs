package day2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PerformActions implements ActionListener
{
	public void actionPerformed(ActionEvent arg0)
	{
		String caption=arg0.getActionCommand();
		if(caption.equals("Submit"))
		{
			System.out.println("SUBMITTED ");
		}
		else if(caption.equals("Cancel"))
		{
			System.out.println("Will need to stop execution and return to base ");
		}
	}
}
