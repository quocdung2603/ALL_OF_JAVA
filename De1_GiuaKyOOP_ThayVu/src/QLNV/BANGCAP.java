package QLNV;

import java.util.Scanner;

public class BANGCAP {
    String loaibangcap , chuyennganh;
    Scanner sc = new Scanner(System.in);
    public BANGCAP(){}
    public BANGCAP(String loaibangcap , String chuyennganh)
    {
        this.loaibangcap = loaibangcap;
        this.chuyennganh = chuyennganh;
    }

    public String getLoaibangcap() {
        return this.loaibangcap;
    }

    public void setLoaibangcap(String loaibangcap) {
        this.loaibangcap = loaibangcap;
    }

    public String getChuyennganh() {
        return this.chuyennganh;
    }

    public void setChuyennganh(String chuyennganh) {
        this.chuyennganh = chuyennganh;
    }
    public void Input()
    {
        System.out.print("Ten bang cap: "); String a = sc.nextLine();
        System.out.print("Chuyen nganh: "); String b = sc.nextLine();
        this.loaibangcap = a;
        this.chuyennganh = b;
    }

}
