package com.mateng.builder;

public class SxtAirShipDirector implements AirShipDirector{
	private AirShipBuilder builder;
	
	public SxtAirShipDirector(AirShipBuilder builder) {
		super();
		this.builder = builder;
	}

	@Override
	public AirShip directAirShip() {
		Engine e = builder.builderEngine();
		OrbitalModule o = builder.builderOrbitalMoudle();
		EscapeTower et = builder.bulidescapeTower();
		
		AirShip ship = new AirShip();
		ship.setEngine(e);
		ship.setEscapeTower(et);
		ship.setOrbitalModule(o);
		return ship;
	}
	

}
