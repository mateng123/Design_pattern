package com.mateng.factory.abstractFactory;

public interface Engine {
	void run();
	void start();
}


class LuxuryEngine implements Engine{

	@Override
	public void run() {
		System.out.println("ת�Ŀ�");
		
	}

	@Override
	public void start() {
		System.out.println("�����죡�����Զ���ͣ");	
	}
	
}

class LowEngine implements Engine{

	@Override
	public void run() {
		System.out.println("���Ŀ�");
		
	}

	@Override
	public void start() {
		System.out.println("������");	
	}
	
}