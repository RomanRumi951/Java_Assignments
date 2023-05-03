package java_Assignment_5;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class P5 extends JFrame implements ActionListener {
	JLabel l1;
	JTextField t1;
	JButton b1;
	JList list;
	JComboBox combo;
	JScrollPane sp;
	Vector v;
	Font f = new Font("Consolas", Font.ITALIC, 18);
	int i = 0;
	public P5()
	{
		setLayout(new FlowLayout());
		l1 = new JLabel("Enter Any Value : ");
		t1 = new JTextField(10);
		b1 = new JButton("ADD");
		sp = new JScrollPane(list);
		combo = new JComboBox();
		v = new Vector();
		add(l1); add(t1); add(b1); add(combo);
		
//		combo.addItem("REDdfsfsdfsdfsdfsd");
		b1.addActionListener(this);
		setSize(500,500);
		setVisible(true);
	}
	public void additems() {
		add(sp);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		combo.addItem(t1.getText());
		v.add(t1.getText());
		list = new JList(v);
		list.setBackground(Color.ORANGE);
		list.setFixedCellWidth(100);
		list.setFont(f);
		additems();
//		Enumeration e = v.elements();
//		while(e.hasMoreElements())
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new P5();
	}

}
