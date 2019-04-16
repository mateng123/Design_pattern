package com.mateng.mediator;

public class Finacial implements Department{

	private Mediator m;
	
	public Finacial(Mediator m) {
		super();
		this.m = m;
		m.register("finacial",this);
	}

	@Override
	public void selfAction() {
		System.out.println("��Ǯ");
	}

	@Override
	public void outAction() {
		System.out.println("�㱨����,�ʽ���ô��");
		
	}

}
