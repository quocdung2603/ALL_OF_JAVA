package bai3.nhanvien;

public class Banhang extends Nhanvien {

	double salary, commission;
	int sales;
	public Banhang() {
		// TODO Auto-generated constructor stub
	}

	public Banhang(String name, double totalsalary, double salary , double commission , int sales) {
		super(name, totalsalary);
		// TODO Auto-generated constructor stub
		this.salary = salary;
		this.commission = commission;
		this.sales = sales;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	@Override
	double calculatetotalsalary() {
		return this.getSalary() + this.getCommission()* this.getSales();
	}
	
	public void Input()
	{
		super.Input();
		System.out.print("Luong thang: "); double c = sc.nextDouble();
		System.out.print("Hoa hong/san pham: "); double d = sc.nextDouble();
		System.out.print("Doanh so ban hang: "); int e = sc.nextInt();
		this.salary = c; 
		this.commission  = d; 
		this.sales = e;
	}

	@Override
	public String toString() {
		return "Banhang [salary=" + salary + ", commission=" + commission + ", sales=" + sales + ", name=" + name
				+ ", totalsalary=" + totalsalary + "]";
	}

	
	
	
}
