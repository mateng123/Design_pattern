package com.mateng.factory.abstractFactory;

public class LowFactory  implements CarFactory{

	@Override
	public Engine createEngine() {
		return new LowEngine();
	}

	@Override
	public Seat createSeat() {
		return new LowSeat();
	}

	@Override
	public Tyre createTyre() {
		return new LowTyre();
	}


	
}
