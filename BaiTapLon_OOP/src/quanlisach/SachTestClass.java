package quanlisach;

import java.util.*;
import java.io.*;

public class SachTestClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Sach> b = new ArrayList<Sach>();
		SachFactory a = new SachFactory(b);
		while (true) {
			System.out.println("Nhap lua chon cua ban:" + '\n' + '\t' + "1. Them sach" + '\n' + '\t'
					+ "2. Xuat danh sach sach" + '\n' + '\t' + "3. Tinh tong thanh tien tung loai sach"
					+ '\n' + '\t' + "4. Trung binh cong don gia sach tham khao" + '\n' + '\t'
					+ "5. Xuat sach nha xuat ban X" + '\n' + '\t' + "0. Thoat chuong trinh");
			System.out.print("--> ");
			int t = sc.nextInt();
			if(t==1)
			{
				a.ThemSach();
				Log x = Log.getInstance();
				x.WriteLog(t);
			}
			else if(t==2)
			{
				a.XuatDanhSachSach();
				Log x = Log.getInstance();
				x.WriteLog(t);
			}
			else if(t==3)
			{
				a.TongThanhTienTungLoai();
				Log x = Log.getInstance();
				x.WriteLog(t);
			}
			else if(t==4)
			{
				a.TrungBinhDonGiaSachThamKhao();
				Log x = Log.getInstance();
				x.WriteLog(t);
			}
			else if(t==5)
			{
				a.XuatSachNhaXuatBanX();
				Log x = Log.getInstance();
				x.WriteLog(t);
			}
			else if(t==6)
			{
				try {
					FileReader mf = new FileReader("D:\\\\ALL_OF_JAVA\\\\BaiTapLon_OOP\\\\src\\\\Log.txt");
					BufferedReader bf = new BufferedReader(mf);
					String line;
					while((line=bf.readLine())!= null)
					{
						System.out.println(line);
					}
					bf.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			else if(t==0)
			{
				sc.close();
				Log x = Log.getInstance();
				x.WriteLog(t);
				return;
			}
		}

	}

}
