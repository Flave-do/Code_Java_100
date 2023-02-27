package com.itdianxin.demo1;

public class Test8 {
    public static void main(String[] args) {
        /*需求：
            定义一个方法copyOfRange(int[] arr,int from,int to)
          功能：
            将数组arr中从索引from(包括from)开始。
            到索引to结束(不包括to)的元素复制到新数组中。
            将新数组返回
         */

        //1.定义新数组
        int[] arr = {1,2,3,4,5,6,7,8,9};

        //2.调用方法拷贝数据
        int[] copyArr = copyOfRange(arr,3,7);

        //3.遍历copyArr
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }

    }
    //将数组arr中从索引from(包含from)开始，到索引to结束（不包含to）的元素复制到新数组中
    public static int[] copyOfRange(int[] arr,int from,int to){
        //1.定义数组
        int[] newArr = new int[to - from];
        //2.把原数组arr中的from到to上对应的元素，直接拷贝到新数组newArr中

        //伪造索引的思想
        int index = 0;
        for (int i = from; i < to; i++) {
            //格式：数组名[索引] = 数据值；
            newArr[index] = arr[i];
            index++;
        }

        //3.把新数组返回
        return newArr;
    }
}
