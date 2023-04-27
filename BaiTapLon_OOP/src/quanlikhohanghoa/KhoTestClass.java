package quanlikhohanghoa;
import java.util.*;
public class KhoTestClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Kho> b = new ArrayList<Kho>();
		Scanner sc = new Scanner(System.in);
		KhoFc a = new KhoFc(b);
		while (true) {
			System.out.println("Nhap lua chon: " + '\n' + '\t' + "1. Them Hang" + '\n' + '\t'
					+ "2. Xuat danh sach Hang"+'\n' + '\t' + "0. Thoat chuong trinh");
			System.out.print("--> ");
			int t = sc.nextInt();
			if (t == 1) {
				a.ThemHang();;
			} else if (t == 2) {
				a.XuatDanhSachHang();;
			} else if (t == 0) {
				sc.close();
				return;
			}
		}
	}

}
