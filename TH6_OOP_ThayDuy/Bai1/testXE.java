package Bai1;

import java.util.*;

public class testXE {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        ArrayList<XE> ds = new ArrayList<XE>();
        XE_Factory a = new XE_Factory(ds);
        while (true) {
            
            System.out.println("Moi nhap lua chon:"+'\n'+'\t'+ "0. Thoat chuong trinh" + '\n' + '\t' + "1. Them xe may" + '\n' + '\t' + "2. Them xe hoi"
                    + '\n' + '\t' + "3. In danh sach");
            System.out.print("-->");
            int type = sc.nextInt();
            if (type == 1) {
                XEMAY k = new XEMAY();
                k.Input();
                a.a.add(k);
            } else if (type == 2) {
                XEHOI k = new XEHOI();
                k.Input();
                a.a.add(k);
            } else if (type == 3) {
                a.ShownProduct();
            } else if (type == 0) {
                break;
            }
        }
        sc.close();
    }
}
