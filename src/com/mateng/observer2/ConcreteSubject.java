package com.mateng.observer2;

import java.util.Observable;

public class ConcreteSubject extends Observable{
	private int state;
	
	public void set(int s) {
		state = s;  //对目标对象的状态发生改变
		
		setChanged();  //表示目标对象已经做了更改
		
		notifyObservers(state); //通知所有的观察者
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
	
}
