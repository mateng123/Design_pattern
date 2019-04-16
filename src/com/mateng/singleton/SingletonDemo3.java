package com.mateng.singleton;
/*
 * ��̬�ڲ���ʵ�ֵ���ģʽ
 */

public class SingletonDemo3 {
	private static class SingletonClassInstance{
		private static final SingletonDemo3 instance = new SingletonDemo3();
	}
	
	
	private SingletonDemo3() {
		
	}
	//����û��ͬ��������Ч�ʵ�!
	public static synchronized SingletonDemo3 getInstance() {
		return SingletonClassInstance.instance;
	}
	
}
