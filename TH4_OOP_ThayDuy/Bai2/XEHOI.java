package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

// import org.xml.sax.SAXException;

public class XEHOI extends XE {
    ArrayList<PHUKIEN> pk = new ArrayList<PHUKIEN>();   
    Scanner sc = new Scanner(System.in);
    public XEHOI() {
    }

    public XEHOI(String name , String nhanhieu , int giagoc,ArrayList<PHUKIEN> pk) {
        super(name, nhanhieu, giagoc);
        this.pk = pk;
    }

    public ArrayList<PHUKIEN> getPk() {
        return this.pk;
    }

    public void setPk(ArrayList<PHUKIEN> pk) {
        this.pk = pk;
    }
    public void Input()
    {
        super.Input();
        System.out.print("So phu kien: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
           PHUKIEN a = new PHUKIEN();
           a.Input();
           pk.add(a);
        }
    }
    @Override
    double Tinhgiaban() {
        double s=0;
        int giaPhukien=0;
        for(int i =0 ;i < pk.size(); i++)
        {
            giaPhukien += pk.get(i).gia;
        }
        s = this.getGiagoc() + giaPhukien;
        return s;
    }
}
