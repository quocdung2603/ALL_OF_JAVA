package quanlidichvukhachsan;
import java.util.*;
public class HoaDon {
	private int mahd;
	private String tenhd;
	private Vector<IDichVu> dsdv = new Vector<IDichVu>();
	Scanner sc = new Scanner(System.in);
	public HoaDon() {
		// TODO Auto-generated constructor stub
	}
	public HoaDon(int mahd, String tenhd, Vector<IDichVu> dsdv) {
		super();
		this.mahd = mahd;
		this.tenhd = tenhd;
		this.dsdv = dsdv;
	}
	
	
	public int getMahd() {
		return mahd;
	}
	public void setMahd(int mahd) {
		this.mahd = mahd;
	}
	public String getTenhd() {
		return tenhd;
	}
	public void setTenhd(String tenhd) {
		this.tenhd = tenhd;
	}
	public Vector<IDichVu> getDsdv() {
		return dsdv;
	}
	public void setDsdv(Vector<IDichVu> Dsdv) {
		this.dsdv = Dsdv;
	}
	public void Indsdv()
	{
		for(int i=0;i<dsdv.size();i++)
		{
			System.out.println(dsdv.get(i));
		}
	}
	public void ThemDichVu(IDichVu d)
	{
		dsdv.add(d);
	}
	
	public double getGiaTriHoaDon()
	{
		double s=0;
		for(int i=0;i<dsdv.size();i++)
		{
			s+=dsdv.get(i).getTienDichVu();
		}
		return s;
	}
	
	public void Input()
	{
		System.out.print("Ma hoa don: "); int d = sc.nextInt();
		sc.nextLine();
		System.out.print("Ten khach hang: "); String e = sc.nextLine();
		while(true)
		{
			System.out.println("Chon dich vu:" + '\n' + '\t' + "1. Giat ui"  + '\n' + '\t' + "2. Thue xe" + '\n' + '\t' + "0. Thoat");
			System.out.print("--> "); int x = sc.nextInt();
			if(x==1)
			{
				GiatUi k = new GiatUi();
				k.Input();
				ThemDichVu(k);
			}
			else if(x==2)
			{
				ThueXe k = new ThueXe();
				k.Input();
				ThemDichVu(k);
			}
			else if(x==0)
			{
				break;
			}
		}
		setMahd(d);
		setTenhd(e);
	}
	@Override
	public String toString() {
		return "HoaDon [mahd=" + mahd + ", tenhd=" + tenhd + ", getGiaTriHoaDon()=" + getGiaTriHoaDon() + "]";
	}
	
	
}
