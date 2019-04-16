package com.mateng.memento;

import java.util.ArrayList;
import java.util.List;

/***
 * 负责人类
 * 负责管理备忘录对象
 * @author matemg
 *
 */
public class CareTaker {
	 private EmpMemento meneto;
	 
	 private List<EmpMemento> list = new ArrayList<EmpMemento>();

	public EmpMemento getMeneto() {
		return meneto;
	}

	public void setMeneto(EmpMemento meneto) {
		this.meneto = meneto;
	}

	
	 
	
}
