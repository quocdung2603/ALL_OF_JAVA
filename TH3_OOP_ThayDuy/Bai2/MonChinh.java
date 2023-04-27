package Bai2;

import java.util.Scanner;

public class MonChinh extends MonAn {
    String kieumon;
    Scanner sc = new Scanner(System.in);
    public MonChinh() {
    }

    public MonChinh(String mamon , String tenmon , double giatien, String kieumon) {
        super(mamon, tenmon, giatien);
        this.kieumon = kieumon;
    }

    public String getKieumon() {
        return this.kieumon;
    }

    public void setKieumon(String kieumon) {
        this.kieumon = kieumon;
    }

    public MonChinh kieumon(String kieumon) {
        setKieumon(kieumon);
        return this;
    }
    @Override
    public String toString() {
        return "" +
            " kieumon='" + getKieumon() + "'" +
            "}";
    }
    public void Input()
    {
        super.Input();
        System.out.println("Nhap loai mon an: ");
        String nloaian = new String();
        nloaian = sc.nextLine();
        this.kieumon = nloaian;
    }
    public void Output()
    {
        super.Output();
        System.out.print("Loai Do An: " + this.getKieumon() + '\n');
    }
}
