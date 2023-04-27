package quanlisinhvien;
import java.util.*;
public class QlVienTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Person> b = new ArrayList<Person>();
		qlviennghiencuu_fc a = new qlviennghiencuu_fc(b);
		while (true) {
			System.out.println("Nhap lua chon: " + '\n' + '\t' + "1. Them Nguoi" + '\n' + '\t'
					+ "2. Xoa nguoi" + '\n' + '\t' + "3. Sap xep danh sach theo ho ten"
					+ '\n' + '\t' + "4. Xuat danh sach" 
					+'\n' + '\t' + "0. Thoat chuong trinh");
			System.out.print("--> ");
			int t = sc.nextInt();
			if (t == 1) {
				a.ThemNguoi();
			} else if (t == 2) {
				a.XoaNguoi();
			} else if (t == 3) {
				a.SapXepHoTenAlphaB();;
			} else if (t == 4) {
				a.XuatDanhSach();
			} else if (t == 0) {
				sc.close();
				return;
			}
		}
	}

}
