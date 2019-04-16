package com.mateng.decorator;

public class Client {
	public static void main(String[] args) {
		Car car = new Car();
		car.move();
		System.out.println("���ӷ��й���");
		FlyCar flycar = new FlyCar(car);
		flycar.move();
		
		System.out.println("����ˮ�﹦��");
		WaterCar waterCar = new WaterCar(flycar);
		waterCar.move();
		System.out.println("���������¹��ܣ����У�ˮ��---");
		WaterCar waterCar2 = new WaterCar(new FlyCar(car));
		waterCar2.move();
	}
}
