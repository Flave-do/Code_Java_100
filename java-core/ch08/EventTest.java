package com.briup.ch08;

import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EventTest {
	private JFrame frame;
	private JButton btn;
	private JTextArea field;
	private Container container;
	private JLabel label;
	public EventTest(){
		frame=new JFrame("eventTest");
		btn=new JButton("点击我");
		label=new JLabel("mouse:");
		field=new JTextArea();
		frame.setBounds(20, 20, 200, 200);
		container=frame.getContentPane();
		container.setLayout(new BorderLayout());
		container.add(label,BorderLayout.NORTH);
		container.add(btn,BorderLayout.SOUTH);
//		container.add(field,BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
	}
	public void initGUI(){		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String content=field.getText();
				field.setText(content+="按钮被点击\n");
			}
		});
//		container.addMouseMotionListener(new MouseMotionListener() {
//			public void mouseMoved(MouseEvent e) {
//				// TODO Auto-generated method stub
//				int x=e.getX();
//				int y=e.getY();
//				label.setText("mouse x: "+x+" mouse y:"+y);
//			} 
//			public void mouseDragged(MouseEvent e) {
//				int x=e.getX();
//				int y=e.getY();
//				label.setText("dragged x: "+x+" dragged y:"+y);
//			}
//		});
		//适配器处理事件
		field.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int a=e.getKeyCode();
				if(a==KeyEvent.VK_UP){
					int x=frame.getX();
					int y=frame.getY();
					frame.setLocation(x+123, y+124);
					String content=field.getText();
					field.setText(content+="up!");
			}
			}
		});
//		field.addKeyListener(new KeyListener() {
//			public void keyTyped(KeyEvent e) {
//				
//			}
//			public void keyReleased(KeyEvent e) {
//				
//			}
//			public void keyPressed(KeyEvent e) {
//				int a=e.getKeyCode();
//				if(a==KeyEvent.VK_UP){
//					int x=frame.getX();
//					int y=frame.getY();
//					frame.setLocation(x+123, y+124);
//					String content=field.getText();
//					field.setText(content+="up!");
//				}
//			}
//		});
		//给GUI窗体添加全局事件监听
//		Toolkit.getDefaultToolkit().addAWTEventListener(new AWTEventListener() {
//		    public void eventDispatched(AWTEvent event) {
//		        if (((KeyEvent) event).getID() == KeyEvent.KEY_PRESSED) {
//		        	if(((KeyEvent) event).getKeyCode()==KeyEvent.VK_UP){}
//		        	int x=frame.getX();
//		        	int y=frame.getY();
//		        	frame.setLocation(x+100, y+100);
//		        }
//		    }
//		}, AWTEvent.KEY_EVENT_MASK);
	}
	public static void main(String[] args) {
		new EventTest().initGUI();
	}
}
