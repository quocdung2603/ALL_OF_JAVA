package Baitap3_Phanso;

import java.util.Scanner;

public class Phanso {
    private int tu,mau;
    public Phanso()
    {

    }
    public Phanso(int tu, int mau)
    {
        this.tu = tu;
        this.mau=mau;
    }
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tu: ");
        int newtu=sc.nextInt();
        System.out.print("Mau: ");
        int newmau=sc.nextInt();
        this.tu= newtu;
        this.mau=newmau;
    }
    public int gettu() 
    {
        return this.tu;
    }
    public int getmau()
    {
        return this.mau;
    }
    public void setmau(int newmau)
    {
        this.mau = newmau;
    }
    public void settu(int newtu)
    {
        this.tu = newtu;
    }
    public int UCLN(int a, int b)
    {
        if (a == 0 || b == 0){
            return a + b;
        }
        while (a != b){
            if (a > b){
                a -= b;
            }else{
                b -= a;
            }
        }
        return a;
    }
    public void ToigianPS()
    {
        int k = UCLN(this.gettu(),this.getmau());
        this.settu(this.gettu() /k);
        this.setmau(this.getmau()/k);
    }
    public void Cong (Phanso ps)
    {
        int t = this.gettu()* ps.getmau() + ps.gettu() * this.getmau();
        int m = this.getmau() * ps.getmau();
        Phanso toigian = new Phanso(t,m);
        toigian.ToigianPS(); 
        System.out.println("Tong 2 phan so la: " + toigian.tu +"/" + toigian.mau);
    }
    public void Tru( Phanso ps)
    {
        int t = this.gettu()* ps.getmau() - ps.gettu() * this.getmau();
        int m = this.getmau() * ps.getmau();
        Phanso toigian = new Phanso(t,m);
        toigian.ToigianPS(); 
        System.out.println("Hieu 2 phan so la: " + toigian.tu +"/" + toigian.mau);
    }
    public void Nhan( Phanso ps)
    {
        int t= this.gettu() * ps.gettu();
        int m = this.getmau()*ps.getmau();
        Phanso toigian = new Phanso(t,m);
        toigian.ToigianPS(); 
        System.out.println("tich 2 phan so la: " + toigian.tu +"/" + toigian.mau);
    }
    public void Chia( Phanso ps)
    {
        int t= this.gettu() * ps.getmau();
        int m = this.getmau()*ps.gettu();
        Phanso toigian = new Phanso(t,m);
        toigian.ToigianPS(); 
        System.out.println("Thuong 2 phan so la: " + toigian.tu +"/" + toigian.mau);
    }
}
