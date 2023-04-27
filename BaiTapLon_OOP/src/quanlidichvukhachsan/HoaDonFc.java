package quanlidichvukhachsan;
import java.util.*;
public class HoaDonFc {
	Vector<HoaDon> a = new Vector<HoaDon>();
	Scanner sc = new Scanner(System.in);
	public HoaDonFc()
	{
		
	}
	public HoaDonFc(Vector<HoaDon> a) {
		super();
		this.a = a;
	}
	
	public void ThemHoaDon()
	{
		HoaDon k = new HoaDon();
		k.Input();
		a.add(k);
	}
	
	public void InDanhSachHoaDon()
	{
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
	}
	
	public void InChiTiet()
	{
		System.out.print("Nhap ma hoa don: "); int z =sc.nextInt();
		for(int i=0;i<a.size();i++)
		{
			if(z==a.get(i).getMahd())
			{
				System.out.println(a.get(i));
				a.get(i).Indsdv();
				return;
			}
		}
	}
}
