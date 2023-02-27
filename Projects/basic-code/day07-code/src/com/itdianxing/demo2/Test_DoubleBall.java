package com.itdianxing.demo2;

import java.util.Random;
import java.util.Scanner;

public class Test_DoubleBall {
    public static void main(String[] args) {
        //1.生成中奖号码
        int[] arr = creatNumber();

        System.out.println("********************************");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("********************************");
    }

    public static int[] creatNumber(){
        //1.创建数组用于添加中奖号码
        //6个红球  1个蓝球 数组长度7
        int[] arr= new int[7];

        //2.随机生成号码并添加到数组中
        //红球：不能重复的123456
        //蓝球：可以跟红球号码重复

        //生成红球号码并添加到数组当中
        Random r = new Random();
        for (int i = 0; i < arr.length;) {
            //获取红球号码
            int redNumber = r.nextInt(33) + 1;
            boolean flag = contains(arr,redNumber);
            if (!flag){
                //把红球号码添加到数组当中
                arr[i] = redNumber;
                i++;
            }
        }
        //生成蓝球号码并添加到数组当中
        int blueNumber = r.nextInt(16) + 1;
        arr[arr.length - 1] = blueNumber;

        return arr;
    }

    //用于判断数组在数组中是否存在
    public static boolean contains(int[] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                return true;
            }
        }
        return false;
    }
}
