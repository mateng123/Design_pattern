package com.mateng.proxy.staticProxy;

public class RealStar implements Star{

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
		System.out.println("Õæ½áÂÛ sing");
		
	}

	@Override
	public void collectMoney() {
		System.out.println("Realstar colelctMoney");
		
	}
	
}
