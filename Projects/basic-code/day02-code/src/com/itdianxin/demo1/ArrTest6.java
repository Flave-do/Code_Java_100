package com.itdianxin.demo1;

public class ArrTest6 {
    public static void main(String[] args) {
        /*需求：定义一个数组，存入1，2，3，4，5 交换收尾对应的元素
            交换前：1，2，3，4，5
            交换后：5，4，3，2，1
         */
        //定义数组存储数据
        int[] arr = {1,2,3,4,5};
        //利用循环去交换数据
        for(int i = 0,j = arr.length-1;i < j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //当前循环结束之后，那么数组中的数据就实现了头尾交换
        for(int i =0;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
