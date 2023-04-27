package quanlisaphanghoa;

public class ClosingStall extends Stall {

	public ClosingStall() {
		// TODO Auto-generated constructor stub
	}

	public ClosingStall(int id, double area, double rentalUnitPrice) {
		super(id, area, rentalUnitPrice);
		// TODO Auto-generated constructor stub
	}

	public void Input()
	{
		super.Input();
	}
	@Override
	double getPay() {
		return this.getRentalUnitPrice() * this.getArea() + (this.getRentalUnitPrice() * this.getArea())*0.1;
	}

	@Override
	public String toString() {
		return "ClosingStall [id=" + id + ", area=" + area + "]";
	}
	
	
}
