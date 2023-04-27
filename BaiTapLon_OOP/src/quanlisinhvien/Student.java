package quanlisinhvien;
public class Student extends Person {
	double diem1, diem2;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String hoten, String diachi,double diem1, double diem2) {
		super(hoten, diachi);
		this.diem1 = diem1;
		this.diem2 = diem2;
	}

	public double getDiem1() {
		return diem1;
	}

	public void setDiem1(double diem1) {
		this.diem1 = diem1;
	}

	public double getDiem2() {
		return diem2;
	}

	public void setDiem2(double diem2) {
		this.diem2 = diem2;
	}
	
	public void Input()
	{
		super.Input();
		System.out.print("Diem mon hoc 1: "); double c =sc.nextDouble();
		System.out.print("Diem mon hoc 2: "); double d =sc.nextDouble();
		this.diem1 = c;
		this.diem2 = d;
	}
	
	public double DiemTB()
	{
		return (this.getDiem1() + this.getDiem2())/2;
	}
	
	public String DanhGia()
	{
		if(DiemTB() <3.5) return "Kem";
		else if(DiemTB() < 5.0) return "Yeu";
		else if(DiemTB() < 6.5) return "Trung Binh";
		else if(DiemTB() < 8.0) return "Kha";
		else if(DiemTB() < 9.0) return "Gioi";
		else return "Xuat sac";
	}

	@Override
	public String toString() {
		return "Student [diem1=" + diem1 + ", diem2=" + diem2 + ", hoten=" + hoten + ", diachi=" + diachi
				+ ", DiemTB()=" + DiemTB() + ", DanhGia()=" + DanhGia() + "]";
	}
	
	
	
}
