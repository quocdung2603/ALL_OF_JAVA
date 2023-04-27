package Bai2;

import java.util.Scanner;

abstract class BenhNhan {
    protected String mabn , tenbn;
    abstract int Tinhvienphi();
    Scanner sc  = new Scanner(System.in);
    public BenhNhan() {
    }

    public BenhNhan(String mabn, String tenbn) {
        this.mabn = mabn;
        this.tenbn = tenbn;
    }

    public String getMabn() {
        return this.mabn;
    }

    public void setMabn(String mabn) {
        this.mabn = mabn;
    }

    public String getTenbn() {
        return this.tenbn;
    }

    public void setTenbn(String tenbn) {
        this.tenbn = tenbn;
    }
    @Override
    public String toString() {
        return "{" +
            " mabn='" + getMabn() + "'" +
            ", tenbn='" + getTenbn() + "'" +
            "}";
    }
    public void Input()
    {
        System.out.print("Ma benh nhan: ");
        String a = sc.nextLine();
        System.out.print("Ten benh nhan: ");
        String b = sc.nextLine();
        this.mabn = a;
        this.tenbn = b;
    }
    public void Output()
    {
        System.out.print(this.getMabn() +'\t' + "|"  +'\t'+  this.getTenbn());
    }
}
