package com.mateng.observer;

public class ObserverA implements Observer{

	private int mystate;   //mystate需要跟目标对象state值保持一致
	
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
