package Bai1;

import java.util.Scanner;

public class PHUKIEN {
    String tenphukien ;  
    int gia;
    Scanner sc = new Scanner(System.in);
    public PHUKIEN() {
    }

    public PHUKIEN(String tenphukien, int gia) {
        this.tenphukien = tenphukien;
        this.gia = gia;
    }

    public String getTenphukien() {
        return this.tenphukien;
    }

    public void setTenphukien(String tenphukien) {
        this.tenphukien = tenphukien;
    }

    public int getGia() {
        return this.gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    void Input()
    {
        System.out.print('\t'+ "Nhap ten phu kien: ");
        String a = new String();
        a= sc.nextLine();
        System.out.print('\t'+ "Gia phu kien: ");
        int b = sc.nextInt();
        setTenphukien(a);
        setGia(b);
    }    
}
