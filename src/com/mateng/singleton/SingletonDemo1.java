package com.mateng.singleton;
/*
 * ���Զ���ʽ����ģʽ
 */

public class SingletonDemo1 {
	//���ʼ��ʱ�����������������û����ʱ���ص����ƣ���������ʱ����Ȼ�����̰߳�ȫ�ģ�
	private static SingletonDemo1 instance = new SingletonDemo1();
	
	private SingletonDemo1() {
		
	}
	//����û��ͬ��������Ч�ʸ�!
	public static SingletonDemo1 getInstance() {
		return instance;
	}
	
}
