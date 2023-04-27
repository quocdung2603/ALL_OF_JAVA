package bai3.nhanvien;
import java.util.*;
public abstract class Nhanvien {
	protected String name;
	protected double totalsalary;
	abstract double calculatetotalsalary();
	Scanner sc = new Scanner(System.in);
	
	public Nhanvien() {
		// TODO Auto-generated constructor stub
	}

	public Nhanvien(String name, double totalsalary) {
		super();
		this.name = name;
		this.totalsalary = totalsalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTotalsalary() {
		return totalsalary;
	}

	public void setTotalsalary(double totalsalary) {
		this.totalsalary = totalsalary;
	}
	
	public void Input()
	{
		System.out.print("Ho ten:"); String a = sc.nextLine();
		System.out.print("Tong luong: "); double b = sc.nextDouble();
		this.name = a;
		this.totalsalary = b;
	}
	
}
