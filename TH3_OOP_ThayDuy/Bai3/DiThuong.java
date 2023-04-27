package Bai3;

import java.util.Scanner;

public class DiThuong extends DonHang {
    Scanner sc = new Scanner(System.in);
    public int getDai() {
        return this.dai;
    }

    public void setDai(int dai) {
        this.dai = dai;
    }

    public int getRong() {
        return this.rong;
    }

    public void setRong(int rong) {
        this.rong = rong;
    }

    public int getCao() {
        return this.cao;
    }

    public void setCao(int cao) {
        this.cao = cao;
    }
    public boolean getphatthanhcong() {
        return this.phatthanhcong;
    }

    public void setphatthanhcong(boolean phatthanhcong) {
        this.phatthanhcong = phatthanhcong;
    }
    public void Input()
    {
        System.out.println("Dai: ");
        int nd = sc.nextInt();
        System.out.println("Rong");
        int nr = sc.nextInt();
        System.out.println("Cao: ");
        int nc = sc.nextInt();
        System.out.println("Tinh trang don hang : 1. Da phat or 2. Chua phat");
        int n1 = sc.nextInt();
        setCao(nc);
        setDai(nd);
        setRong(nr);
        if(n1==1)
            setphatthanhcong(true);
        else setphatthanhcong(false);
    }
    @Override
    double getKhoiluong(int dai, int rong, int cao) {
        return (dai*rong*cao)/3000;
    }
    @Override
    String tostring() 
    {
        if(phatthanhcong == true)
           return "Don hang Di thuong khoi luong " + getKhoiluong(dai, rong, cao) + " kg da phat thanh cong";
        else return "Don hang chua phat";
    }
}
