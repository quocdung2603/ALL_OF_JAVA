package bai3.nhanvien;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Nhanvien> b = new ArrayList<Nhanvien>();
		qlnv_fc a = new qlnv_fc(b);
		while(true)	
		{
			System.out.println("Chon:" + '\n'+'\t' + "1. Them nv thoi vu"+ '\n'+'\t' + "2. Them nv chinh thuc" + '\n'+'\t' + "3. Them nv ban hang" + '\n'+'\t' + "4. Tinh luong" + '\n'+'\t' + "5. In danh sach nhan vien" + '\n'+'\t' + "0. Thoat");
			System.out.print("--> ");
			int t = sc.nextInt();
			if(t==1)
			{
				Thoivu k = new Thoivu();
				k.Input();
				a.a.add(k);
			}
			else if(t==2)
			{
				Chinhthuc k = new Chinhthuc();
				k.Input();
				a.a.add(k);
			}
			else if(t==3)
			{
				Banhang k = new Banhang();
				k.Input();
				a.a.add(k);
			}
			else if(t==4)
			{
				a.Tinhluong();
			}
			else if(t==5)
			{
				a.ShowList();
			}
			else if(t==0)
			{
				sc.close();
				return;
			}
		}
	}

}
