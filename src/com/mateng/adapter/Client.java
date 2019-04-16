package com.mateng.adapter;
/*
 * 客户端类(相当于笔记本，只有USB接口)
 */
public class Client {
	public void test1(Target t) {
		t.handleReq();
	}
	public static void main(String[] args) {
		Client c = new Client();
		Adpatee a = new Adpatee();
		
		//Target t = new Adapter();
		
		Target t = new Adapter2(a);
		
		c.test1(t);
	}
}
