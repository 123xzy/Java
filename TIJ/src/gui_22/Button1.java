package gui_22;

import javax.swing.*;
import java.awt.*;
import static net.xzy.SwingConsole.*;

public class Button1 extends JFrame{
	/* create two buttons named Buttons1 and Buttons2*/
	private JButton
		b1 = new JButton("Button1"),
		b2 = new JButton("Button2");
	
	public Button1() {
		new FlowLayout();/* decides where to show these buttons */
		//setLayout(new FlowLayout());
		add(b1);
		add(b2);
	}
	  
	public static void main(String[] args) {
		run(new Button1(), 200, 100);
	}
}
