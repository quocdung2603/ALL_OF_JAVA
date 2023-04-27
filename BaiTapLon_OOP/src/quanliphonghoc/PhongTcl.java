package quanliphonghoc;

import java.util.*;

public class PhongTcl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<PHONG> b = new ArrayList<PHONG>();
		PhongFc a = new PhongFc(b);
		while (true) {
			System.out.println("Nhap lua chon: " + '\n' + '\t' + "1. Them Phong" + '\n' + '\t'
					+ "2. Tim kiem phong bang ma phong" + '\n' + '\t' + "3. Xuat toan bo danh sach phong" + '\n' + '\t'
					+ "4. Xuat cac phong hoc dat chuan" + '\n' + '\t' + "5. Sap xep danh sach phong tang theo day nha"
					+ '\n' + '\t' + "6. Sap xep danh sach phong giam theo dien tich" + '\n' + '\t'
					+ "7. Sap xep danh sach phong tang theo so bong den" + '\n' + '\t'
					+ "8. Cap nhat so may tinh cua mot phong may" + '\n' + '\t' + "9. Xoa phong" + '\n' + '\t'
					+ "10. Tinh tong so phong hoc" + '\n' + '\t' + "11. Xuat danh sach cac phong may co 60 may" + '\n'
					+ '\t' + "0. Thoat chuong trinh");
			System.out.print("--> ");
			int t = sc.nextInt();
			if (t == 1) {
				a.ThemPhong();
			} else if (t == 2) {
				a.TimKiemPhongBangMaPhong();
			} else if (t == 3) {
				a.XuatDanhSachCacPhong();
			} else if (t == 4) {
				a.XuatDanhSachCacPhongDatChuan();
			} else if (t == 5) {
				a.SapXepDanhSachTheoDayPhong();
			} else if (t == 6) {
				a.SapXepDanhSachTheoDienTich();
			} else if (t == 7) {
				a.SapXepDanhSachTheoSoBongDen();
			} else if (t == 8) {
				a.CapNhatSoMayTinh();
			} else if (t == 9) {
				a.XoaPhong();
			} else if (t == 10) {
				a.TongSoPhongHoc();
			} else if (t == 11) {
				a.XuatDanhSachPhong60May();
			} else if (t == 0) {
				sc.close();
				return;
			}
		}

	}

}
