package day1;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class LoginFrame extends JFrame
{
	Label userLbl, pwdLbl;
	JTextField userTxtFld;
	JPasswordField pwdTxtFld;
	JButton btnSubmit, btnCancel;
	Container contentPane;
	
	public LoginFrame() 
	{
		userLbl= new Label("UserName");
		pwdLbl= new Label("Password");
		
		userTxtFld= new JTextField(25);
		pwdTxtFld = new JPasswordField(25);
		
		btnSubmit= new JButton("Submit");
		btnCancel= new JButton("Cancel");
		
		contentPane= getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(userLbl);
		contentPane.add(userTxtFld);
		
		contentPane.add(pwdLbl);
		contentPane.add(pwdTxtFld);
		
		contentPane.add(btnSubmit);
		contentPane.add(btnCancel);
	}
	
	public static void main(String[] args)
	{
		JFrame login = new LoginFrame();
		login.setTitle("Login");
		login.setSize(350,250);
		login.setLocation(100,200);
		login.setVisible(true);
	}
}
