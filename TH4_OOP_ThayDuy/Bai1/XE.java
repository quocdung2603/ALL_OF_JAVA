package Bai1;

import java.util.Scanner;

abstract class XE {
    protected String name, nhanhieu;
    protected int giagoc;
    Scanner sc = new Scanner(System.in);
    abstract double Tinhgiaban();
    public XE() {
    }

    public XE(String name, String nhanhieu, int giagoc) {
        this.name = name;
        this.nhanhieu = nhanhieu;
        this.giagoc = giagoc;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNhanhieu() {
        return this.nhanhieu;
    }

    public void setNhanhieu(String nhanhieu) {
        this.nhanhieu = nhanhieu;
    }

    public int getGiagoc() {
        return this.giagoc;
    }

    public void setGiagoc(int giagoc) {
        this.giagoc = giagoc;
    }
    public void Input()
    {
        System.out.print("Ten xe: ");
        String a  = sc.nextLine();
        System.out.print("Nhan hieu: ");
        String b = sc.nextLine();  
        System.out.print("Gia goc: ");
        int c = sc.nextInt();
        setName(a);
        setNhanhieu(b);
        setGiagoc(c);
    }
    public void Output()
    {
        System.out.println(this.getName() + '\t' + this.getNhanhieu() + '\t' +  this.Tinhgiaban());
    }
}
