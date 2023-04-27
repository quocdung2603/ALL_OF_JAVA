package Baitap1_PTbac2;

import java.util.*;
public class Dieukien {
    PTB2 pt = new PTB2();
    public void nhappt()
    {
        pt.nhap();
    }
    public void check()
    {
        if(pt.a==0)
        {
            if(pt.b==0)
            {
                System.out.print("Vo nghiem");
            }
            else 
            {
                System.out.print("Nghiem duy nhat:" + pt.DuyNhat());
            }
        }
        else 
        {
            if(pt.Delta()<0)
            {
                System.out.print("Vo nghiem");
            }
            else 
            {
                if(pt.Delta() == 0) 
                {
                    System.out.print("Nghiem duy nhat: " + pt.DuyNhat());
                }
                else 
                {
                    System.out.println("Hai nghiem phan biet: ");
                    pt.Phanbiet();
                }
            }
        }
    }
}
