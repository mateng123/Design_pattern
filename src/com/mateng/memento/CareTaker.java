package com.mateng.memento;

import java.util.ArrayList;
import java.util.List;

/***
 * ��������
 * ���������¼����
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
