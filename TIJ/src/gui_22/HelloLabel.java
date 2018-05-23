package gui_22;

import javax.swing.*;
import java.util.concurrent.*;

public class HelloLabel {
	public static void main(String[] args)throws Exception{
		JFrame frame = new JFrame("Hello swing");
		JLabel label = new JLabel("A label");
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,100);
		frame.setVisible(true);
		TimeUnit.SECONDS.sleep(1);
		label.setText("Hi! This is different!");
	}
}