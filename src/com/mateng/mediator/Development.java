package com.mateng.mediator;

public class Development implements Department{

	private Mediator m;
	
	public Development(Mediator m) {
		super();
		this.m = m;
		m.register("development",this);
	}

	@Override
	public void selfAction() {
		System.out.println("专心科研");
	}

	@Override
	public void outAction() {
		System.out.println("汇报工作，要资金");
		
	}

}
