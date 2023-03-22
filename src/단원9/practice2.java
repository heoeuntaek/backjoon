package 단원9;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class practice2 extends JFrame {


	public JTextField textfield1 =new JTextField(18);
	public JTextField textfield2 = new JTextField(18);
	
	public practice2(){	
	setTitle("Action 이벤트 리스너 작성");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Container c = getContentPane();
	c.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
	JButton btnA = new JButton("A");
	JButton btnB = new JButton("B");
	JButton btnClear = new JButton("Clear");

	textfield1.setSize(200,200);
	textfield2.setSize(100,10);
	c.add(btnA);
	c.add(btnB);
	c.add(btnClear);
	
	
	c.add(textfield1);
	c.add(textfield2);
	
	setSize(230, 200);
	setVisible(true);
	
	btnA.addActionListener(new MyActionListener());
	btnB.addActionListener(new MyActionListener2());
	btnClear.addActionListener(new MyActionListener3());
	
	textfield1.addActionListener(new MyActionListerner4());
	
}
	
	
	


class MyActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
	
		String text = textfield2.getText();
		text=text+"A";
		textfield2.setText(text);
		
		} 
	}

class MyActionListener2 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		String text = textfield2.getText();
		text=text+"B";
		textfield2.setText(text);
		
	}
}

class MyActionListener3 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		textfield1.setText("");
		textfield2.setText("");
	}
	
	
}

class MyActionListerner4 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JTextField b = (JTextField)e.getSource();
		b.setText(textfield1.getText());
		System.out.print(b.getText());
		
	}
	
	
}
public static void main(String [] args) { 
	new practice2();
}
}