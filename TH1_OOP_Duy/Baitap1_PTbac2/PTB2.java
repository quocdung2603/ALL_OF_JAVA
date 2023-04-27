package Baitap1_PTbac2;

import java.util.*;

public class PTB2 {
    public double a,b,c;
    private double x1,x2,delta;
    Scanner sc = new Scanner(System.in);
    public void nhap()
    {
        System.out.print("Nhap a: ");
        a=sc.nextDouble();
        System.out.print("Nhap b: ");
        b=sc.nextDouble();
        System.out.print("Nhap c: ");
        c=sc.nextDouble();
    }
    public double Delta()
    {
        delta = (Math.pow(b,2) - 4*a*c);
        return delta;
    }
    public double DuyNhat()
    {
        x1=-c/b;
        return x1;
    }
    public double Kep()
    {
        x1=-b/(2*a);    
        return x1;
    }
    public void Phanbiet()
    {
        x1=((-b+Math.sqrt(delta))/(2*a));
        x2=((-b-Math.sqrt(delta))/(2*a));
        System.out.print(x1 + " " + x2);
    }
}

