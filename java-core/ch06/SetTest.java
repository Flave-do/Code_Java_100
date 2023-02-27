package com.briup.ch06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
		Set l=new TreeSet(new Comparator() {
			public int compare(Object o1, Object o2) {
				//如果值<0  o1<o2 
				//如果值>0  o1>o2
				//o1 id=1
				//o2 id=2  
				//o1< o2  1 2
				//o1 o2  o2 o1 2 1
				return ((Student)(o2)).getId()-((Student)(o1)).getId();
			}
		}); 
		//
		//二次开发
		//hashCode不相等的两个对象一定不等
		//hashCode相等的两个对象一般equals
		//hashcode相等的两个对象不一定equals
		//String 字符串值 hashcode相等
		
		l.add(new Student(2,"briup2"));
		l.add(new Student(1,"briup1"));
//		l.add(new Student(3,"briup3"));
//		l.add(new Student(1,"briup1"));
//		l.add(new Student(4,"briup4"));
		Iterator it=l.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	
	
	
	public static void iterateC(Collection c){
		Iterator it=c.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
