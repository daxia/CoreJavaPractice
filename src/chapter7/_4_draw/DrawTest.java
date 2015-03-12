package chapter7._4_draw;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.color.ColorSpace;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import java.lang.ProcessBuilder.Redirect;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class DrawTest {

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				DrawFrame dFrame = new DrawFrame();
				dFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				dFrame.setVisible(true);
				dFrame.setTitle("Test");
				
			}
		});
	}

}

class DrawFrame extends JFrame{
	public DrawFrame()
	{
		add(new DrawComponent());
		pack();
	}
}

class DrawComponent extends JComponent{
	
	private static final int DEFAULT_WEITH = 400;
	private static final int DEFAULT_HEIGTH =400;

	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		double LeftX  = 100;
		double topY  = 100;
		double width   = 200;
		double height = 150;
		
		//draw rectangle
		Rectangle2D rect = new Rectangle2D.Double(LeftX, topY, width, height);
		g2d.draw(rect);
		
		//draw ellipse
		Ellipse2D ellipse = new Ellipse2D.Double();
		ellipse.setFrame(rect);
		g2d.draw(ellipse);
		
		//draw line
		g2d.draw(new Line2D.Double(LeftX, topY, width, height));
		
		
		//draw circle
		double CenterX = rect.getCenterX();
		double CenterY = rect.getCenterY();
		double radius = 150;
		
		Ellipse2D circle = new Ellipse2D.Double();
		circle.setFrameFromCenter(CenterX, CenterY, CenterX + radius, CenterY + radius);
		
		g2d.draw(circle);
		
		
		g2d.setColor(Color.red);

		g2d.drawString("wang", (int)LeftX, (int)topY);
		
		
		//super.paintComponent(g);
	}

	@Override
	public Dimension getPreferredSize() {
		// TODO Auto-generated method stub
		return new Dimension(DEFAULT_WEITH, DEFAULT_HEIGTH);
	}
	
	
}