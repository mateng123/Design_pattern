package com.mateng.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/*
 * 原型模式（深复制，使用序列化和反序列化的方式实现深复制）
 */
public class Client3 {
	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
		Date date = new Date(6262232632L);
		
		Sheep s1 = new Sheep("少利",date);
		System.out.println(s1);
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		
		//Sheep s2 = (Sheep)s1.clone();
		//使用序列化和反序列化实现深复制
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(s1);
		byte[] bytes = bos.toByteArray();
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		Sheep s2 = (Sheep)ois.readObject();
		
		s2.setSname("多利");
		date.setDate((int) 6266151516594L);
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
		System.out.println(s1.getBirthday());
	}
}
