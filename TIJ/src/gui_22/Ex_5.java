package gui_22;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
import static net.xzy.SwingConsole.*;

public class Ex_5 extends JFrame{
	private JButton 
		b1 = new JButton("Button1"),
		b2 = new JButton("Button2"),
		b3 = new JButton("Button3");
	
	private JTextField textField = new JTextField(10);
	
	private ActionListener actionListener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			String name = ((JButton)arg0.getSource()).getText();
			textField.setText(name);
		}
	};
	
	public Ex_5() {
		setLayout(new FlowLayout());
		b1.addActionListener(actionListener);
		b2.addActionListener(actionListener);
		b3.addActionListener(actionListener);
		add(b1);
		add(b2);
		add(b3);
		add(textField);
	}
	
	public static void main(String[] args) {
		run(new Ex_5(), 100, 200);
	}
}
