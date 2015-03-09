package chapter7.sample;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class SampleFrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				SampleFrame sf = new SampleFrame();
				sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				sf.setVisible(true);
			}
		});
	}

}

class SampleFrame extends JFrame{
	
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGH = 200;
	
	public SampleFrame()
	{
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGH);
	}
}
