package chapter2;

import java.awt.EventQueue;
import java.awt.Label;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;

/**
 * ��˵����
 * <P>
 * ����һ�����ڲ�չʾͼƬ����
 * @author wsz
 *
 */
public class Code2 {
	public static void  main(String[] args) {
		//ʹ��EventQueue��Ϊ���ô������׳
		//���¼������¼����е���������߳��Լ�ִ�У��������뽫�¼��ŵ����߳���ȥ�������ֲ�������ȥ�������߲�����ֹ��ǰ���¼� �����Ե��ô˷���>          
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				JFrame frame = new ImageViewFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}

}

/**
 * ��˵��:
 * 
 * @author wsz
 *
 */
class ImageViewFrame extends JFrame
{
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HIGH = 300;
	
	private JLabel label;
	
	public ImageViewFrame()
	{
		setTitle("ImageViewer");
		
		setSize(DEFAULT_WIDTH, DEFAULT_HIGH);
		
		//ʹ��һ��label����ʾimage
		label = new JLabel();
		add(label);
		
		
	}
}
