package bai1.sinhvien;
import java.util.*;
public abstract class SinhVien {
	protected String masv,hoten,chuongtrinh,khoa;
	protected ArrayList<Monhoc> mon;
	Scanner sc = new Scanner(System.in);
	abstract double TinhDiemTrungBinh();
	abstract int TinhSoTinChi();
	abstract boolean XetTotNghiep();
	abstract void XemThongTin();
	
	public SinhVien() {
		// TODO Auto-generated constructor stub
	}
	public SinhVien(String masv, String hoten, String chuongtrinh, String khoa , ArrayList<Monhoc> mon) {
		super();
		this.masv = masv;
		this.hoten = hoten;
		this.chuongtrinh = chuongtrinh;
		this.khoa = khoa;
		this.mon = mon;
	}
	public String getMasv() {
		return masv;
	}
	public void setMasv(String masv) {
		this.masv = masv;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getChuongtrinh() {
		return chuongtrinh;
	}
	public void setChuongtrinh(String chuongtrinh) {
		this.chuongtrinh = chuongtrinh;
	}
	public String getKhoa() {
		return khoa;
	}
	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}
	
	public ArrayList<Monhoc> getMon() {
		return mon;
	}
	public void setMon(ArrayList<Monhoc> mon) {
		this.mon = mon;
	}
	public void Input()
	{
		System.out.print("Ho ten: "); String a = sc.nextLine();
		System.out.print("Mssv: "); String b = sc.nextLine();
		System.out.print("Chuong trinh: "); String c = sc.nextLine();
		System.out.print("Khoa: "); String d = sc.nextLine();
		System.out.print("So mon hoc: "); int n = sc.nextInt();
		sc.nextLine();
		ArrayList<Monhoc> e = new ArrayList<Monhoc>();
		for(int i=0;i<n;i++)
		{
			Monhoc k = new Monhoc();
			k.Input();
			e.add(k);
		}
		this.hoten = a;
		this.masv = b;
		this.chuongtrinh = c;
		this.khoa = d;
		this.mon = e;
	}
}
