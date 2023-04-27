package QLNV;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class NHANVIEN {
	protected String manv,hoten;
	protected ArrayList<BANGCAP> certificates;
	abstract double Tinhluong();
	abstract void xemthongtin();
	Scanner sc = new Scanner(System.in);
	public NHANVIEN() {}
	public NHANVIEN(String manv, String hoten , ArrayList<BANGCAP> certificates) {
		this.manv = manv;
		this.hoten = hoten;
		this.certificates = certificates;
	}

	public String getManv() {
		return this.manv;
	}

	public void setManv(String manv) {
		this.manv = manv;
	}

	public String getHoten() {
		return this.hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public ArrayList<BANGCAP> getCertificates() {
		return this.certificates;
	}

	public void setCertificates(ArrayList<BANGCAP> certificates) {
		this.certificates = certificates;
	}
	public void Input()
	{
		System.out.print("Ma nhan vien: "); String a= sc.nextLine();
		System.out.print("Ho&Ten nhan vien: "); String b= sc.nextLine();
		System.out.print("So luong bang cap: "); int n = sc.nextInt();
		ArrayList<BANGCAP> bang = new ArrayList<BANGCAP>();
		for(int i=0;i<n;i++)
		{
			BANGCAP k = new BANGCAP();
			k.Input();
			bang.add(k);
		}
		this.manv =a;
		this.hoten = b;
		this.certificates = bang;
	}
	
}
