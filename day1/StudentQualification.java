package day1;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class StudentQualification extends JFrame
{
	Label name, quali, course;
	JTextField userName, userQuali, userCourse;
	//JPasswordField pwdTxtFld;
	JButton btnSave, btnCancel, btnReset;
	Container contentPane;
	
	public StudentQualification() 
	{
		name= new Label("UserName");
		quali= new Label("Qualification");
		course= new Label("Course");
		
		userName= new JTextField(25);
		userQuali= new JTextField(25);
		userCourse= new JTextField(25);
		
		btnSave= new JButton("Save");
		btnReset= new JButton("Reset");
		btnCancel= new JButton("Cancel");
		
		contentPane= getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(name);
		contentPane.add(userName);
		
		contentPane.add(quali);
		contentPane.add(userQuali);
		
		contentPane.add(course);
		contentPane.add(userCourse);
		
		contentPane.add(btnSave);
		contentPane.add(btnReset);
	}
	
	public static void main(String[] args)
	{
		JFrame login = new StudentQualification();
		login.setTitle("Student Admission Form");
		login.setSize(350,250);
		login.setLocation(100,200);
		login.setVisible(true);
	}
}
