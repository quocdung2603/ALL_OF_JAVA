package bai1.sinhvien;

import java.util.ArrayList;

public class Daihoc extends SinhVien {

	public Daihoc() {
		// TODO Auto-generated constructor stub
	}

	public Daihoc(String masv, String hoten, String chuongtrinh, String khoa, ArrayList<Monhoc> mon) {
		super(masv, hoten, chuongtrinh, khoa, mon);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	double TinhDiemTrungBinh() {
		double s=0;
		for(int i=0;i<mon.size();i++)
		{
			s+= mon.get(i).getDiemtrungbinh();
		}
		s=s/mon.size()*this.TinhSoTinChi();
		return s;
	}

	@Override
	int TinhSoTinChi() {
		int s=0;
		for(int i=0;i<mon.size();i++)
			s+=mon.get(i).getSotinhchi();
		return s;
	}

	@Override
	boolean XetTotNghiep() {
		if(TinhSoTinChi() == 120) return true;
		return false;
	}

	@Override
	void XemThongTin() {
		System.out.println("Daihoc [masv=" + masv + ", hoten=" + hoten + ", chuongtrinh=" + chuongtrinh + ", khoa=" + khoa
				+ ", TinhDiemTrungBinh()=" + TinhDiemTrungBinh() + "]");

	}

}
