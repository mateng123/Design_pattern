package com.mateng.memento;

public class Client {
	public static void main(String[] args) {
		CareTaker taker = new CareTaker();
		
		Emp emp = new Emp("����",18,10000);
		System.out.println("��һ�δ�ӡ����"+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
		
		taker.setMeneto(emp.memento()); //����һ��
		
		emp.setAge(19);
		emp.setEname("˧��");
		emp.setSalary(100000);
		System.out.println("�ڶ��δ�ӡ����"+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
		
		
		emp.recovery(taker.getMeneto());  //�ָ�������¼���󱣴��״̬
		
		System.out.println("�����δ�ӡ����"+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
		
		
	}
}
