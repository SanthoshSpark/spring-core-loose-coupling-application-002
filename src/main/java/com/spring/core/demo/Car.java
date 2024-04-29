package com.spring.core.demo;

public class Car {
	private Engine engine;

	public Car(Engine engine) {
		this.engine = engine;
	}
	
	public String start() {
		return "Car is starting. Engine type: " + engine.getType();
	}
}
