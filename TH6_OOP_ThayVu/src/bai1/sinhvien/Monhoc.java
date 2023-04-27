package bai1.sinhvien;
import java.util.*;
public class Monhoc {
	String tenmonhoc;
	int sotinhchi;
	double diemtrungbinh;
	Scanner sc = new Scanner(System.in);
	public Monhoc() {
		// TODO Auto-generated constructor stub
	}

	public Monhoc(String tenmonhoc, int sotinhchi, double diemtrungbinh) {
		super();
		this.tenmonhoc = tenmonhoc;
		this.sotinhchi = sotinhchi;
		this.diemtrungbinh = diemtrungbinh;
	}

	public String getTenmonhoc() {
		return tenmonhoc;
	}

	public void setTenmonhoc(String tenmonhoc) {
		this.tenmonhoc = tenmonhoc;
	}

	public int getSotinhchi() {
		return sotinhchi;
	}

	public void setSotinhchi(int sotinhchi) {
		this.sotinhchi = sotinhchi;
	}

	public double getDiemtrungbinh() {
		return diemtrungbinh;
	}

	public void setDiemtrungbinh(double diemtrungbinh) {
		this.diemtrungbinh = diemtrungbinh;
	}
		
	public void Input()
	{
		System.out.print("Ten mon hoc: ");	String d = sc.nextLine();
		System.out.print("So tin chi: "); int e = sc.nextInt();
		System.out.print("Diem trung binh: "); double f = sc.nextDouble();
		this.tenmonhoc = d;
		this.sotinhchi = e;
		this.diemtrungbinh = f;
	}

	@Override
	public String toString() {
		return "Monhoc [tenmonhoc=" + tenmonhoc + ", sotinhchi=" + sotinhchi + ", diemtrungbinh=" + diemtrungbinh + "]";
	}
	
}
