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
		System.out.println("��ȥ����Ŀ");
	}

	@Override
	public void outAction() {
		System.out.println("�㱨����,��Ŀ�нӽ���");
		m.command("finacial");
	}

}
