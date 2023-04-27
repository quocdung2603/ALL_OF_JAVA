package Bai3;

import java.util.Scanner;

public class TestDonHang {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        DonHang x;
        System.out.println("Chon 1,2 hoac 3 de su dung dich vu: ");
        System.out.println("1. Hoa Toc");
        System.out.println("2. Giao nhanh");
        System.out.println("3. Di thuong");
        int type = sc.nextInt();
        if(type==1) 
            x = DonHangFactory.getDonHang("Hoa Toc");
        else if(type==2)
            x = DonHangFactory.getDonHang("Giao Nhanh");
        else 
            x = DonHangFactory.getDonHang("Di Thuong");
        x.Input();
        System.out.println(x.tostring());
        sc.close();
    }
} 
