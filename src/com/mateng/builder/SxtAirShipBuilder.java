package com.mateng.builder;

public class SxtAirShipBuilder implements AirShipBuilder{

	@Override
	public Engine builderEngine() {
		System.out.println("����������");
		return new Engine("������");
	}

	@Override
	public OrbitalModule builderOrbitalMoudle() {
		System.out.println("���������");
		return new OrbitalModule("�����");
	}

	@Override
	public EscapeTower bulidescapeTower() {
		System.out.println("����������");
		return new EscapeTower("������");
	}
	
	
}
