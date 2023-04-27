package bai3.nhanvien;

public class Chinhthuc extends Nhanvien {

	double salary;
	public Chinhthuc() {
	}

	public Chinhthuc(String name, double totalsalary,double salary) {
		super(name, totalsalary);
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	double calculatetotalsalary() {
		return this.getSalary();
	}
	
	public void Input()
	{
		super.Input();
		System.out.print("Luong thang: "); double c = sc.nextDouble();
		this.salary = c;
	}

	@Override
	public String toString() {
		return "Chinhthuc [salary=" + salary + ", name=" + name + ", totalsalary=" + totalsalary + "]";
	}

	
	
	
}
