package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class XE_Factory {
    ArrayList<XE> a = new ArrayList<XE>();
    Scanner sc = new Scanner(System.in);
    public XE_Factory() {
    }

    public XE_Factory(ArrayList<XE> a) {
        this.a = a;
    }

    public ArrayList<XE> getA() {
        return this.a;
    }
    public void setA(ArrayList<XE> a) {
        this.a = a;
    }
    public void Input()
    {
        System.out.println("Chon: " + '\n' + '\t' + "0. Thoat" + '\n' + '\t' + "1. Xe may" + '\n' + '\t' + "2. Xe hoi");
        int n= sc.nextInt();
        if(n==1) 
        {
            XEMAY k = new XEMAY();
            k.Input();
            a.add(k);
        }
        else if(n==2)
        {
            XEHOI k = new XEHOI();
            k.Input();
            a.add(k);
        }
        else if(n==0)
        {
            return;
        }
    }
    public void ShownProduct()
    {
        System.out.println("Ten xe" + '\t' + "Nhan hieu" + '\t' + "Gia");
        for(int i=0;i<a.size();i++)
        {
            a.get(i).Output();
        }
    }

    public void add(XEMAY k) {
    }
}
