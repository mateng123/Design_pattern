package com.mateng.adapter;
/*
 * ��������������������ʽ��ʹ������ϵķ�ʽ��������������ϣ�
 */
public class Adapter2 implements Target{
	
	private Adpatee adpatee;
	
	@Override
	public void handleReq() {
		adpatee.request();
	}

	public Adapter2(Adpatee adpatee) {
		super();
		this.adpatee = adpatee;
	}
	
	
}
