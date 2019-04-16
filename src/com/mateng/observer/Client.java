package com.mateng.observer;

public class Client {
	public static void main(String[] args) {
		// Ŀ�����
		ConcreteSubject subject = new ConcreteSubject();
		//��������۲���
		ObserverA obs1 = new ObserverA();
		ObserverA obs2 = new ObserverA();
		ObserverA obs3 = new ObserverA();
		
		//���������۲�����ӵ�subject����Ĺ۲��߶�����
		subject.registerObserver(obs1);
		subject.registerObserver(obs2);
		subject.registerObserver(obs3);
		
		//�ı�subject״̬
		subject.setState(300);
		System.out.println("----------");
		
		//�����۲��ߵ�״̬�Ƿ�仯
		System.out.println(obs1.getMystate());
		System.out.println(obs2.getMystate());
		System.out.println(obs3.getMystate());
	}
}
