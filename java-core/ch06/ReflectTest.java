package com.briup.ch06;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Date;


public class ReflectTest {
	private Date date;
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, Exception, InvocationTargetException {
//		String className="com.briup.ch06.Data";
//		Class clz=Data.class;//类名.class
//		Data d=new Data(); 
//		Class clz=d.getClass();//利用对象.getClass()
		//全限定名 包名+类名 非全限定名 类名
		//Data.class  Class=Data.class 
		//获取Class 修改属性 getDeclaredFields set 
		//调用方法  getMethods() invoke
		//8 9 GUI  
		Class clz=Class.forName("com.briup.ch06.Data");
		Data d=(Data) clz.newInstance();//调用clz指向的类里面的无参构造方法 然后调用
		Method[] ms=clz.getDeclaredMethods();
		for(int i=0;i<ms.length;i++){
			Method m=ms[i];
			//没一个方法的名字
			String name=m.getName();
			//如果一个方法名字为setCode
			if("setCode".equals(name)){
				//设置它可以被访问
				m.setAccessible(true);
				//setCode d.setCode(int)
				//调用这个方法 传入需要的参数
				m.invoke(d, 78);
			}
			//调用无参数的方法
			if("getCode".equals(name)){
				m.invoke(d, null);
			}
			//调用多个参数的方法
			if("privateMethod".equals(name)){
				m.setAccessible(true);
				m.invoke(d, 12,"briup");
//				m.invoke(d, new Object[]{12,"briup"});
			}
		}
		//获取所有的属性
		Field[] fs=clz.getDeclaredFields();
		for (int i = 0; i < fs.length; i++) {
			//没一个属性的名字
			//String Date Calendar 
			//调用java.util.ArrayList add 
			String name=fs[i].getName();
			//如果一个属性名叫code
			if(name.equals("code")){
				Field code=fs[i];
				System.out.println("code的修饰符是"+Modifier.toString(code.getModifiers()));;
				//设置它是可以被访问的
				code.setAccessible(true);
				//修改他的值为12
				code.set(d, 12);
			}
			if("content".equals(name)){
				Field content=fs[i];
				content.setAccessible(true);
				content.set(d, "conasfasfasfasfasfa");
			}
		}
		System.out.println(d.getCode());
		System.out.println(d.getContent());
		Constructor c2=clz.getConstructor(int.class,String.class);
		Data d2=(Data) c2.newInstance(35,"test");
		System.out.println(d2.getCode());
	}
}
class Data{
	private int code;
	private String content;
	
	public Data(){
		System.out.println("无参构造方法！");
	}
	public Data(int code,String content){
		this.code=code;
		this.content=content;
		System.out.println("有参构造方法");
	}
	
	public void publicMethod(){
		System.out.println("public的方法的");
	}
	private void privateMethod(int code,String content){
		System.out.println(code+"--"+content);
		System.out.println("private的方法");
	}
	
	public int getCode(){
		System.out.println(code+"getCode!");
		return code;
	}
	private void setCode(int code){
		this.code=code;
	}
	public String getContent(){
		return content;
	}
	private void setContent(String content){
		this.content=content;
	}
}






