package quanligiaodich;

import java.util.*;

public class TestGiaodich {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<GiaoDich> b = new ArrayList<GiaoDich>();
		GiaodichFactory a = new GiaodichFactory(b);
		while (true) {
			System.out.println("Nhap lua chon cua ban:" + '\n' + '\t' + "1. Them giao dich" + '\n' + '\t'
					+ "2. Xuat danh sach giao dich" + '\n' + '\t' + "3. Tinh tong so luong giao dich cho tung loai"
					+ '\n' + '\t' + "4. Trung binh thanh tien cho giao dich tien te" + '\n' + '\t'
					+ "5. Xuat ra giao dich co don gia > 1 ty" + '\n' + '\t' + "0. Thoat chuong trinh");
			System.out.print("--> ");
			int t = sc.nextInt();
			if(t==1)
			{
				a.ThemGiaoDich();
			}
			else if(t==2)
			{
				a.XuatDanhSachGiaoDich();
			}
			else if(t==3)
			{
				a.TongSoLuongTungLoai();
			}
			else if(t==4)
			{
				a.TrungBinhThanhTienGdTienTe();
			}
			else if(t==5)
			{
				a.XuatGdDonGiaTren1B();
			}
			else if(t==0)
			{
				sc.close();
				return;
			}
		}
	}
}
