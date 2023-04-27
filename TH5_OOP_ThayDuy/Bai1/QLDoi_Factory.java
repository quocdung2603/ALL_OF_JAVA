package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class QLDoi_Factory {
    private ArrayList<Nhanvien> a = new ArrayList<Nhanvien>();
    Scanner sc= new Scanner(System.in);

    public QLDoi_Factory() {
    }

    public QLDoi_Factory(ArrayList<Nhanvien> a) {
        this.a = a;
    }
    public void Input()
    {
        int type;
        do {
            System.out.println('\t' + "Nhap lua chon: " + "1. Quan ly truong" + "| 2. Nhan vien Testing" + "| 3. Lap trinh vien");
            System.out.print('\t'+ "--> ");
            type = sc.nextInt();
            if(type!=1 && type!=2 && type!=3)
            {
                System.out.println('\t' + "Nhap lai! " + "1. Quan ly truong" + "| 2. Nhan vien Testing" + "| 3. Lap trinh vien");
                System.out.print('\t'+ "--> ");
            }
            else if(type==1)
            {
                QLTruong k = new QLTruong();
                k.Input();
                a.add(k);
            }
            else if(type == 2)
            {
                NvTesting k = new NvTesting();
                k.Input();
                a.add(k);
            }
            else if(type==3)
            {
                NvLapTrinh k = new NvLapTrinh();
                k.Input();
                a.add(k);
            }
        } while (type!=1 && type!=2 && type!=3);
    }

    public void Output()
    {
        for(int i=0;i<a.size();i++)
        {
            a.get(i).Output();
            System.out.println(" ");
        }
    }

    public void Find()
    {
        System.out.print("Nhap Id can tim: ");
        int ids = sc.nextInt();
        int k = -1;
        for (int i = 0; i < a.size(); i++) {
            if (ids == a.get(i).getManv()) {
                k = i;
                break;
            }
        }
        if (k == -1)
            System.out.println("Khong tim thay nhan vien");
        else
            a.get(k).Output();
    }
}
