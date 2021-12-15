package Workshop_2.AutoShopProblem.demo;

import Workshop_2.AutoShopProblem.entity.Car;
import Workshop_2.AutoShopProblem.entity.Ford;
import Workshop_2.AutoShopProblem.entity.Sedan;
import Workshop_2.AutoShopProblem.entity.Truck;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		
		System.out.println("Welcome to my auto shop");
		System.out.println();
		
		int speed = 100;			// defining properties of truck
		double regularPrice = 15;
		String color = "Blue";
		int weight = 3000;
		Truck truck = new Truck(speed, regularPrice, color, weight);	// instantiation of truck class
		System.out.println("Sale Price of truck is "+truck.getSalePrice());		// printing the sales price of the truck
		
		speed = 200;				// defining properties of 1st ford
		regularPrice = 10;
		color = "Black";
		int year = 2021;
		int manufacturerDiscount = 1;
		Ford ford1 = new Ford(speed, regularPrice, color, year, manufacturerDiscount);		// instantiation of Ford class
		System.out.println("Sale Price of 1st ford is "+ford1.getSalePrice());		// printing the sales price of the 1st ford
		
		speed = 200;				// defining properties of 2nd ford
		regularPrice = 10;
		color = "Red";
		year = 2020;
		manufacturerDiscount = 2;
		Ford ford2 = new Ford(speed, regularPrice, color, year, manufacturerDiscount);		// instantiation of Ford class
		System.out.println("Sale Price of 2nd Ford is "+ford2.getSalePrice());		// printing the sales price of the 2nd ford
		
		speed = 250;				// defining properties of sedan
		regularPrice = 20;
		color = "White";
		int length = 10;
		Sedan sedan = new Sedan(speed, regularPrice, color, length);		// instantiation of Sedan class
		System.out.println("Sale Price of sedan car is "+sedan.getSalePrice());		// printing the sales price of the sedan
		
		speed = 150;				// defining properties of car
		regularPrice = 5;
		color = "Grey";
		Car car = new Car(speed, regularPrice, color);		// instantiation of Car class
		System.out.println("Sale Price of car is "+car.getSalePrice());		// printing the sales price of the car
	}

}
