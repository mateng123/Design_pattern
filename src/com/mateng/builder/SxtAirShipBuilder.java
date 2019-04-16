package com.mateng.builder;

public class SxtAirShipBuilder implements AirShipBuilder{

	@Override
	public Engine builderEngine() {
		System.out.println("构建发动机");
		return new Engine("发动机");
	}

	@Override
	public OrbitalModule builderOrbitalMoudle() {
		System.out.println("构建轨道舱");
		return new OrbitalModule("轨道舱");
	}

	@Override
	public EscapeTower bulidescapeTower() {
		System.out.println("构建逃逸塔");
		return new EscapeTower("逃逸塔");
	}
	
	
}
