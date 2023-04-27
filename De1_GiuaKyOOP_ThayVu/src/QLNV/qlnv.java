package QLNV;

import java.util.ArrayList;
import java.util.Scanner;

public class qlnv {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<NHANVIEN> b  = new ArrayList<NHANVIEN>();
        qlnv_factory a = new qlnv_factory(b);
        int type;
        while(true)
        {
            System.out.println("Moi nhap lua chon:"+'\n'+'\t'+ "0. Thoat chuong trinh" + '\n' + '\t' + "1. Them nhan vien chinh thuc" + '\n' + '\t' + "2. Them nhan vien thoi vu"
            + '\n' + '\t' + "3. In danh sach");
            type = sc.nextInt();
            if(type == 1 )
            {
            	try {
					CHINHTHUC k = new CHINHTHUC();
					k.Input();
					if(k.Tinhluong() > 50000000)
					{
						throw new ExceptionClass(); // nem thang sai qua ngoai le moi 
					}
					else 
					{
						a.a.add(k);
					}
				} catch (ExceptionClass e) {
					System.out.println(e.getMessage());
				}
            }
            else if(type == 2)
            {
            	try {
					THOIVU k = new THOIVU();
					k.Input();
					if(k.Tinhluong() > 50000000)
					{
						throw new ExceptionClass();
					}
					else 
					{
						a.a.add(k);
					}
				} catch (ExceptionClass e) {
					System.out.println(e.getMessage());
				}
            }
            else if(type==3)
            {
                a.Indanhsach();
            }
            else if(type == 0) 
                return;
        }
        
    }
}
