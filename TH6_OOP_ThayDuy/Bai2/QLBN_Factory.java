package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class QLBN_Factory {
    ArrayList<BenhNhan> a = new ArrayList<BenhNhan>();
    Scanner sc = new Scanner(System.in);

    public QLBN_Factory() {
    }

    public QLBN_Factory(ArrayList<BenhNhan> a) {
        this.a = a;
    }

    public void Shown()
    {
        System.out.println("MaBenhNhan" + '\t' + "|" + '\t' + "TenBenhNhan" + '\t' + "|" + '\t' + "Loai" + '\t' + "|" + '\t' + "VienPhi");
        for(int i=0;i<a.size();i++)
        {
            a.get(i).Output();
        }
    }
    
    public void FindAndRemove()
    {
        System.out.print("Nhap ma benh nhan can xoa: ");
        String k = sc.nextLine();
        int check=-1;
        for(int i=0;i<a.size();i++)
        {
            if(a.get(i).getMabn().equals(k)) 
            {
                check=i;
                break;
            }
        }
        if(check==-1)
        {
            System.out.println("Khong co benh nhan can tim!");
            return;
        }
        else 
        {
            a.remove(check);
        }
    }
}
