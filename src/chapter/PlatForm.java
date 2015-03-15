package chapter;

import java.awt.Button;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import chapter5.equals.Manager;

public class PlatForm {

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				MyPlatForm myPlatForm = new MyPlatForm();
				myPlatForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				myPlatForm.setTitle("Test");;
				myPlatForm.setVisible(true);
			}
		});
	}
}

class MyPlatForm extends JFrame{
	
	private JPanel buttonPanel;
	
	
	public MyPlatForm()
	{
		buttonPanel = new JPanel();
		
		UIManager.LookAndFeelInfo[] infos = UIManager.getInstalledLookAndFeels();
		for(UIManager.LookAndFeelInfo info : infos )
		{
			makeButton("wang", info.getClassName());
			add(buttonPanel);
			pack();
		}
		
	}
	
	public void makeButton(String name, final String platFName)
	{
		Button button = new Button(name);
		buttonPanel.add(button);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					UIManager.setLookAndFeel(platFName);
					SwingUtilities.updateComponentTreeUI(MyPlatForm.this);
					pack();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
			}
		});
	}
}



