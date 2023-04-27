package quanlikhohanghoa;

import java.util.*;

public class KhoFc {
	ArrayList<Kho> a = new ArrayList<Kho>();
	Scanner sc = new Scanner(System.in);
	public KhoFc() {
		// TODO Auto-generated constructor stub
	}

	public KhoFc(ArrayList<Kho> a) {
		this.a = a;
	}

	public void ThemHang() {
		System.out.println("Lua chon: " + '\n' + '\t' + "1. Hang thuc pham" + '\n' + '\t' + "2. Hang dien tu" + '\n'
				+ '\t' + "3. Hang sanh su");
		System.out.print("--> ");	int x = sc.nextInt();
		if(x==1)
		{
			Thucpham k = new Thucpham();
			k.Input();
			for(int i=0;i<a.size();i++)
			{
				if(k.getMahang().compareTo(a.get(i).getMahang())==0)
				{
					System.out.println("Them that bai!");
					return;
				}
			}
			System.out.println("Them thanh cong!");
			a.add(k);
		}
		else if( x== 2)
		{
			Dienmay k = new Dienmay();
			k.Input();
			for(int i=0;i<a.size();i++)
			{
				if(k.getMahang().compareTo(a.get(i).getMahang())==0)
				{
					System.out.println("Them that bai!");
					return;
				}
			}
			System.out.println("Them thanh cong!");
			a.add(k);
		}
		else if(x==3)
		{
			Sanhsu k = new Sanhsu();
			k.Input();
			for(int i=0;i<a.size();i++)
			{
				if(k.getMahang().compareTo(a.get(i).getMahang())==0)
				{
					System.out.println("Them that bai!");
					return;
				}
			}
			System.out.println("Them thanh cong!");
			a.add(k);
		}
	}
	
	public void XuatDanhSachHang()
	{
		for (Kho x : a) {
			System.out.println(x);
		}
	}
}

