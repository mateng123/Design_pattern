package com.mateng.decorator;

public class Client {
	public static void main(String[] args) {
		Car car = new Car();
		car.move();
		System.out.println("增加飞行功能");
		FlyCar flycar = new FlyCar(car);
		flycar.move();
		
		System.out.println("增加水里功能");
		WaterCar waterCar = new WaterCar(flycar);
		waterCar.move();
		System.out.println("增加两个新功能，飞行，水里---");
		WaterCar waterCar2 = new WaterCar(new FlyCar(car));
		waterCar2.move();
	}
}
