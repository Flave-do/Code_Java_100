package com.briup.ch06;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class AccountSetTest{
	public static void outSet(Collection c){
		Iterator it=c.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	public static void main(String[] args) {
		//ArrayList  HashSet HashMap Collections.sort(list)
		Account a1=new Account(1, "a1", 1234D);
		Account a2=new Account(2, "a2", 1234D);
		Account a3=new Account(3, "a3", 1234D);
		Account a4=new Account(4, "a4", 1234D);
		Account a5=new Account(5, "a5", 1234D);
		Account a6=new Account(1, "a1", 1234D);
//		Collection c=new HashSet();
//		c.add(a1);
//		c.add(a2);
//		c.add(a3);
//		c.add(a4);
//		c.add(a5);
//		c.add(a6);
//		outSet(c);
		Collection c=new TreeSet(new Comparator() {
			public int compare(Object o1, Object o2) {
				Account a1=(Account) o1;
				Account a2=(Account) o2;
				//升序 
				return a1.getCode()-a2.getCode();
			}
		});
//		Collection c=new TreeSet();
		c.add(a1);
		c.add(a2);
		c.add(a3);
		c.add(a4);
		c.add(a5);
		c.add(a6);
		outSet(c);
	}
}
