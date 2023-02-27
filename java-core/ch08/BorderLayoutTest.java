package com.briup.ch08;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTest {
	private JFrame frame;
	private Container content;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	public BorderLayoutTest(){
		frame=new JFrame("borderLayoutTest");
		frame.setBounds(40, 40, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		content=frame.getContentPane();
		b1=new JButton("bn");
		b2=new JButton("bs");
		b3=new JButton("bw");
		b4=new JButton("be");
		b5=new JButton("bc");
		content.setLayout(new BorderLayout());
//		content.add(b1,BorderLayout.NORTH);
//		content.add(b2,BorderLayout.SOUTH);
//		content.add(b3,BorderLayout.WEST);
		content.add(b4,BorderLayout.EAST);
		content.add(b5,BorderLayout.CENTER);
	}
	public void go(){
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new BorderLayoutTest().go();
	}
}




