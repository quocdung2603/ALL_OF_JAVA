package bai3.nhanvien;
import java.util.*;
public class qlnv_fc {
	ArrayList<Nhanvien> a= new ArrayList<Nhanvien>();
	Scanner sc = new Scanner(System.in);
	public qlnv_fc() {
		// TODO Auto-generated constructor stub
	}
	public qlnv_fc(ArrayList<Nhanvien> a) {
		this.a = a;
	}
	
	public void Tinhluong()
	{
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i).getName() + " " + a.get(i).calculatetotalsalary());
		}
	}
	
	public void ShowList()
	{
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
	}
}
