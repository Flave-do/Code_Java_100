package com.briup.ch08;

import java.awt.Button;
import java.awt.Frame;

public class FrameExtend extends Frame{
	private Button btn;
	public FrameExtend(){
		setTitle("asfafasfasfasfasfa");
		setBounds(12, 12, 200, 200);
		btn=new Button("asdasdf");
		add(btn);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FrameExtend();
	}
}
