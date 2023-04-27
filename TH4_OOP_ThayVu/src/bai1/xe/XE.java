package bai1.xe;
import java.util.*;
public class XE {
	protected String nhanhieu;
	protected int namsx,sobanhxe;
	protected double giasx, gialanbanh;
	Scanner sc = new Scanner(System.in);
	public XE() {}
	public XE(String nhanhieu, int namsx, int sobanhxe, double giasx, double gialanbanh) {
		this.nhanhieu = nhanhieu;
		this.namsx = namsx;
		this.sobanhxe = sobanhxe;
		this.giasx = giasx;
		this.gialanbanh = gialanbanh;
	}
	public String getNhanhieu() {
		return nhanhieu;
	}
	public void setNhanhieu(String nhanhieu) {
		this.nhanhieu = nhanhieu;
	}
	public int getNamsx() {
		return namsx;
	}
	public void setNamsx(int namsx) {
		this.namsx = namsx;
	}
	public int getSobanhxe() {
		return sobanhxe;
	}
	public void setSobanhxe(int sobanhxe) {
		this.sobanhxe = sobanhxe;
	}
	public double getGiasx() {
		return giasx;
	}
	public void setGiasx(double giasx) {
		this.giasx = giasx;
	}
	public double getGialanbanh() {
		return gialanbanh;
	}
	public void setGialanbanh(double gialanbanh) {
		this.gialanbanh = gialanbanh;
	}
	public void Input() {
		
		System.out.print("Nhan hieu: "); String a = sc.nextLine();
		System.out.print("Nam san xuat: "); int b = sc.nextInt();
		System.out.print("So banh xe: "); int c = sc.nextInt();
		System.out.print("Gia san xuat: "); double d = sc.nextDouble();
		setNhanhieu(a);
		setNamsx(b);
		setSobanhxe(c);
		setGiasx(d);
	}
}
