package quanlihoadontiendien;

import java.util.*;

public class TiendienTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Tiendien> b = new ArrayList<Tiendien>();
		TienDienfc a = new TienDienfc(b);
		while (true) {
			System.out.println("Nhap lua chon: " + '\n' + '\t' + "1. Them Hoa Don" + '\n' + '\t'
					+ "2. Xuat danh sach Hoa Don" + '\n' + '\t' + "3. Tinh tong so luong tung loai hoa don khach hang"
					+ '\n' + '\t' + "4. Tinh trung binh thanh tien cho nguoi nuoc ngoai" + '\n' + '\t'
					+ "5. Xuat hoa don thang 9 nam 2013"  +'\n' + '\t' + "0. Thoat chuong trinh");
			System.out.print("--> ");
			int t = sc.nextInt();
			if (t == 1) {
				a.ThemHoaDon();
			} else if (t == 2) {
				a.XuatDanhSachHoaDon();
			} else if (t == 3) {
				a.TongSoLuongTungLoaiKhachHang();
			} else if (t == 4) {
				a.TongTrungBinhThanhTienKhachNN();
			} else if (t == 5) {
				a.XuatHoaDonThang9Nam2013();
			} else if (t == 0) {
				sc.close();
				return;
			}
		}
	}
}
