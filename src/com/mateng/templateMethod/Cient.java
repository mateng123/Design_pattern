package com.mateng.templateMethod;

public class Cient {
	public static void main(String[] args) {
		BankTemplateMethod btm = new DrawMoney();
		
		btm.process();
		
		
		//采用匿名内部类
		BankTemplateMethod btm2 = new BankTemplateMethod() {
			@Override
			public void transact() {
				System.out.println("我要存钱");
				
			}
		};
		btm2.process();
	}
}


class DrawMoney extends BankTemplateMethod{

	@Override
	public void transact() {
		System.out.println("我要取款");
		
	}
	
}

