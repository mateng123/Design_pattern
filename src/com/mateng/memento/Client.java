package com.mateng.memento;

public class Client {
	public static void main(String[] args) {
		CareTaker taker = new CareTaker();
		
		Emp emp = new Emp("马腾",18,10000);
		System.out.println("第一次打印对象"+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
		
		taker.setMeneto(emp.memento()); //备忘一次
		
		emp.setAge(19);
		emp.setEname("帅哥");
		emp.setSalary(100000);
		System.out.println("第二次打印对象"+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
		
		
		emp.recovery(taker.getMeneto());  //恢复到备忘录对象保存的状态
		
		System.out.println("第三次打印对象"+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
		
		
	}
}
