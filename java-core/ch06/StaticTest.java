package com.briup.ch06;

public class StaticTest {
	public static void main(String[] args) {
		StaticClass sc1=new StaticClass();
		sc1.show();
		StaticClass sc2=new StaticClass();
		sc2.show();
		StaticClass sc3=new StaticClass();
		sc3.show();
	}
}
class StaticClass{
	private static Student s;
	//static代码块最先执行且只执行一次 
	static{
		s=new Student();
		s.setName("briup");
		System.out.println("初始化完成!");
	}
	public void show(){
		System.out.println(s);
	}
	public StaticClass(){
		System.out.println("无参构造方法！");
	}
}





