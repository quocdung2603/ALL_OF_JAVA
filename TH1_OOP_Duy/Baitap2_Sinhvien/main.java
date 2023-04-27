package Baitap2_Sinhvien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * main
 */
public class main {

    public static void main( String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <Sinhvien> dssv = new ArrayList<Sinhvien>();
        char kt = 'c';
        while(kt!='k')
        {
            Sinhvien sv1= new Sinhvien();
            sv1.Nhapthongtin();
            dssv.add(sv1);
            kt=sc.next().charAt(0);
        }
        System.out.println("Danh sach sinh vien: ");
        for(int i=0;i<dssv.size();i++)
        {
            System.out.println(dssv.get(i).toString());
        }
        System.out.println("Nhung sinh vien co cung diem trung binh: ");
        new Sinhvien().Kiemtradtb(dssv);
        sc.close();
    }
} 