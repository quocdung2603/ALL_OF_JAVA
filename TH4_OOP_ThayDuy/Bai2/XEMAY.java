package Bai2;

public class XEMAY extends XE{
    int dungtich;
    double giaban;


    public XEMAY() {
    }

    public XEMAY(String name , String nhanhieu , int giagoc,int dungtich, double giaban) {
        super(name, nhanhieu, giagoc);
        this.dungtich = dungtich;
        this.giaban = giaban;
    }

    public int getDungtich() {
        return this.dungtich;
    }

    public void setDungtich(int dungtich) {
        this.dungtich = dungtich;
    }

    public double getGiaban() {
        return this.giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    @Override
    double Tinhgiaban() {
        double s=0;
        if(dungtich >=50) 
            s= this.getGiagoc() * 0.85;
        else 
            s= this.getGiagoc() * 0.9;
        return s;
    }
    public void Input()
    {
        super.Input();
        System.out.print("Dung tich: ");
        int a = sc.nextInt();
        setDungtich(a);
    }
}
