package com.briup.ch06;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		Student s1=new Student(1,"briup1");
		Student s2=new Student(2,"briup2");
		Student s3=new Student(3,"briup3");
		Student s4=new Student(4,"briup4");
		Student s5=new Student(5,"briup5");
		Student s6=new Student(1,"briup7");
		Map map=new HashMap();
		//1-s1 2-s2 3-s3  灯泡强   王强
		//key一定唯一 value可以相等
		map.put("s1",s1);//1.5自动
		map.put("s2",s2);
		map.put("s3",s3);
		map.put("s4",s4);
		map.put("s5",s5);
		//按键遍历
//		Set set=map.keySet();//所有的key
//		Iterator it=set.iterator();
//		//int Integer char Character
//		while(it.hasNext()){
//			String key=(String) it.next();//String类型的key
//			System.out.println(map.get(key));
//		}
		//按值遍历
//		Collection c=map.values();//[s1,s2,s3,s4,s5,s6]
//		Iterator it=c.iterator();
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		//按entry遍历Hashmap$Entry.class
		//entry key value  new Entry(key,value)
		//getKey getValue()
		Set set=map.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext()){
			Map.Entry e=(Entry) it.next();//? values?keys?entrys?
			System.out.println(e.getValue());
		}
	}
}






