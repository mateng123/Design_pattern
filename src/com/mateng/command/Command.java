package com.mateng.command;

public interface Command {
	void execute();
}

class ConcreteCommand implements Command{

	private Receiver receiver;  //命令的真正执行者
		
	
	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}


	@Override
	public void execute() {
		receiver.action();
	}
	
}