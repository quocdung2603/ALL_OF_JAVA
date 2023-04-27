package quanligiaodich;
import java.util.*;
public class GiaodichFactory {
	ArrayList<GiaoDich> a = new ArrayList<GiaoDich>();
	Scanner sc = new Scanner(System.in);
	public GiaodichFactory() {
		// TODO Auto-generated constructor stub
	}
	public GiaodichFactory(ArrayList<GiaoDich> a) {
		super();
		this.a = a;
	}
	
	public void ThemGiaoDich()
	{
		System.out.println("Chon: " + '\n' + '\t' + "1. Giao dich vang" + '\n' + '\t' + "1. Giao dich ngoai te");
		System.out.print("-->"); int x =sc.nextInt();
		if(x==1)
		{
			GdVang k = new GdVang();
			k.Input();
			a.add(k);
		}
		else if(x==2)
		{
			GdNgoaiTe k = new GdNgoaiTe();
			k.Input();
			a.add(k);
		}
	}
	
	public void  XuatDanhSachGiaoDich()
	{
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
	}
	
	public void TongSoLuongTungLoai()
	{
		int gdv=0 , gdnt=0;
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i) instanceof GdVang) gdv += a.get(i).soluong;
			else gdnt += a.get(i).soluong;
		}
		System.out.println('\t' + "Tong so luong giao dich vang: " + gdv + '\n' +'\t' + "Tong so luong giao dich ngoai te: " + gdnt);
	}
	
	public void TrungBinhThanhTienGdTienTe()
	{
		double s=0;
		int cnt=0;
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i) instanceof GdNgoaiTe)
			{
				s+=a.get(i).ThanhTien();
				cnt++;
			}
		}
		s=s/cnt;
		System.out.println("Trung binh thanh tien cua giao dich tien te: " + s);
	}
	
	public void XuatGdDonGiaTren1B()
	{
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i).dongia > 1000000000)
			{
				System.out.println(a.get(i));
			}
		}
	}

}
