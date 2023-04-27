package quanlisach;

import java.util.*;

public abstract class Sach {
	protected String masach, nhaxuatban;
	protected Ngay ngaynhap;
	protected double dongia;
	protected int soluong;

	public abstract double Thanhtien();

	Scanner sc = new Scanner(System.in);

	public Sach() {
		// TODO Auto-generated constructor stub
	}

	public Sach(String masach, String nhaxuatban, Ngay ngaynhap, double dongia, int soluong) {
		this.masach = masach;
		this.nhaxuatban = nhaxuatban;
		this.ngaynhap = ngaynhap;
		this.dongia = dongia;
		this.soluong = soluong;
	}

	public String getMasach() {
		return masach;
	}

	public void setMasach(String masach) {
		this.masach = masach;
	}

	public String getNhaxuatban() {
		return nhaxuatban;
	}

	public void setNhaxuatban(String nhaxuatban) {
		this.nhaxuatban = nhaxuatban;
	}

	public Ngay getNgaynhap() {
		return ngaynhap;
	}

	public void setNgaynhap(Ngay ngaynhap) {
		this.ngaynhap = ngaynhap;
	}

	public double getDongia() {
		return dongia;
	}

	public void setDongia(double dongia) {
		this.dongia = dongia;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public void Input() {
		System.out.print("Ma sach: ");
		String a = sc.nextLine();
		System.out.println("Ngay nhap: ");
		Ngay b = new Ngay();
		b.Input();
		System.out.print("Don gia: ");
		double c = sc.nextDouble();
		System.out.print("So luong: ");
		int d = sc.nextInt();
		sc.nextLine();
		System.out.print("Nha xuat ban: ");
		String e = sc.nextLine();
		setMasach(a);
		setNgaynhap(b);
		setDongia(c);
		setSoluong(d);
		setNhaxuatban(e);
	}
}
