package com.mateng.chainOf.Resp;

public class Director extends Leader{

	public Director(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if(request.getLeaveDays()<3) {
			System.out.println("Ա����"+request.getEmpName()+"�������"+request.getLeaveDays()+"����"+request.getReason());
			System.out.println("����"+this.name+"����ͨ��");
		}else {
			if(this.nextLeader!=null) {
				this.nextLeader.handleRequest(request);
			}
		}
		
	}

}
