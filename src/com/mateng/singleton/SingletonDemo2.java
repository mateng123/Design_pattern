package com.mateng.singleton;
/*
 * ��������ʽ����ģʽ
 */

public class SingletonDemo2 {
	//���ʼ��ʱ������ʼ�����������ʱ����,�����õ�ʱ���ٴ�������
	private static SingletonDemo2 instance = new SingletonDemo2();
	
	private SingletonDemo2() {
		
	}
	//����ͬ��������Ч�ʵ�!
	public static synchronized SingletonDemo2 getInstance() {
		if(instance==null) {
			instance = new SingletonDemo2();
		}
		return instance;
	}
	
}
