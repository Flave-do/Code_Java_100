package com.briup.ch06;

public class StaticInnerClassTest {
	public static void main(String[] args) {
		//在外部类之外创建静态内部类的实例
		//成员内部类实例化
		OuterClass1.StaticInnerClass om=
				new OuterClass1.StaticInnerClass();
	}
}
class OuterClass1{//外部类
	private int a;
	int b;
	static int c=12;
	
	private void test1(){
		System.out.println("外围类的test方法！私有的！");
	}
	void test2(){
		System.out.println("外围类的test2方法");
	}
	private static void staticTest(){
		System.out.println("外围类的静态方法！");
		//在外部类中调用静态内部类的方法
	}
	static class StaticInnerClass{//静态内部类
		private int ii;
		public void test1(){
			System.out.println("内部类的test1方法");
		}
		public void innerTest(){
			System.out.println(c);
			test1();
			System.out.println(ii);
			System.out.println("静态内部类的方法");
			System.out.println("外围类的变量值为"+c);
		}
	}
}
