package chapter2;

import java.awt.EventQueue;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

/**
 * 类说明：
 * <P>
 * 创建一个窗口并展示图片程序
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
				System.out.println();
			}
		});
	}

}
