package com.briup.ch06;

public class AbstractTest {
	public static void main(String[] args) {
		Girl g=new Girl("girl");
		
		Pet p1=new Dog("dahuang");
		Dog d1=new Dog();
		Pet p2=new Cat("feimao");
		Pet p3=new Bird1("shanji");
		//1.必须要有继承
		//2.必须要有重写
		//3.父类的引用指向子类的对象
//		g.playWithPet(p);
		g.playWithPet(p1);
		g.playWithPet(p2);
		g.playWithPet(p3);
		
		Pet p4=new Dog("asfasf");
		p4.shout();//pet.shout() dog.shout()
		//p4.test();
		//规范 标准
		//HTML4.01标准
		
		
		
		
	}
}

abstract class Pet{
	String name;
	public Pet(){}
	public Pet(String name){
		this.name=name;
	}
	public void getName(){
		
	}
	//丹顶鹤是一种动物 
	//丹顶鹤是一种值得保护的玩意儿
	//interface 

	public abstract void shout();
}
//有抽象方法的类一定是抽象类   
//抽象类不一定有抽象方法
//new Person();
 class Dog extends Pet{
	String name;
	public Dog(){}
	public Dog(String name){
		this.name=name;
	}
	public void shout() {
		System.out.println("wangwangwang");
		
	}
}
class Cat extends Pet{
	String name;
	public Cat(){}
	public Cat(String name){
		this.name=name;
	}
	public void shout(){
		System.out.println(name+"喊:喵喵");
	}
}
class Bird1 extends Pet{
	String name;
	public Bird1(){}
	public Bird1(String name){
		this.name=name;
	}
	public void shout(){
		System.out.println(name+"喊:$%&*#");
	}
}
class Mouse extends Pet{
	String name;
	public Mouse(String name){
		this.name=name;
	}
	public void shout(){
		//.....
	}
}
class Girl{
	Pet pet;
	String name;
	public Girl(String name){
		this.name=name;
	}
	public void playWithPet(Pet pet){
		pet.shout();
	}
}