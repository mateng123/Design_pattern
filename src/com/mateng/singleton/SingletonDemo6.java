package com.mateng.singleton;
/*
 * ��������ʽ����ģʽ
 */

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingletonDemo6 implements Serializable{
	//���ʼ��ʱ������ʼ�����������ʱ����,�����õ�ʱ���ٴ�������
	private static SingletonDemo6 instance = new SingletonDemo6();
	
	private SingletonDemo6() {
		if(instance!=null) {
			throw new RuntimeException();
		}
	}
	//����ͬ��������Ч�ʵ�!
	public static synchronized SingletonDemo6 getInstance() {
		if(instance==null) {
			instance = new SingletonDemo6();
		}
		return instance;
	}
	//�����л�ʱ�����������readResolve()��ֱ�ӷ��ش˷�����ָ�����󡣶���Ҫ�����ٴ����¶���
	private Object readResolve() throws ObjectStreamException{
		return instance;
	}
}
