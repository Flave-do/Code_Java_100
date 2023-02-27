package com.briup.ch06;

public class ArrayList1 implements List1{
	//has a 
	private Object[] list;
	private int length;
	private int max_size;
	public ArrayList1(){
		this(10);
	}
	public ArrayList1(int size){
		max_size=size;
		list=new Object[max_size];
	}
	private void dyExtend(){//5 5
		if(length==max_size){//要扩展 临界点
			Object[] temp=new Object[max_size+10];
			System.arraycopy(list, 0, temp, 0, list.length);
			list=temp;
			max_size+=10;
		}
	}
	public void add(Object o) {
		//将o放到数组里面  
		if(o==null){
			return;
//			System.exit(0);
		}
		dyExtend();
		list[length]=o;//list[10]=o
		length++;
	}
	
	public void add(Object o, int index) {
		
		dyExtend();
		for(int i=length;i>index;i--){
			list[i]=list[i-1];
		}
		list[index]=o;
		length++;
//		Object o1=list[index];
//		for(int i=index+1;i<list.length;i++){
//			Object temp=list[i];
//			list[i]=o1;
//			o1=temp;
//		}
		
	}

	public boolean remove(Object o) {
		//先看看存在不存在这个对象
		//存在的话返回索引
		//根据索引去删除这个对象
		int i=indexOf(o);
		remove(i);
		return true;
	}

	public boolean remove(int index) {
		for(int i=index+1;i<list.length;i++){
			list[i-1]=list[i];
		}
		length--;
		return true;
	}

	public Object get(int index) throws Exception {
		if(length==0){
			throw new ObjectNotFoundException("对象不存在");
		}
		if(index<0||index>=length){
			System.out.println("当前位置无对象");
			return null;
		}
		return list[index];
	}

	public int indexOf(Object o) {
		//String indexOf(String s) 
		if(containsObject(o)){
		for(int i=0;i<length;i++){
			if(o.equals(list[i])){
				return i;
			}
		}
		}
		return -1;
	}

	public boolean containsObject(Object o) {	
		//
		if(o==null){
			return false;
		}
		for(int i=0;i<length;i++){
			if(o.equals(list[i])){
				return true;
			}
		}
		return false;
	}

	public Object set(int index, Object o) {
		
		return null;
	}

	public int size() {
		// TODO Auto-generated method stub
		return length;
	}

	public boolean clear() {
		// TODO Auto-generated method stub
		length=0;
//		for(int i=0;i<list.length;i++){
//			list[i]=null;
//		}
		return true;
	}
	public static void main(String[] args) {
		List1 l=new ArrayList1();//构造方法
		l.add(new String("hgdhgf"));
		l.add(new String("briup36"));
		l.add(new String("briup1"));
		l.add(new String("briup2"));
		l.add(new String("briup3"));
		l.add(new String("briup4"));
		l.add(new String("briup5"));
		l.add(null);
		l.add(new String("xiaotaotao"), 5);
		l.add(new String("briup7"));
		l.add(new Student(12,"briup"));
		System.out.println("before remove"+l.size());
		l.remove(5);
		System.out.println("after remove"+l.size());
		try {
			for(int i=0;i<l.size();i++){
				System.out.println(l.get(i));
			}
			l.clear();
			System.out.println(l.get(14));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
}
