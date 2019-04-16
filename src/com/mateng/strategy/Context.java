package com.mateng.strategy;
/**
 * 负责和具体的策略类交互
 * 这样的话，具体的算法和直接的客户端调用分离了，使得算法可以独立于客户端独立变化
 * @author matemg
 *
 */
public class Context {
	private Strategy strategy;  //当前采用的算法对象

	//可以通过构造器来注入
	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	//可以通过set方法来注入

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	public void printPrice(double s) {
		System.out.println("你的报价"+strategy.getPrice(s));
	}
	
}

