package com.briup.ch08;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseTest{
	private JFrame frame;
	private Container contentPane;
	private JLabel label;
	public MouseTest(){
		frame=new JFrame("Mouse Test!");
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initGUI();	
	}	
	public void initGUI(){
		contentPane=frame.getContentPane();	
		contentPane.setLayout(new BorderLayout());
		label=new JLabel();
		contentPane.add(label,BorderLayout.SOUTH);
		//事件处理模型三要素 广播 
		//事件源
		//事件对象
		//事件监听
		frame.addMouseMotionListener(
			new MouseMotionListener(){
				public void mouseMoved(MouseEvent e){
						int x=e.getX();
						int y=e.getY();
						label.setText("Move: x"+x+",y"+y);
				}
				public void mouseDragged(MouseEvent e){
						int x=e.getX();
						int y=e.getY();
						label.setText("Drag: x"+x+",y"+y);
				}	
			}
		);
	}
	public void go(){
		frame.setVisible(true);	
	}
	public static void main(String[] args){
			new MouseTest().go();
	}
}