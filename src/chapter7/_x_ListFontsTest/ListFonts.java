package chapter7._x_ListFontsTest;

import java.awt.GraphicsEnvironment;


/**
 * get All Fonts Frome My Computer
 * @author Administrator
 *
 */
public class ListFonts {

	public static void main(String[] args) {
		
		String[] fontsName = GraphicsEnvironment
							.getLocalGraphicsEnvironment()
							.getAvailableFontFamilyNames();
		for (String string : fontsName) {
			System.out.println(string);
		}

	}

}
