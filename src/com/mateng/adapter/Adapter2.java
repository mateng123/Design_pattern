package com.mateng.adapter;
/*
 * 适配器（对象适配器方式，使用了组合的方式跟被适配对象整合）
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
