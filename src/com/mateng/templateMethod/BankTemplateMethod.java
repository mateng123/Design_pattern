package com.mateng.templateMethod;

public abstract class BankTemplateMethod {
	//���巽��
	public void takeNumber() {
		System.out.println("ȡ���Ŷ�");
	}
	
	public abstract void transact();  //�����ҵ��  //���ӷ���
	
	public void evaluate() {
		System.out.println("��������");
	}
	
	public final void process() { //ģ�巽��
		this.takeNumber();
		
		this.transact();
		
		this.evaluate();
	}
}