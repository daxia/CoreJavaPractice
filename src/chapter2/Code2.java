package chapter2;

import java.awt.EventQueue;
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
				System.out.println();
			}
		});
	}

}
