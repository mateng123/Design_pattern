package com.mateng.decorator;
/*
 * ���󹹽�
 */
public interface ICar {
	void move();
}

//��ʵ����
class Car implements ICar{

	@Override
	public void move() {
		System.out.println("½�����ܣ�");
		
	}
	
}

class SuperCar implements ICar{
	protected ICar car;
	
	public SuperCar(ICar car) {
		super();
		this.car = car;
	}
	
	@Override
	public void move() {
		car.move();
		
	}
	
}

class FlyCar extends SuperCar{

	public FlyCar(ICar car) {
		super(car);
		
	}
	public void fly() {
		System.out.println("���Ϸɣ�");
	}
	
	@Override
	public void move() {
		super.move();
		fly();
	}
	
}

class WaterCar extends SuperCar{

	public WaterCar(ICar car) {
		super(car);
		
	}
	public void swim() {
		System.out.println("ˮ���Σ�");
	}
	 
	@Override
	public void move() {
		super.move();
		swim();
	}
	
}

class AICar extends SuperCar{

	public AICar(ICar car) {
		super(car);
		
	}
	public void autoMove() {
		System.out.println("�Զ��ܣ�");
	}
	 
	@Override
	public void move() {
		super.move();
		autoMove();
	}
	
}