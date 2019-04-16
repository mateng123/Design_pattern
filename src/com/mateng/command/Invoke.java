package com.mateng.command;

//调用者
public class Invoke {
	private Command command;

	public Invoke(Command command) {
		super();
		this.command = command;
	}
	
	//业务方法，用于调用命令类的方法
	public void call() {
		command.execute();
	}
}
