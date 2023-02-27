package com.briup.ch08;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.MenuBar;
import java.awt.Panel;
import java.awt.TextField;

public class FrameTest {
	public static void main(String[] args) {
		Frame f=new Frame("firstFrame");
		Button btn=new Button("asdads");
		Button btn2=new Button("btn2");
		Panel p1=new Panel(new FlowLayout(FlowLayout.RIGHT));
		Panel p2=new Panel(new BorderLayout());
//		f.setSize(200,200);
//		f.setLocation(0, 0);
		f.setBounds(0, 0, 200, 200);
		f.setBackground(Color.red);
//		f.setResizable(false);
		f.setLayout(new GridLayout(2, 1));
		btn.setBounds(10, 10, 50, 50);
		btn2.setBounds(60, 60, 50, 50);
		p1.add(btn);
		p2.add(btn2,BorderLayout.WEST);
		f.add(p1);
		f.add(p2);
		f.setVisible(true);
	}
}
