package bai1.sinhvien;
import java.util.*;
public class sv_fc {
	ArrayList<SinhVien> a = new ArrayList<SinhVien>();
	Scanner sc = new Scanner(System.in);
	public sv_fc() {
		// TODO Auto-generated constructor stub
	}
	public sv_fc(ArrayList<SinhVien> a) {
		super();
		this.a = a;
	}
	public ArrayList<SinhVien> getA() {
		return a;
	}
	public void setA(ArrayList<SinhVien> a) {
		this.a = a;
	}
	
	public void getSinhVien()
	{
		System.out.println("Chon: " + '\n' +'\t' + "1. Dai hoc " + '\n' +'\t' + "2. Cao hoc");
		System.out.print("--> "); int t = sc.nextInt();
		if(t==1)
		{
			Daihoc k = new Daihoc();
			k.Input();
			a.add(k);
		}
		else if(t==2)
		{
			Caohoc k = new Caohoc();
			k.Input();
			a.add(k);
		}
	}
	public void ShowListDecreaseDTB() {
		for(int i=0;i<a.size()-1;i++)
		{
			for(int j=i+1;j<a.size();j++)
			{
				if(a.get(i).TinhDiemTrungBinh() < a.get(j).TinhDiemTrungBinh())
				{
					Collections.swap(a, i, j);
				}
			}
		}
		for(int i=0;i<a.size();i++)
		{
			a.get(i).XemThongTin();
		}
	}
//	public void GetNamHoc()
//	{
//		
//	}
}
