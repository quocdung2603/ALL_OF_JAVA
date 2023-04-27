package Bai1;

import java.util.*;

public class Nhanvien {
    protected int manv;
    protected String hoten;
    Scanner sc = new Scanner(System.in);
    public Nhanvien() {
    }

    public Nhanvien(int manv, String hoten) {
        this.manv = manv;
        this.hoten = hoten;
    }

    public int getManv() {
        return this.manv;
    }

    public void setManv(int manv) {
        this.manv = manv;
    }

    public String getHoten() {
        return this.hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }


    @Override
    public String toString() {
        return "{" +
            " manv='" + getManv() + "'" +
            ", hoten='" + getHoten() + "'" +
            "}";
    }
    
    public void Input()
    {
        System.out.print("Ma nhan vien: ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.print("Ten nhan vien: ");
        String b = sc.nextLine();
        this.hoten = b;
        this.manv = a;
    }
    public void Output()
    {
        System.out.println("Ma nhan vien: " + this.getManv());
        System.out.println("Ten nhan vien: " + this.getHoten());
    }
}
