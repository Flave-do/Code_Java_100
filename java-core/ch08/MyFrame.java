package com.briup.ch08;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
	private JButton b1;
	private JTextField jt;
	private Container content;
	public MyFrame(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		content=getContentPane();
		content.setBackground(Color.BLACK);
//		setSize(200, 100);
		jt=new JTextField(10);
		b1=new JButton("点击");
		content.setLayout(new FlowLayout(FlowLayout.RIGHT));
		content.add(jt);
		content.add(b1);
		pack();
		
	}
	public void go(){
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e.getSource()==b1);
				System.out.println(e.getActionCommand());
				jt.setText("种花万岁");
			}
		});
		setVisible(true);
	}
//	private class MyHandler implements ActionListener{
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			System.out.println("hello~");
//		}
//		
//	}
	public static void main(String[] args) {
		new MyFrame().go();
	}
}








