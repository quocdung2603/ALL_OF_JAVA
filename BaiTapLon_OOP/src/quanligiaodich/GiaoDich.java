package quanligiaodich;
import java.util.*;
//abstract class: vừa có phương thức vừa có thuộc tính
//interface : ko có thuộc tính , chỉ có phương thức
// class bình thường: chỉ  có thuộc tính , ko có phương thức
abstract class GiaoDich {
	protected String magd;
	protected Ngay ngaygd;
	protected double dongia;
	protected int soluong;
	Scanner sc = new  Scanner(System.in);
	public abstract double ThanhTien();
	
	public GiaoDich() {
		// TODO Auto-generated constructor stub
	}
	public GiaoDich(String magd, Ngay ngaygd, double dongia, int soluong) {
		super();
		this.magd = magd;
		this.ngaygd = ngaygd;
		this.dongia = dongia;
		this.soluong = soluong;
	}

	public String getMagd() {
		return magd;
	}

	public void setMagd(String magd) {
		this.magd = magd;
	}

	public Ngay getNgaygd() {
		return ngaygd;
	}

	public void setNgaygd(Ngay ngaygd) {
		this.ngaygd = ngaygd;
	}

	public double getDongia() {
		return dongia;
	}

	public void setDongia(double dongia) {
		this.dongia = dongia;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public void Input()
	{
		System.out.print("Ma giao dich: "); String a = sc.nextLine();
		System.out.println("Ngay giao dich: "); Ngay b = new Ngay(); b.Input();
		System.out.print("Don gia: "); double c = sc.nextDouble();
		System.out.print("So luong: "); int d = sc.nextInt();
		setMagd(a);
		setNgaygd(b);
		setDongia(c);
		setSoluong(d);
	}
	
}
