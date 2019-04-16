package com.mateng.templateMethod;

public abstract class BankTemplateMethod {
	//具体方法
	public void takeNumber() {
		System.out.println("取号排队");
	}
	
	public abstract void transact();  //办具体业务  //钩子方法
	
	public void evaluate() {
		System.out.println("反馈评分");
	}
	
	public final void process() { //模板方法
		this.takeNumber();
		
		this.transact();
		
		this.evaluate();
	}
}
