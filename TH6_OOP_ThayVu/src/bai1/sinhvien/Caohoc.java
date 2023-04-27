package bai1.sinhvien;

import java.util.ArrayList;

public class Caohoc extends SinhVien {
	int namtotnghiep;

	public Caohoc() {
		// TODO Auto-generated constructor stub
	}

	public Caohoc(String masv, String hoten, String chuongtrinh, String khoa, ArrayList<Monhoc> mon, int namtotnghiep) {
		super(masv, hoten, chuongtrinh, khoa, mon);
		this.namtotnghiep = namtotnghiep;
	}
	
	public int getNamtotnghiep() {
		return namtotnghiep;
	}

	public void setNamtotnghiep(int namtotnghiep) {
		this.namtotnghiep = namtotnghiep;
	}

	@Override
	double TinhDiemTrungBinh() {
		double s=0;
		for(int i=0;i<mon.size();i++)
		{
			s+= mon.get(i).getDiemtrungbinh();
		}
		return s;
	}

	@Override
	int TinhSoTinChi() {
		int s = 0;
		for (int i = 0; i < mon.size(); i++)
			s += mon.get(i).getSotinhchi();
		s/=mon.size();
		return s;
	}

	@Override
	boolean XetTotNghiep() {
		if(TinhSoTinChi() == 50) return true;
		return false;
	}

	@Override
	void XemThongTin() {
		System.out.println("Caohoc [masv=" + masv + ", hoten=" + hoten + ", chuongtrinh="
				+ chuongtrinh + ", khoa=" + khoa + ", TinhDiemTrungBinh()=" + TinhDiemTrungBinh()
				+ "]");
	}
	
	public void Input()
	{
		super.Input();
		int k;
		do
		{
			System.out.print("Nam tot nghiep dai hoc: "); k = sc.nextInt();
			if(2023-k < 2)
			{
				System.out.print("Nhap lai: ");
			}
			this.namtotnghiep =k;
		}while(2023- k <2);
	}
	
}
