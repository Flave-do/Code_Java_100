package com.briup.ch06;

public class AnonymousInnerClassTest {
	public void tt(AnnoInterface a){
		a.show();
	}
	public static void main(String[] args) {
		AnonymousInnerClassTest ac =new AnonymousInnerClassTest();
		//3 implements AnnoInterface{ public void show(){  askaskfjas}}
		//new 3
		ac.tt(new AnnoInterface() {
			public void show() {
				
			}
		});
		System.out.println(new Student(12,"briup"));
		System.out.println(new AnnoInterface() {
			public void show() {
				//小孩儿半夜哭 哭 事件  小孩儿 事件源
				//如果这个小孩儿哭 继续揍他 事件处理
				//interface CryListener{
				//	void process();
			}
			public String toString(){
				return "我是一个可爱的匿名内部类！";
			}
		});
		new AnnoInterface() {
			private int c=125;
			public void haha(){
				System.out.println("hahahahaaha~");
			}
			public void show() {
				
				System.out.println("hi~"+c);
			}
		}.haha();
	} 
}
interface AnnoInterface{
	void show();
}
