package com.briup.ch07;

public interface List1 {
	//标准 规范 容器 放对象 Object[]
	void add(Object o);//添加到容器的最后一位
	void add(Object o,int index);
	boolean remove(Object o);
	boolean remove(int index);
	Object get(int index) throws Exception;
	int indexOf(Object o);
	boolean containsObject(Object o);
	Object set(int index,Object o);
	int size();
	boolean clear();
}
