package gui_22;

import javax.swing.*;

/**
 * swing app was bulit in JFrame
 * @author xzy
 *
 */
public class HelloSwing {
	public static void main(String[] args) {
		JFrame frame = new JFrame("HelloSwing");	/* set title */
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);/* when user close,program should close it */
		frame.setSize(300,100);						/* set size */
		frame.setVisible(true);						/* if not set this,can not see anything */
	}	
}
