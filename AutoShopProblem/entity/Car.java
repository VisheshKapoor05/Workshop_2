package Workshop_2.AutoShopProblem.entity;

public class Car {
	
	public int speed;		// declaring properties of Car
	public double regularPrice;
	public String color;
	
	public Car(int speed, double regularPrice, String color) {		// constructor to get the values of car properties
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}

	public double getSalePrice() {		// returns the sales price of car
		return regularPrice;
	}
}
