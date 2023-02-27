package com.briup.ch06;

import java.util.Iterator;

public class InterfaceTest {
	public static void main(String[] args) {
	
	}
}
//public private  interface class 
interface Animal{
	public static final int a=12;
	public int r=23;
	void test();
	 void tt();
} 
interface Bird extends Animal{
	void move();
}
interface FlyableBird extends Bird{
	void fly();
}
class Xiaohuanxiong implements Animal,Bird,FlyableBird{
	public void xx(){
		
	}
	public void test() {
		
	}
	public void move() {
		// TODO Auto-generated method stub
		
	}
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	public void tt() {
		// TODO Auto-generated method stub
		
	}

}
