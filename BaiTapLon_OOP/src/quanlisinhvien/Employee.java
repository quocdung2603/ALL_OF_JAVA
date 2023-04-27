package quanlisinhvien;

public class Employee extends Person {
	double hesoluong;
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String hoten, String diachi , double hesoluong) {
		super(hoten, diachi);
		this.hesoluong = hesoluong;
	}

	public double getHesoluong() {
		return hesoluong;
	}

	public void setHesoluong(double hesoluong) {
		this.hesoluong = hesoluong;
	}
	
	public void Input()
	{
		super.Input();
		System.out.print("He so luong: "); double c = sc.nextDouble();
		this.hesoluong = c;
	}
	
	public double Tinhluong()
	{
		return this.getHesoluong() * 2000000;
	}

	@Override
	public String toString() {
		return "Employee [hesoluong=" + hesoluong + ", hoten=" + hoten + ", diachi=" + diachi + ", Tinhluong()="
				+ Tinhluong() + "]";
	}

	
	
}
