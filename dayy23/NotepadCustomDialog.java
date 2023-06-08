package day3;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NotepadCustomDialog extends JFrame implements MouseListener, WindowListener, ActionListener
{
	JMenuBar bar;
	JMenu fileMenu, editMenu;
	JMenuItem newMnItem, saveMnItem, cutMnItem, cpyMnItem, pstMnItem;
	
	JPopupMenu popUpMenu;
	JMenuItem cut, copy, paste;
	Container contentPane;
	
	public NotepadCustomDialog()
	{
		bar=new JMenuBar();
		
		fileMenu= new JMenu("File");
		editMenu= new JMenu("Edit");
		
		newMnItem= new JMenuItem("New");
		saveMnItem= new JMenuItem("Save");

		cutMnItem= new JMenuItem("Cut");
		cpyMnItem= new JMenuItem("Copy");
		pstMnItem= new JMenuItem("Paste");
		
		fileMenu.add(newMnItem);
		fileMenu.add(saveMnItem);
		
		editMenu.add(cutMnItem);
		editMenu.add(cpyMnItem);
		editMenu.add(pstMnItem);
		
		bar.add(fileMenu);
		bar.add(editMenu);
		setJMenuBar(bar);
		
		contentPane= getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		popUpMenu = new JPopupMenu();
		cut= new JMenuItem("Cut");
		copy= new JMenuItem("Copy");
		paste= new JMenuItem("Paste");
		
		//add menu items to popup menu
		popUpMenu.add(cut);
		popUpMenu.add(copy);
		popUpMenu.add(paste);
		
		//adding pop up menu to frame
		contentPane.add(popUpMenu);
		
		this.addMouseListener(this);
		this.addWindowListener(this);
		
		saveMnItem.addActionListener(this);
	}
	

	//custom dialog
	public class MyDialog extends JDialog implements ActionListener
	{
		JLabel messageLbl;
		JButton saveBtn, dontSaveBtn, cancelBtn;
		Container contentPane;
		
		public MyDialog(Frame owner, boolean modal)
		{
			super(owner, modal);
			messageLbl= new JLabel("Do you wanted to save the changes to untitled");
			
			saveBtn= new JButton("Save");
			dontSaveBtn= new JButton("Dont save");
			cancelBtn= new JButton("Cancel");
			
			contentPane= getContentPane();
			contentPane.setLayout(new FlowLayout());
			
			contentPane.add(messageLbl);
			contentPane.add(saveBtn);
			contentPane.add(dontSaveBtn);
			contentPane.add(cancelBtn);
			
			cancelBtn.addActionListener(this);
		}
		
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==cancelBtn)
			{
				NotepadCustomDialog.this.dispose();
			}
		}
	}
	
	public static void main(String[] args)
	{
		NotepadCustomDialog notePad= new NotepadCustomDialog();
		notePad.setTitle("My notepad");
		notePad.setSize(400,300);
		notePad.setLocationRelativeTo(null);
		notePad.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		notePad.setVisible(true);

	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if(e.isPopupTrigger())
		{
			popUpMenu.show(e.getComponent(),e.getX(),e.getY());
		}
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.isPopupTrigger())
		{
			popUpMenu.show(e.getComponent(),e.getX(),e.getY());
		}
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		JDialog dialog= new MyDialog(this,true);
		dialog.setTitle("My notepad");
		dialog.setSize(300,100);
		dialog.setLocationRelativeTo(this);
		dialog.setVisible(true);
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}