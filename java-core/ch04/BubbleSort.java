package com.briup.ch04;
public class BubbleSort{
	public static void main(String[] args){
		int temp;
		int[] a =new int[]{2,8,4,9,6};
		for(int i=a.length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(a[j+1]<a[j]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					}
				}
			}
//		System.out.println(a[i]);

		for(int i=0;i<=a.length-1;i++){
			System.out.print(a[i]+"\t");

	
		}
	System.out.println();

		




	}
}
