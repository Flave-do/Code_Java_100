package com.briup.ch06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class ListTest {
	public static void printList(List l){
		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i));
			System.out.println("-----------");
		}
	}
	public static void iterateC(Collection c){
		Iterator it=c.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	public static void main(String[] args) {
		//ctrl+shift+o 第三方jar包 配置文件class=HashSet
		Collection l=new ArrayList(); //二次开发
		l.add(new Student(1,"briup1"));
		l.add(new Student(2,"briup2"));
		l.add(new Student(3,"briup3"));
		l.add(new Student(1,"briup1"));
		l.add(new Student(4,"briup4"));
//		l.add(2, new Student(5,"briup5"));
//		printList(l);
		//add remove get set size() isEmpty() iterator
		//要有迭代器 Iterator i=l.iterator() 
		iterateC(l);
	}
	
}
