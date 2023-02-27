package com.briup.ch04;

public class ArrayCalc{
	public static void main(String[] args){
		//if else if 1 + 2
		//string->int Integer.parseInte
		//Double 1 new String[3]
		if(args.length!=3){
			System.out.println("命令格式需满足:javaArrayCalc 1 + 2");
			System.exit(-1);
		}
		double d1=Double.parseDouble(args[0]);
		double d2=Double.parseDouble(args[2]);
		double result=0.0d;
		String op=args[1];
		//args[1].equals("+")
	
		if("+".equals(op)){
			result=d1+d2;
		}else if("x".equals(op)){
			result=d1*d2;
		}else if("/".equals(op)){
			result=d1/d2;
		}else if("-".equals(op)){
			result=d1-d2;			
		}else{
			System.out.println("不支持的运算！");
		}
		System.out.println(d1+op+d2+"="+result);
	} 
}



