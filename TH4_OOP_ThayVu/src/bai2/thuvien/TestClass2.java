package bai2.thuvien;
import java.util.*;
public class TestClass2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<CThuVien> b = new ArrayList<CThuVien>();
		CTThuvien_fc a = new CTThuvien_fc(b);
		while (true) {
			System.out.println("Nhap lua chon cua ban" + '\n' + '\t' + "1. Nhap" + '\n' + '\t' + "2. Xuat" + '\n' + '\t'
					+ "3. Tinh tong" + '\n' + '\t' + "0. Thoat chuong trinh");
			System.out.print("--> ");
			int type = sc.nextInt();
			if (type == 1) {
				a.InsertMember();
			} else if (type == 2) {
				a.ShowList();
			} else if (type == 3) {
				System.out.println("Tong tien la: " + a.Total());
			} else if (type == 0) {
				sc.close();
				return;
			}
		}
	}

}
