package com.briup.ch04;

public class ArraySort{
	public static void main(String[] args){
		ArraySort as=new ArraySort();
		int[] a=new int[args.length];
		for(int i=0;i<args.length;i++){
		   a[i]=Integer.parseInt(args[i]);
		}
		as.print(a);
		//paixu
		for(int i=0;i<a.length;i++){
		//a[1] a21]-a[length-1]
			int k=i;
			int temp=0;
			for(int j=k+1;j<a.length;j++){
				if(a[j]<a[k]){
					k=j;
				}
			}		
			if(k!=i){
				temp=a[i];
				a[i]=a[k];
				a[k]=temp;	
			}			
		}
		as.print(a);
		
	}
	public void print(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
