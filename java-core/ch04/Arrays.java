package com.briup.ch04;

public class Arrays{
	public static void main(String[] args){
		String[][] a=new String[9][9];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]="我的位置是["+i+"]["+j+"]";
			}
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
