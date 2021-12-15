package Workshop_2.AutoShopProblem.entity;

public class Truck extends Car {

	private int weight;		// declaring remaining properties of Truck
	
	public Truck(int speed, double regularPrice, String color, int weight) {		// constructor to get the values of Truck properties	
		super(weight, regularPrice, color);		// passing the values to parent class(Car) to store the values of truck properties
		this.weight = weight;
	}
	
	public double getSalePrice() {		// returns the sales price of truck
		int discount;		// declaring discount variable 
		
		if(weight>2000)		// defining discount based on weight
			discount = 10;
		else
			discount = 20;
		
		regularPrice = regularPrice - (regularPrice*discount)/100 ;		// calculating new regular price which is our sale price
		return regularPrice;
	}

}
