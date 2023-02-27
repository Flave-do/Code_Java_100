package com.briup.ch06;

import java.util.Arrays;
import java.util.Calendar;

public class StudentTest {
	public static void main(String[] args) {
		Student s1=new Student();//id=1000 nextId=1001
		s1.setName("s1");//name=s1
		Student s2=new Student("s2");//id=1001 nextId=1002
		Student s3=new Student();
		s3.setName("s3");
		Student s4=new Student("s4");
		System.out.println(s1);
		System.out.println("---------");
		System.out.println(s2);
		System.out.println("---------");
		System.out.println(s3);
		System.out.println("---------");
		System.out.println(s4);
		//成员变量是属于对象的  s1.name;
		//静态变量是属于类的Student.nextId
		System.out.println(Student.nextId);
		Student.show();//System.
	}
}
//Object
class Student{
	private int id;
	private String name;
	public static int nextId=1000;
	
	public Student(){
		setId(nextId++);
	}
	
	public static void show(){
	}
	public Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	public Student(String name){
		setName(name);
		setId(nextId++);
	}
	private void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		if(name==null){
			this.name="unknown";
		}else{
			this.name=name;
		}
	}

	//new Student(1,"xx").hashCode();
	//new Student(1,"xx").hashCode();
	public int hashCode(){
		//如果用的是hash开头的一定要重写此方法
		return name.hashCode()+id;
	}
	public String toString(){
		return "id is "+id+",\nname is "
		+name+",\nnextId is";
	}
	public boolean equals(Object o){
		if(this==o){
			return true;
		}
		if(o instanceof Student){
			Student s=(Student) o;
			if(id==s.getId()&&name.equals(s.getName())){
				return true;
			}
		}
		return false;
	}

//	public int compareTo(Object o) {
//		// set 从小到大  s1 id=1 s2 id=2
//		//s2.compareTo(s1);
//		//this=s2  o=s1 this<o  s2<s1 s2 s1
////		if(o instanceof Student){
//			Student s=(Student) o;
//			if(this.id>s.getId()){  
//				return -1;
//			}else if(this.id==s.getId()){
//				return 0;
//			}else{
//				return 1;
//			}
//		}
//	else{
//			return 1;
//		}
}
class SmallStudent extends Student{
	public static void show(){
		System.out.println("我是小学生");
	}
}


