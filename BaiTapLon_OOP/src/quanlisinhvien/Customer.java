package quanlisinhvien;

public class Customer extends Person {
	String tencongty,danhgia;	
	double giatrihoadon;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(String hoten, String diachi, String tencongty, String danhgia, double giatrihoadon) {
		super(hoten, diachi);
		this.tencongty = tencongty;
		this.danhgia = danhgia;
		this.giatrihoadon = giatrihoadon;
	}
	public String getTencongty() {
		return tencongty;
	}
	public void setTencongty(String tencongty) {
		this.tencongty = tencongty;
	}
	public String getDanhgia() {
		return danhgia;
	}
	public void setDanhgia(String danhgia) {
		this.danhgia = danhgia;
	}
	public double getGiatrihoadon() {
		return giatrihoadon;
	}
	public void setGiatrihoadon(double giatrihoadon) {
		this.giatrihoadon = giatrihoadon;
	}
	
	public void Input()
	{
		super.Input();
		System.out.print("Ten cong ty: "); String c = sc.nextLine();
		System.out.print("Gia tri hoa don: "); double d = sc.nextDouble(); sc.nextLine();
		System.out.print("Danh gia: "); String e = sc.nextLine();
		this.tencongty=c;
		this.giatrihoadon = d;
		this.danhgia =e;
	}
	@Override
	public String toString() {
		return "Customer [tencongty=" + tencongty + ", danhgia=" + danhgia + ", giatrihoadon=" + giatrihoadon
				+ ", hoten=" + hoten + ", diachi=" + diachi + "]";
	}
	
	
}
