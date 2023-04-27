package quanlisaphanghoa;

public class JewelryStall extends Stall {
	double revenue;
	public JewelryStall() {
		// TODO Auto-generated constructor stub
	}

	public JewelryStall(int id, double area, double rentalUnitPrice, double revenue) {
		super(id, area, rentalUnitPrice);
		// TODO Auto-generated constructor stub
		this.revenue = revenue;
	}
	
	
	public double getRevenue() {
		return revenue;
	}

	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}

	public void Input()
	{
		super.Input();
		System.out.print("Revenue: "); double d = sc.nextDouble();
		this.revenue = d;
	}
	@Override
	double getPay() {
		if(this.getRevenue() < 100000000) 
			return this.getRentalUnitPrice()*this.getArea()  + (this.getRentalUnitPrice()*this.getArea())*0.2;
		return this.getRentalUnitPrice()*this.getArea()  + (this.getRentalUnitPrice()*this.getArea())*0.3;
	}

	@Override
	public String toString() {
		return "JewelryStall [id=" + id + ", area=" + area + ", revenue=" + revenue + "]";
	}
	
	
}
