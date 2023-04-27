package Bai1;

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
