package com.mateng.bridge;

public class Client {
	public static void main(String[] args) {
		//��������ʼǱ�
		Computer2 c = new Laptop2(new Lenovo());
		c.sale();
		
		//��������̨ʽ��
		Computer2 c2 = new Desktop2(new shenzhou());
		c2.sale();
	}
}
