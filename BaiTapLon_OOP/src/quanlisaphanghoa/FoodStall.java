package quanlisaphanghoa;

public class FoodStall extends Stall {
	double serviceFee;
	public FoodStall() {
		// TODO Auto-generated constructor stub
	}

	public FoodStall(int id, double area, double rentalUnitPrice, double serviceFee) {
		super(id, area, rentalUnitPrice);
		// TODO Auto-generated constructor stub
		this.serviceFee  = serviceFee;
	}

	
	public double getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(double serviceFee) {
		this.serviceFee = serviceFee;
	}
	public void Input()
	{
		super.Input();
		System.out.print("Service fee: "); double d = sc.nextDouble();
		setServiceFee(d);
	}

	@Override
	double getPay() {
		return this.getRentalUnitPrice()*this.getArea()  + (this.getRentalUnitPrice()*this.getArea())*0.05;
	}

	@Override
	public String toString() {
		return "FoodStall [id=" + id + ", area=" + area + ", serviceFee=" + serviceFee + "]";
	}

	
	
	

}
