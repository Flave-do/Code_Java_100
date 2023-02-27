package com.briup.ch08;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest extends JFrame{
	private JButton b_1,b_2,b_3,b_4;
	private Container content;
	public GridLayoutTest(){
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		content=getContentPane();
		initGUI();
	}
	private void initGUI() {
		// TODO Auto-generated method stub
		content.setLayout(new GridLayout(2,2,30,100));
		b_1=new JButton("B1");
		b_2=new JButton("B2");
		b_3=new JButton("B3");
		b_4=new JButton("B4");
		content.add(b_1);
		content.add(b_2);
		content.add(b_3);
		content.add(b_4);
	}
	public void go(){
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutTest().go();
	}
}





