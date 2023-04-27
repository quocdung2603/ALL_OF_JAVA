package quanliphonghoc;
import java.util.*;
public abstract class PHONG {
	protected String maphong,daynha;
	protected double dientich;
	protected int sobongden;
	public abstract String PhongHocDatChuan();
	Scanner sc = new Scanner(System.in);
	public PHONG() {
		// TODO Auto-generated constructor stub
	}
	public PHONG(String maphong, String daynha, double dientich, int sobongden) {
		super();
		this.maphong = maphong;
		this.daynha = daynha;
		this.dientich = dientich;
		this.sobongden = sobongden;
	}
	public String getMaphong() {
		return maphong;
	}
	public void setMaphong(String maphong) {
		this.maphong = maphong;
	}
	public String getDaynha() {
		return daynha;
	}
	public void setDaynha(String daynha) {
		this.daynha = daynha;
	}
	public double getDientich() {
		return dientich;
	}
	public void setDientich(double dientich) {
		this.dientich = dientich;
	}
	public int getSobongden() {
		return sobongden;
	}
	public void setSobongden(int sobongden) {
		this.sobongden = sobongden;
	}
	
	public void Input()
	{
		System.out.println("Ma phong: "); String a = sc.nextLine();
		System.out.println("Day nha: "); String b = sc.nextLine();
		System.out.println("Dien tich: "); double c = sc.nextDouble();
		System.out.println("So bong den: "); int d = sc.nextInt();
		setMaphong(a);
		setDaynha(b);
		setDientich(c);
		setSobongden(d);
	}
}
