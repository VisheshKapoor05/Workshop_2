package Workshop_2.AutoShopProblem.entity;

public class Ford extends Car{

	int year;		// declaring remaining properties of Ford
	int manufacturerDiscount;
	
	public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {		// constructor to get the values of Ford properties
		super(speed, regularPrice, color);		// passing the values to parent class(Car) to store the values of Ford properties
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}
	
	public double getCarPrice() {		// returns the sales price of Ford
		regularPrice = regularPrice - manufacturerDiscount;		// calculating new regular price which is our sale price
		return regularPrice;
	}

}
