package bai3.nhanvien;
import java.util.*;
public class Thoivu extends Nhanvien {

	double wage , hour;
	Scanner sc = new Scanner(System.in);
	public Thoivu() {
		// TODO Auto-generated constructor stub
	}

	public Thoivu(String name, double totalsalary, double wage , double hour) {
		super(name, totalsalary);
		// TODO Auto-generated constructor stub
		this.wage = wage;
		this.hour = hour;
	}
	
	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		this.hour = hour;
	}

	@Override
	double calculatetotalsalary() {
		return this.getWage() * this.getHour();
	}
	
	public void Input()
	{
		super.Input();
		System.out.print("Luong 1 gio: "); double c = sc.nextDouble();
		System.out.print("So gio lam viec: "); double d = sc.nextDouble();
		this.wage = c;
		this.hour = d;
	}

	@Override
	public String toString() {
		return "Thoivu [wage=" + wage + ", hour=" + hour + ", name=" + name + ", totalsalary="
				+ totalsalary + "]";
	}

	

	
}
