package com.mateng.command;

//������
public class Invoke {
	private Command command;

	public Invoke(Command command) {
		super();
		this.command = command;
	}
	
	//ҵ�񷽷������ڵ���������ķ���
	public void call() {
		command.execute();
	}
}
