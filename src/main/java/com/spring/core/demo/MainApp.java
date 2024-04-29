package com.spring.core.demo;

public class MainApp {
 public static void main(String[] args) {
     // Create a PetrolEngine instance and use it with Car
     Engine petrolEngine = new PetrolEngine();
     
     Car petrolCar = new Car(petrolEngine);
     System.out.println(petrolCar.start());

     // Create an ElectricEngine instance and use it with Car
     Engine electricEngine = new ElectricEngine();
     
     Car electricCar = new Car(electricEngine);
     System.out.println(electricCar.start());
	 
 }
}

