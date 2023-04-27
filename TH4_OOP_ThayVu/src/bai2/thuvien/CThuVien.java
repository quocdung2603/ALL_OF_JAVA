package bai2.thuvien;
import java.util.*;
public class CThuVien {
	protected String hoten;
	protected Ngay ngaylapthe;
	protected int sothanghieuluc;
	Scanner sc = new Scanner(System.in);
	public CThuVien() {
		// TODO Auto-generated constructor stub
	}
	public CThuVien(String hoten, Ngay ngaylapthe, int sothanghieuluc) {
		this.hoten = hoten;
		this.ngaylapthe = ngaylapthe;
		this.sothanghieuluc = sothanghieuluc;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public Ngay getNgaylapthe() {
		return ngaylapthe;
	}
	public void setNgaylapthe(Ngay ngaylapthe) {
		this.ngaylapthe = ngaylapthe;
	}
	public int getSothanghieuluc() {
		return sothanghieuluc;
	}
	public void setSothanghieuluc(int sothanghieuluc) {
		this.sothanghieuluc = sothanghieuluc;
	}
	public void Input()
	{
		System.out.print("ho ten: "); String a =sc.nextLine();
		System.out.println("Ngay lap the: "); 
		Ngay b = new Ngay();
		b.Input();
		System.out.print("So thang hieu luc: "); int c = sc.nextInt();
		this.hoten = a ; 
		this.ngaylapthe = b;
		this.sothanghieuluc = c;
	}
	
}
