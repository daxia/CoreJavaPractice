package chapter2;

import java.awt.EventQueue;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;

/**
 * ��˵����
 * <P>
 * ����һ�����ڲ�չʾͼƬ����
 * @version 1.00 2015.2.10
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
	private static final int DEFAULT_HIGH = 400;
	
	private JLabel label;       //һ�� �µ� label
	private JFileChooser fileChooser;
	
	public ImageViewFrame()
	{
		setTitle("ImageViewer");
		
		setSize(DEFAULT_WIDTH, DEFAULT_HIGH);
		
		//ʹ��һ��label����ʾimage
		label = new JLabel();
		add(label);
		
		//�����ļ�ѡ��
		fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(new File("."));
		
		//��Ӳ˵���
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		//��Ӳ˵�
		JMenu menu = new JMenu("File");
		menuBar.add(menu);
		
		JMenuItem openItem = new JMenuItem("Open");
		menuBar.add(openItem);
		openItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//show file choose dialog
				int result = fileChooser.showOpenDialog(null);
				
				//if file selected , ���ó�label��ico
				if(result == JFileChooser.APPROVE_OPTION)
				{
					String name = fileChooser.getSelectedFile().getPath();
					label.setIcon(new ImageIcon(name));
				}
			}
		});
		
		//�˳�
		JMenuItem exitItem = new JMenuItem("Exit");
		menuBar.add(exitItem);
		exitItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}
}
