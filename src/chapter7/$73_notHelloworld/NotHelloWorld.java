package chapter7.$73_notHelloworld;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class NotHelloWorld {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				
				
			}
		});
	}

}

class NotHelloWorldFrame extends JFrame{
	public NotHelloWorldFrame()
	{
		add(new NotHelloWorldFrame());
		pack();
	}
}

class NotHelloWorldComponent extends JComponent{
	
	public static final int MESSAGE_X = 100;
	public static final int MESSAGE_Y = 50;
	
	public static final int DEFAULT_WIDTH = 300;
	public static final int DEFAULT_HEIGHT = 400;
	
	public void paintComponent(Graphics g)
	{
		g.drawString("", MESSAGE_X, MESSAGE_Y);
	}
	
	public Dimension getPreferedSize()
	{
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
}
