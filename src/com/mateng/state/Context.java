package com.mateng.state;

public class Context {
	private State state;
	
	public void setState(State s) {
		System.out.println("ÐÞ¸Ä×´Ì¬");
		state = s;
		state.handle();
	}
}
