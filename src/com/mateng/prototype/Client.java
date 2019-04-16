package com.mateng.prototype;

import java.util.Date;
/*
 * 浅复制
 */
public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date = new Date(6262232632L);
		
		Sheep s1 = new Sheep("少利",date);
		System.out.println(s1);
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		
		Sheep s2 = (Sheep)s1.clone();
		s2.setSname("多利");
		date.setDate((int) 6266151516594L);
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
		System.out.println(s1.getBirthday());
	}
}
