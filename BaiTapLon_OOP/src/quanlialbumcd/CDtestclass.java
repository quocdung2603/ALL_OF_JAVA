package quanlialbumcd;

import java.util.*;

public class CDtestclass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<CD> b = new ArrayList<CD>();
		CDfc a = new CDfc(b);
		while (true) {
			System.out.println("Nhap lua chon: " + '\n' + '\t' + "1. Them CD"  +'\n' + '\t' + "2. Tong so luong CD"
					+'\n' + '\t' + "3. Tong gia tien CD" + '\n' + '\t' + "4. Sap xep giam dan theo gia thanh CD"
					+ '\n' + '\t' + "5. Sap xep tang dan theo tua CD" + '\n' + '\t' + "6. Xuat toan bo danh sach CD"
					+ '\n' + '\t' + "0. Thoat chuong trinh");
			System.out.print("--> ");
			int t = sc.nextInt();
			if (t == 1) {
				a.ThemCD();
			} else if (t == 2) {
				a.soluongCD();
			} else if (t == 3) {
				System.out.println("Tong gia tien CD: " + a.TongGiaThanhCD());
			} else if (t == 4) {
				a.SapXepGiamDanGiaThanhCD();
			} else if (t == 5) {
				a.SapXepTangDanTuaCD();
			} else if (t == 6) {
				a.XuatToanBo();
			} else if (t == 0) {
				sc.close();
				return;
			}
		}

	}

}
