package Baitap2_Sinhvien;

import java.util.*;

public class Sinhvien {
    private static int quantity = 0;
    private String masv;
    private String tensv;
    private double diemtb;

    public Sinhvien() {
        setmasv("");
        settensv("");
        setdiemtb(0);
        quantity++;
    }

    public Sinhvien(String newmasv, String newtensv, double newdiemtb) {
        setmasv(newmasv);
        settensv(newtensv);
        setdiemtb(newdiemtb);
        quantity++;
    }

    public static int getquantity() {
        return quantity;
    }

    public String getmasv() {
        return masv;
    }

    public String gettensv() {
        return tensv;
    }

    public double getdiemtb() {
        return diemtb;
    }

    public void setmasv(String newmasv) {
        masv = newmasv;
    }

    public void settensv(String newtensv) {
        tensv = newtensv;
    }

    public void setdiemtb(double newdiemtb) {
        diemtb = newdiemtb;
    }
    
    public void Nhapthongtin() {
        Scanner sc = new Scanner(System.in);
        String nmasv = new String(), ntensv = new String();
        double ndiemtb;
        System.out.println("Ma sinh vien: ");
        nmasv = sc.nextLine();
        System.out.println("Ten sinh vien: ");
        ntensv = sc.nextLine();
        System.out.println("Diem sinh vien: ");
        ndiemtb = sc.nextDouble();
        this.masv = nmasv;
        this.tensv = ntensv;
        this.diemtb = ndiemtb;
    }
    public String toString()
    {
        return "SinhVien [maSinhVien=" + getmasv() + ", hoVaTen=" + gettensv() + ", diemTrungBinh=" + getdiemtb() + "]";
    }

    public boolean equals (Object obj)
    {
        if(obj instanceof Sinhvien)
        {
            Sinhvien sv1 = (Sinhvien) obj;
            return this.getdiemtb()==(sv1.getdiemtb());
        }
        else return false;
    }
    public void Kiemtradtb(ArrayList <Sinhvien> dssv)
    {
        int b[] = new int[dssv.size()];
        boolean check=false;
        for(int i=0;i<dssv.size();i++)
        {
            if(b[i]==0)
            {
                int kt=0;
                for(int j=i+1;j<dssv.size();j++)
                {
                    if(dssv.get(i).diemtb == dssv.get(j).diemtb && b[j]==0)
                    {
                        System.out.println(dssv.get(j));
                        b[j]=1;
                        kt++;
                        check=true;
                    }
                }
                if(kt!=0)
                {
                    System.out.println(dssv.get(i));
                }
            }
        }
        if(check==false) System.out.println("Khong co sinh vien phu hop.");
    }
}
