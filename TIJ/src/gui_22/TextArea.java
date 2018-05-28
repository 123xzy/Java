package gui_22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import net.xzy.*;
import static net.xzy.SwingConsole.*;

public class TextArea extends JFrame{
	private JButton
		b = new JButton("add data"),
		c = new JButton("clear data");
	private JTextArea textArea = new JTextArea(20,40);
	private Map<String, String> map = new HashMap<String,String>();
	public TextArea() {
		map.putAll(Countries.capitals());
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				for(Map.Entry mEntry : map.entrySet())
					textArea.append(mEntry.getKey() + ": " + mEntry.getValue() + "\n");
			}
		});
		c.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				textArea.setText("");
			}
		});
		setLayout(new FlowLayout());
		add(new JScrollPane(textArea));
		add(b);
		add(c);
	}
	public static void main(String[] args) {
		run(new TextArea(), 475, 425);
	}
}
