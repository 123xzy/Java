package gui_22;
/*
 * using anonymous inner classes
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static net.xzy.SwingConsole.*;

public class Button2b extends JFrame{
	private JButton
		b1 = new JButton("Button1"),
		b2 = new JButton("Button2");
	
	private JTextField textField = new JTextField(10);
	
	public ActionListener actionListener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			String name = ((JButton)arg0.getSource()).getText();
			textField.setText(name);
		}
	};
	
	public Button2b() {
		setLayout(new FlowLayout());
		b1.addActionListener(actionListener);
		b2.addActionListener(actionListener);
		add(b1);
		add(b2);
		add(textField);
	}
	public static void main(String[] args) {
		run(new Button2b(), 200, 200);
	}
}
