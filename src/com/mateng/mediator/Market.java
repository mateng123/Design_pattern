package com.mateng.mediator;

public class Market implements Department{

	private Mediator m;
	
	public Market(Mediator m) {
		super();
		this.m = m;
		m.register("market",this);
	}

	@Override
	public void selfAction() {
		System.out.println("跑去接项目");
	}

	@Override
	public void outAction() {
		System.out.println("汇报工作,项目承接进度");
		m.command("finacial");
	}

}
