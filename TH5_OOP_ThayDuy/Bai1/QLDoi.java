package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class QLDoi {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Nhanvien> a = new ArrayList<Nhanvien>();
        QLDoi_Factory b = new QLDoi_Factory(a);
        while(true)
        {
            System.out.println("Moi nhap lua chon: " + '\n'+'\t' + "1. Them nhan vien" + '\n'+'\t' + "2. In danh sach nhan vien" + '\n'+'\t' + "3. Tim kiem nhan vien" + '\n'+'\t' + "4. Thoat");
            System.out.print("--> ");
            int n =sc.nextInt();
            if(n==1)
            {
                b.Input();
            }
            else if(n==2)
            {
                b.Output();
            }
            else if(n==3)
            {
                b.Find();
            }
            else 
            {
                return;
            }
        }
    }
}
