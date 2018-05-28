package gui_22;
/*
 * responding to button presser	
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static net.xzy.SwingConsole.*;

public class Button2 extends JFrame{
	private JButton
		b1 = new JButton("Button1"),
		b2 = new JButton("Button2");
	private JTextField textField = new JTextField(10);
	class ButtonListener implements ActionListener{
		/* how to handle with event */
		public void actionPerformed(ActionEvent e) {
			String name = ((JButton)e.getSource()).getText();/* get button's name */
			textField.setText(name); /* show the name */ 
		}
	}
	private ButtonListener bl = new ButtonListener();/* create a listener */
	public Button2() {
		b1.addActionListener(bl);/* give button listener */
		b2.addActionListener(bl); 
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(textField);
	}
	public static void main(String[] args) {
		run(new Button2(), 200, 150);
	}
}
