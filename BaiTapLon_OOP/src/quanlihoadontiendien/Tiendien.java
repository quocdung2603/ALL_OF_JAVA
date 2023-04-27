package quanlihoadontiendien;
import java.util.*;
public abstract class Tiendien {
	protected String makh,hoten;
	protected Ngay ngayrahdl;
	protected double soluongkw,dongia;
	abstract double Thanhtien();
	Scanner sc = new Scanner(System.in);
	
	public Tiendien() {
		// TODO Auto-generated constructor stub
	}

	public Tiendien(String makh, String hoten, Ngay ngayrahdl, double soluongkw, double dongia) {
		super();
		this.makh = makh;
		this.hoten = hoten;
		this.ngayrahdl = ngayrahdl;
		this.soluongkw = soluongkw;
		this.dongia = dongia;
	}

	public String getMakh() {
		return makh;
	}

	public void setMakh(String makh) {
		this.makh = makh;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public Ngay getNgayrahdl() {
		return ngayrahdl;
	}

	public void setNgayrahdl(Ngay ngayrahdl) {
		this.ngayrahdl = ngayrahdl;
	}

	public double getSoluongkw() {
		return soluongkw;
	}

	public void setSoluongkw(double soluongkw) {
		this.soluongkw = soluongkw;
	}

	public double getDongia() {
		return dongia;
	}

	public void setDongia(double dongia) {
		this.dongia = dongia;
	}
	
	public void Input()
	{
		System.out.print("Ma khach hang: "); String a= sc.nextLine();
		System.out.print("Ho ten: "); String b = sc.nextLine();
		System.out.println("Ngay lap hoa don: "); Ngay c = new Ngay(); c.Input();
		System.out.print("So luong KW: "); double d = sc.nextDouble();
		System.out.print("Don gia: "); double e = sc.nextDouble();
		setMakh(a);
		setHoten(b);
		setNgayrahdl(c);
		setSoluongkw(d);
		setDongia(e);
	}
}
