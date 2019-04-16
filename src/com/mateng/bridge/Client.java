package com.mateng.bridge;

public class Client {
	public static void main(String[] args) {
		//销售联想笔记本
		Computer2 c = new Laptop2(new Lenovo());
		c.sale();
		
		//销售神州台式机
		Computer2 c2 = new Desktop2(new shenzhou());
		c2.sale();
	}
}
