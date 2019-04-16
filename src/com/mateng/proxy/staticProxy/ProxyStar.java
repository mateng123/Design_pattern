package com.mateng.proxy.staticProxy;

public class ProxyStar implements Star{
	private Star star;

	public ProxyStar(Star star) {
		super();
		this.star = star;
	}
	
	@Override
	public void confer() {
		System.out.println("Realstar confer");
		
	}

	@Override
	public void signContract() {
		System.out.println("Realstar signContract");
		
	}

	@Override
	public void bookTicket() {
		System.out.println("Realstar bookTicket");
		
	}

	@Override
	public void sing() {
		star.sing();
		
	}

	@Override
	public void collectMoney() {
		System.out.println("Realstar colelctMoney");
		
	}
}
