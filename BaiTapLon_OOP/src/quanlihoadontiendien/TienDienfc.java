package quanlihoadontiendien;
import java.util.*;
public class TienDienfc {
	ArrayList<Tiendien> a = new ArrayList<Tiendien>();
	Scanner sc = new Scanner(System.in);
	public TienDienfc() {
		// TODO Auto-generated constructor stub
	}
	public TienDienfc(ArrayList<Tiendien> a) {
		super();
		this.a = a;
	}
	public ArrayList<Tiendien> getA() {
		return a;
	}
	public void setA(ArrayList<Tiendien> a) {
		this.a = a;
	}
	
	public void ThemHoaDon()
	{
		System.out.println("Lua chon: " + '\n'+'\t' + "1. Khach Viet Nam" + '\n'+'\t' + "2. Khach nuoc ngoai");
		System.out.print("--> "); int x =sc.nextInt();
		if(x==1)
		{
			KhachVN k = new KhachVN();
			k.Input(); 
			a.add(k);
		}
		else if(x==2)
		{
			KhachNN k = new KhachNN();
			k.Input();
			a.add(k);
		}
	}
	
	public void XuatDanhSachHoaDon()
	{
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
	}
	
	public void TongSoLuongTungLoaiKhachHang()
	{
		double vn=0 , nn =0;
		for(int i=0;i<a.size();i++) {
			if(a.get(i) instanceof KhachVN) vn += a.get(i).getSoluongkw();
			else nn+=a.get(i).getSoluongkw();
		}
		System.out.println('\t' + "Khach Viet Nam: " + vn + '\n' + '\t' + "Khach nuoc ngoai: " +nn);
	}
	public void TongTrungBinhThanhTienKhachNN()
	{
		double s=0,cnt=0;
		for(int i=0;i<a.size();i++) {
			if(a.get(i) instanceof KhachNN) 
			{
				s+=a.get(i).Thanhtien();
				cnt++;
			}
		}
		s/=cnt;
		System.out.println("Trung binh thanh tien khach nuoc ngoai: " + s);
	}
	
	public void XuatHoaDonThang9Nam2013()
	{
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i).getNgayrahdl().thang == 9 && a.get(i).getNgayrahdl().nam ==2013)
			{
				System.out.println(a.get(i));
			}
		}
	}
}
