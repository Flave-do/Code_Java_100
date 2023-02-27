package com.briup.ch04;
	public class LF{
		public static void main(String[] args){
			int[] b =new int[]{1,2,3,4,5,};
			int a=3;
			LF l=new LF();
			l.liafenfa(a,b);
			}
		
		public void liafenfa (int a,int[] b){
			
			if(a==b[b.length/2]){
				System.out.println(b.length/2);
				}
		        	else {b[b.length/2]=b[0];}
			
		}
	}
