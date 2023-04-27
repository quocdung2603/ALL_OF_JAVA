package quanlisaphanghoa;
import java.util.*;
public abstract class Stall {
	protected int id;
	protected double area,rentalUnitPrice;
	abstract double getPay();
	Scanner sc = new Scanner(System.in);
	
	public Stall() {
		// TODO Auto-generated constructor stub
	}

	public Stall(int id, double area, double rentalUnitPrice) {
		super();
		this.id = id;
		this.area = area;
		this.rentalUnitPrice = rentalUnitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getRentalUnitPrice() {
		return rentalUnitPrice;
	}

	public void setRentalUnitPrice(double rentalUnitPrice) {
		this.rentalUnitPrice = rentalUnitPrice;
	}
	
	public void Input()
	{
		System.out.print("Id: "); int a = sc.nextInt();
		System.out.print("Area: "); double b = sc.nextDouble();
		setId(a);
		setArea(b);
		setRentalUnitPrice(40000000);
	}
	
}
