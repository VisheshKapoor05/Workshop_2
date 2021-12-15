package Workshop_2.AutoShopProblem.entity;

public class Sedan extends Car{

	int length;		// declaring remaining properties of Sedan
	
	public Sedan(int speed, double regularPrice, String color, int length) {		// constructor to get the values of Sedan properties
		super(speed, regularPrice, color);		// passing the values to parent class(Car) to store the values of Sedan properties
		this.length = length;
	}
	
	public double getCarPrice() {		// returns the sales price of sedan
		int discount;		// declaring discount variable
		
		if(length>20)		// defining discount based on weight
			discount = 5;
		else
			discount = 10;
		
		regularPrice = regularPrice - (regularPrice*discount)/100 ;		// calculating new regular price which is our sale price
		return regularPrice;
	}

}
