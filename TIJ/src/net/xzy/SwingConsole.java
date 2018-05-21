package net.xzy;

import javax.swing.*;

/**
 * frame of show 
 * @author xzy
 *
 */
public class SwingConsole {
	public static void run(final JFrame frame,final int width,final int height) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				frame.setTitle(frame.getClass().getSimpleName());
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(width,height);
				frame.setVisible(true);
			}
		});
	}
}
