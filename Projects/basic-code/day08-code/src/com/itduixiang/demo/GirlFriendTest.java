package com.itduixiang.demo;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();
        gf1.name = "xss";
        gf1.age = 18;
        gf1.gender = "mmz";

        System.out.println(gf1.name);
        System.out.println(gf1.age);
        System.out.println(gf1.gender);

        gf1.eat();
        gf1.sleep();

        System.out.println("=================");
    }
}
