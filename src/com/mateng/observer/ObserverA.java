package com.mateng.observer;

public class ObserverA implements Observer{

	private int mystate;   //mystate��Ҫ��Ŀ�����stateֵ����һ��
	
	@Override
	public void update(Subject subject) {
		mystate = ((ConcreteSubject)subject).getState();
	}

	public int getMystate() {
		return mystate;
	}

	public void setMystate(int mystate) {
		this.mystate = mystate;
	}

	
}
