package com.mateng.chainOf.Resp;

public class Client {
	public static void main(String[] args) {
		Leader a= new Director("����");
		Leader b= new Manager("����");
		Leader c= new GeneralManager("����");
		
		//��֯����������Ĺ�ϵ
		a.setNextLeader(b);
		b.setNextLeader(c);
		
		//��ʼ��ٹ���
		LeaveRequest req1 = new LeaveRequest("Tom", 10, "���ϼ�");
		a.handleRequest(req1);
	}
}
