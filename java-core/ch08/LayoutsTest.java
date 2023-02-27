package com.briup.ch08;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LayoutsTest {
	private JFrame frame;
	private Container content;
	private JPanel p1;
	private JPanel p2;
	private JTextField t1;
	private JButton flowBtn;
	
	private JButton b_1,b_2,b_3,b_4;
	public LayoutsTest(){
		frame=new JFrame("Layouts");
		frame.setSize(400,400);//空指针！！！！
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		content=frame.getContentPane();
		initGUI();
	}
	private void initGUI() {
		// TODO Auto-generated method stub
		p1=new JPanel();
		p2=new JPanel();
		t1=new JTextField(20);
		flowBtn=new JButton("show");
		b_1=new JButton("b1");
		b_2=new JButton("b1");
		b_3=new JButton("b1");
		b_4=new JButton("b1");
		p1.setLayout(new FlowLayout(FlowLayout.RIGHT));
		p1.add(t1);
		p1.add(flowBtn);
		
		p2.setLayout(new GridLayout(2, 2,10,10));
		p2.add(b_1);
		p2.add(b_2);
		p2.add(b_3);
		p2.add(b_4);
		
		content.setLayout(new GridLayout(2,1));
		content.add(p1);
		content.add(p2);
	}
	public void go(){
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new LayoutsTest().go();
	}
}





