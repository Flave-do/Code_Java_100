package com.briup.ch06;

public class EqualsTest {
	public static void main(String[] args) {
		Student s1=new Student(12,"briup");
		Student s2=new Student(12,"briup");
		System.out.println(s1==s2);
		System.out.println(s1.equals(new Integer(1)));
		
	}
}
class Cat1{
	String color;
	String appearance;
	int weight;
	public Cat1(String color, String appearance, int weight) {
		this.color = color;
		this.appearance = appearance;
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getAppearance() {
		return appearance;
	}

	public void setAppearance(String appearance) {
		this.appearance = appearance;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean equals(Object o){
		if(this==o){
			return true;
		}
		if(o==null){
			return false;
		}
		if(o instanceof Cat){
			Cat1 c=(Cat1)o;
			if(color.equals(c.getColor())&&appearance.equals(c.getAppearance())&&weight==c.getWeight()){
				return true;
			}
		}
		return false;
	}
}



