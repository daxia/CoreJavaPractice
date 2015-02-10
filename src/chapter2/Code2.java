package chapter2;

import java.awt.EventQueue;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;

/**
 * 类说明：
 * <P>
 * 创建一个窗口并展示图片程序
 * @version 1.00 2015.2.10
 * @author wsz
 *
 */
public class Code2 {
	public static void  main(String[] args) {
		//使用EventQueue是为了让代码更健壮
		//将事件放在事件队列的最后，让主线程自己执行，（当你想将事件放到主线程中去做但是又不用立即去做，或者不想中止当前的事件 ，可以调用此方法>          
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
 * 类说明:
 * 
 * @author wsz
 *
 */
class ImageViewFrame extends JFrame
{
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HIGH = 400;
	
	private JLabel label;       //一个 新的 label
	private JFileChooser fileChooser;
	
	public ImageViewFrame()
	{
		setTitle("ImageViewer");
		
		setSize(DEFAULT_WIDTH, DEFAULT_HIGH);
		
		//使用一个label来显示image
		label = new JLabel();
		add(label);
		
		//设置文件选择
		fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(new File("."));
		
		//添加菜单栏
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		//添加菜单
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
				
				//if file selected , 设置成label的ico
				if(result == JFileChooser.APPROVE_OPTION)
				{
					String name = fileChooser.getSelectedFile().getPath();
					label.setIcon(new ImageIcon(name));
				}
			}
		});
		
		//退出
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
