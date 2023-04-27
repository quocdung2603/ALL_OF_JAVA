package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class QLBenhNhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<BenhNhan> b = new ArrayList<BenhNhan>();
        QLBN_Factory a = new QLBN_Factory(b);
        while (true) {
            System.out.println("Nhap lua chon: " + '\n' + '\t' + "1. Them benh nhan ngoai tru" + '\n' + '\t'
                    + "2. Them benh nhan noi tru" + '\n' + '\t' + "3. In danh sach benh nhan" + '\n' + '\t'
                    + "4. Tim thong tin & xoa benh nhan" + '\n' + '\t' + "0. Thoat chuong trinh");
            System.out.print("--> ");
            int type = sc.nextInt();
            if (type == 1) {
                NgoaiTru k = new NgoaiTru();
                k.Input();
                a.a.add(k);
            } else if (type == 2) {
                NoiTru k = new NoiTru();
                k.Input();
                a.a.add(k);
            } else if (type == 3) {
                a.Shown();
            } else if (type == 4) {
                a.FindAndRemove();
            } else if (type == 0) {
                break;
            }
        }
        sc.close();
    }
}
