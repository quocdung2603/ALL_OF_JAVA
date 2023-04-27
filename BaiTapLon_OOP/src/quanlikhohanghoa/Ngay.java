package quanlikhohanghoa;

import java.util.Scanner;

public class Ngay {
	int ngay, thang, nam;
	Scanner sc = new Scanner(System.in);

	public Ngay() {
		// TODO Auto-generated constructor stub
	}

	public Ngay(int ngay, int thang, int nam) {
		super();
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}

	public int getNgay() {
		return ngay;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}

	public void Input() {
		System.out.print('\t' + "Ngay: ");
		int ngay;
		do {
			ngay = sc.nextInt();
			if (ngay < 1 || ngay > 31) {
				System.out.println("Nhap lai!");
			}
		} while (ngay < 1 || ngay > 31);
		System.out.print('\t' + "Thang: ");
		int thang;
		do {
			thang = sc.nextInt();
			if (thang < 1 || thang > 12) {
				System.out.println("Nhap lai!");
			}
		} while (thang < 1 || thang > 12);
		System.out.print('\t' + "Nam: ");
		int nam;
		do {
			nam = sc.nextInt();
			if (nam < 0) {
				System.out.println("Nhap lai!");
			}
		} while (nam < 0);
		setNgay(ngay);
		setThang(thang);
		setNam(nam);
	}

	public int KiemTraNgayTruocSau(Ngay b)
	{
		int tmp1 = this.ngay + this.thang*31 + this.nam*365;
		int tmp2 = b.ngay + b.thang*31 + b.nam*365;
		return tmp1-tmp2;
	}
	@Override
	public String toString() {
		return "Ngay [ngay=" + ngay + ", thang=" + thang + ", nam=" + nam + "]";
	}

}
