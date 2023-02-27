package com.briup.ch06;

public class Account implements Comparable {
	private int code;
	private String name;
	private double balance;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account(int code, String name, double balance) {
		this.code = code;
		this.name = name;
		this.balance = balance;
	}

	public Account() {
	}

	public String toString() {
		return "Account [code=" + code + ", name=" + name + ", balance="
				+ balance + "]";
	}
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (o instanceof Account) {
			Account a = (Account) o;
			if (code == a.getCode() && name.equals(a.getName())
					&& balance == a.getBalance()) {
				return true;
			}
		}
		return false;
	}
//同名同号账户的hashcode是一致的
	public int hashCode() {
		return name.hashCode() + code;
	}

	@Override
	public int compareTo(Object o) {
		// code升序排列 
		Account a = (Account) o;
		if (code == a.getCode()) {
			return 0;
		} else if (code > a.getCode()) {
			return 1;
		} else {

			return -1;
		}
	}
}
