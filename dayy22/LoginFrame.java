package day2;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class LoginFrame extends JFrame implements ActionListener
{
	Label userLbl, pwdLbl;
	JTextField userTxtFld;
	JPasswordField pwdTxtFld;
	JButton btnSubmit, btnCancel, btnClear;
	Container contentPane;
	
	public LoginFrame() 
	{
		userLbl= new Label("UserName");
		pwdLbl= new Label("Password");
		
		userTxtFld= new JTextField(25);
		pwdTxtFld = new JPasswordField(25);
		
		btnSubmit= new JButton("Submit");
		btnCancel= new JButton("Cancel");
		btnClear= new JButton("Clear");
		
		contentPane= getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(userLbl);
		contentPane.add(userTxtFld);
		
		contentPane.add(pwdLbl);
		contentPane.add(pwdTxtFld);
		
		contentPane.add(btnSubmit);
		contentPane.add(btnCancel);
		contentPane.add(btnClear);
		
		//event linking code
		btnCancel.addActionListener(this);
		btnSubmit.addActionListener(new PerformActions());
		btnClear.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent arg0)
					{
					userTxtFld.setText("");
					pwdTxtFld.setText("");
					}
				});
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String caption = e.getActionCommand();
		if(caption.equals("Cancel"))
		{
			System.out.println("CANCEL");
		}
	}
	
	public static void main(String[] args)
	{
		JFrame login = new LoginFrame();
		login.setTitle("Login");
		login.setSize(350,250);
		login.setLocation(100,200);
		login.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		login.setVisible(true);
	}
}
