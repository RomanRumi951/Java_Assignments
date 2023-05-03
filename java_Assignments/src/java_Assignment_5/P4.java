package java_Assignment_5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.Vector;

import javax.swing.*;

public class P4 extends JFrame {

	JCheckBox c1, c2, c3, c4, c5;
	JButton b1;
	JLabel l1,line;

	public P4() {
		setLayout(new FlowLayout());
		setSize(450, 200);
		c1 = new JCheckBox("Cricket");
		c2 = new JCheckBox("Watch TV");
		c3 = new JCheckBox("Football");
		c4 = new JCheckBox("Art");
		c5 = new JCheckBox("Reasoning");
		b1 = new JButton("ADD TO HOBBIES");
		l1 = new JLabel();
		line = new JLabel("___________________________________________________________");
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(c5);
		add(b1);
		add(line);
		add(l1);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				System.out.println(c1.isSelected());
				String str = "";
				if (c1.isSelected() || c2.isSelected() || c3.isSelected() || c4.isSelected() || c5.isSelected()) {
					Vector v = new Vector();
					if (c1.isSelected())
						v.add(c1.getLabel());
					if (c2.isSelected())
						v.add(c2.getLabel());
					if (c3.isSelected())
						v.add(c3.getLabel());
					if (c4.isSelected())
						v.add(c4.getLabel());
					if (c5.isSelected())
						v.add(c5.getLabel());
					Enumeration e1 = v.elements();
					while(e1.hasMoreElements()) {
						str += "| " + e1.nextElement().toString() + " | ";
						l1.setText("Your Hobbies ==> " + str);
					}
				}
			}
		});
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new P4();
	}

}
