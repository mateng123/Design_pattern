package com.mateng.factory.simplefactory;

public class CarFactory {
	public static Car createCar(String type) {
		if("°ÂµÏ".equals(type)) {
			return new Audi();
		}else if("±ÈÑÇµÏ".equals(type)) {
			return new BYD();
			
		}else {
			return null;
		}
	}
}
