package java_Assignment_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P2 extends JFrame implements ActionListener {
    JLabel l1, l2, l3, line, line2;
    JTextField t1;
    JPasswordField p1;
    JButton btn;

    public P2(){
        setLayout(new FlowLayout());
        l1 = new JLabel("Enter UserName : ");
        l2 = new JLabel("Enter PassWord : ");
        l3 = new JLabel();
        line = new JLabel("______________________________________");
        line2 = new JLabel("_______________________________________");
        t1 = new JTextField(10);
        p1 = new JPasswordField(10);
        btn = new JButton("Login");
        add(l1);
        add(t1); 
        add(l2);
        add(p1);
        add(btn);
        add(line);
        
        add(line2);
        add(l3);
        setSize(250, 400);
        setLocation(400, 300);
        setVisible(true);
        btn.addActionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new P2();
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub 
		if(t1.getText().equals("abc") && p1.getText().equals("123")) {
			ImageIcon i = new ImageIcon("E:\\images (2).jpg");
			l3.setIcon(i);
		}
		else {
			ImageIcon i = new ImageIcon("E:\\mehmet.jpg");
			l3.setIcon(i);
		}
	}
}
