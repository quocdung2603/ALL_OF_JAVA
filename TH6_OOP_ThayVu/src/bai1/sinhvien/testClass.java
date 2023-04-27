package bai1.sinhvien;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class testClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<SinhVien> b = new ArrayList<SinhVien>();
		sv_fc a = new sv_fc(b);
		while(true)
		{
			System.out.println("Lua chon cua ban: " + '\n'+'\t'+ "1. Them sinh vien" + '\n'+'\t'+ "2. Xuat danh sach sinh vien giam dan diem trung binh" +'\n'+'\t'+ "3. Xem nhat ky thao tac" + '\n'+'\t'+ "0. Thoat chuong trinh");
			System.out.print("--> "); int ty = sc.nextInt();
			if(ty==1)
			{
				a.getSinhVien();
				Log x = Log.getInstance();
				x.WriteLog(ty);
			}
			else if(ty==2)
			{
				a.ShowListDecreaseDTB();
				Log x = Log.getInstance();
				x.WriteLog(ty);
			}
			else if(ty==3)
			{
				try {
					FileReader mf = new FileReader("D:\\ALL_OF_JAVA\\TH6_OOP_ThayVu\\log.txt");
					BufferedReader bf = new BufferedReader(mf);
					String line;
					while((line = bf.readLine())!= null)
					{
						System.err.println(line);
					}
					bf.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if(ty==0)
			{
				sc.close();
				Log x= Log.getInstance();
				x.WriteLog(ty);
				return;
			}
		}
	}

}
