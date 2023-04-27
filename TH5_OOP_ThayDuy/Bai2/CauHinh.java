package Bai2;

import java.util.Scanner;

public class CauHinh {
    private static CauHinh a = null;
    private static Scanner sc = new Scanner(System.in);
    int amthanh , dosang;
    private CauHinh(){}
    private CauHinh (int amthanh , int dosang) {
        this.amthanh =  amthanh;
        this.dosang = dosang;
    }
    public static CauHinh getInstance()
    {
        if(a == null)
        {
            System.out.print("Nhap am thanh: "); 
            int at,ds;
            do {
                at = sc.nextInt();
                if(at < 1 || at >100)
                {
                    System.out.print("Nhap lai am thanh: "); 
                }
            } while (at < 1 || at >100);
            System.out.print("Nhap do sang: "); 
            do {
                
                ds = sc.nextInt();
                if(ds <1 || ds > 10)
                {
                    System.out.println("Nhap lai do sang: ");
                }
            }while (ds <1 || ds > 10);
            a = new CauHinh(at,ds);
        }
        return a;
    }

    public int getAmthanh() {
        return this.amthanh;
    }

    public void setAmthanh(int amthanh) {
        this.amthanh = amthanh;
    }

    public int getDosang() {
        return this.dosang;
    }

    public void setDosang(int dosang) {
        this.dosang = dosang;
    }

    public void TangGiamAmthanh()
    {
        System.out.println("Lua chon: " + '\n'+'\t' + "1. Tang am thanh" + '\n'+'\t' + "2. Giam am thanh");
        System.out.print("--> ");
        int k =  sc.nextInt();
        if(k==1)
        {
            System.out.print("Nhap do tang: ");
            int t = sc.nextInt();
            setAmthanh(Math.min(this.getAmthanh() + t , 100));
        }
        else if(k==2)
        {
            System.out.print("Nhap do giam: ");
            int t = sc.nextInt();
            setAmthanh(Math.max(this.getAmthanh() - t , 0));
        }
    }

    public void TangGiamDoSang()
    {
        System.out.println("Lua chon: " + '\n'+'\t' + "1. Tang do sang" + '\n'+'\t' + "2. Giam do sang");
        System.out.print("--> ");
        int k =  sc.nextInt();
        if(k==1)
        {
            System.out.print("Nhap do tang: ");
            int t = sc.nextInt();
            setDosang(Math.min(this.getDosang() + t , 10));
        }
        else if(k==2)
        {
            System.out.print("Nhap do giam: ");
            int t = sc.nextInt();
            setDosang(Math.max(this.getDosang() - t , 0));
        }
    }

    public void Print()
    {
        System.out.println("Am thanh: " + this.getAmthanh() + '\n' + "Do sang: " + this.getDosang());
    }
}
