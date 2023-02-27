package com.briup.ch06;

import sun.applet.Main;

public final class FinalTest{
	int a=12;
	public static final int MAX_VALUE=132532465;
	public final void testFinal(int b){
	}
	//多行注释ctrl+shift+/ 取消是反斜杠
	public static void main(String[] args) {
		System.out.println(FinalTest.MAX_VALUE);
	}
}
//class FF extends FinalTest{
//	public final void testFinal(int b){
//		System.out.println("asd");
//	}
//}
