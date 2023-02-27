package com.briup.ch04;
	public class ArrayCopy{
		public static void main(String[] args){
			int[] a =new int[]{2,6,4,8,1};
			int[] b =new int[5];
			System.arraycopy(a,1,b,0,3);
			for(int i=0;i<=b.length-1;i++){
				System.out.print(b[i]+"\t");
				}
			System.out.println();
	}
}
