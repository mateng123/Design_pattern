package com.mateng.chainOf.Resp;
/*
 * ������
 */
public abstract class Leader {
	protected String name;
	protected Leader nextLeader;//�������ϵĺ�Ƕ���
	public Leader(String name) {
		super();
		this.name = name;
	}
	//�趨�������ϵĺ�̶���
	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}
	
	//����������ĵ�ҵ�񷽷�
	public abstract void handleRequest(LeaveRequest request);
}
