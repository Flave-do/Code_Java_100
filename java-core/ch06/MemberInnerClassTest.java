package com.briup.ch06;

public class MemberInnerClassTest {
	public static void main(String[] args) {
		//在外部类之外创建静态内部类的实例
		//成员内部类实例化 like instance variable
		OuterClass2 o=new OuterClass2();
		o.test1();
	}
}
class OuterClass2{//外部类
	private int a;
	int b;
	static int c=12;
	 void test1(){
		final int xxx=56;
		class LocalInnerClass{
			 void LocalTest(){
				 System.out.println(c);
				 System.out.println(xxx);
				 System.out.println("局部内部类的test方法");
			 }
		}
		new LocalInnerClass().LocalTest();
		System.out.println("外围类的test方法！私有的！");
	}
	void test2(){
		System.out.println("外围类的test2方法");
	}
	private static void staticTest(){
		System.out.println("外围类的静态方法！");
		//在外部类中调用静态内部类的方法
	}
	class MemberInnerClass{//静态内部类
		private int c;
		public void test1(){
			System.out.println("内部类的test1方法");
		}
		public void innerTest(){
			//members 
			System.out.println(OuterClass2.this.c);
//			new OuterClass2().test1();
			OuterClass2.this.test1();
//			test1();//就近
			System.out.println("静态内部类的方法");
			System.out.println("外围类的变量值为"+c);
		}
	}
}
