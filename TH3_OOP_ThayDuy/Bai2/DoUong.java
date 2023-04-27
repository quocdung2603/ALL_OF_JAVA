package Bai2;

import java.util.Scanner;

public class DoUong extends MonAn{
    String kieudouong;
    Scanner sc = new Scanner(System.in);
    public DoUong() {
    }

    public DoUong(String mamon , String tenmon , double giatien, String kieudouong) {
        super(mamon, tenmon, giatien);
        this.kieudouong = kieudouong;
    }

    public String getKieudouong() {
        return this.kieudouong;
    }

    public void setKieudouong(String kieudouong) {
        this.kieudouong = kieudouong;
    }

    public Scanner getSc() {
        return this.sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    @Override
    public String toString() {
        return "{" +
            " kieudouong='" + getKieudouong() + "'" +
            ", sc='" + getSc() + "'" +
            "}";
    }
    public void Input()
    {
        super.Input();
        System.out.println("Nhap loai Do uong: ");
        String nloaiuong = new String();
        nloaiuong = sc.nextLine();
        this.kieudouong = nloaiuong;
    }
    public void Output()
    {
        super.Output();
        System.out.print("Loai Do Uong: " + this.getKieudouong() + '\n');
    }
   
}
