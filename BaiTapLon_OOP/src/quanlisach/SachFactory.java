package quanlisach;
import java.util.*;
public class SachFactory {
	ArrayList<Sach> a = new ArrayList<Sach> ();
	Scanner sc = new Scanner(System.in);
	public SachFactory() {
		// TODO Auto-generated constructor stub
	}
	public SachFactory(ArrayList<Sach> a) {
		this.a = a;
	}
	
	public void ThemSach()
	{
		System.out.println("Chon: " + '\n' + '\t' + "1. Sach giao khoa" + '\n' + '\t' + "2. Sach tham khao");
		System.out.print("-->"); int x =sc.nextInt();
		if(x==1)
		{
			SachGiaoKhoa k = new SachGiaoKhoa();
			k.Input();
			a.add(k);
		}
		else if(x==2)
		{
			SachThamKhao k = new SachThamKhao();
			k.Input();
			a.add(k);
		}
	}
	
	public void  XuatDanhSachSach()
	{
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
	}
	
	public void TongThanhTienTungLoai()
	{
		int sgk=0 , stk=0;
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i) instanceof SachGiaoKhoa) sgk += a.get(i).Thanhtien();
			else stk += a.get(i).Thanhtien();
		}
		System.out.println('\t' + "Tong thanh tien sach giao khoa: " + sgk + '\n' +'\t' + "Tong thanh tien sach tham khao: " + stk);
	}
	
	public void TrungBinhDonGiaSachThamKhao()
	{
		double s=0;
		int cnt=0;
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i) instanceof SachThamKhao)
			{
				s+=a.get(i).Thanhtien();
				cnt++;
			}
		}
		s=s/cnt;
		System.out.println("Trung binh cong don gia sach tham khao: " + s);
	}
	public void XuatSachNhaXuatBanX()
	{
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i).nhaxuatban.compareTo("X")==0)
			{
				System.out.println(a.get(i));
			}
		}
	}
}
