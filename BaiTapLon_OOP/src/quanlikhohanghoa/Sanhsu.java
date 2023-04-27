package quanlikhohanghoa;

public class Sanhsu extends Kho {
	String nhasanxuat;
	Ngay ngaynhapkho;
	public Sanhsu() {
		// TODO Auto-generated constructor stub
	}

	public Sanhsu(String mahang, String tenhang, int soluongton, double dongia,String nhasanxuat, Ngay ngaynhapkho) {
		super(mahang, tenhang, soluongton, dongia);
		// TODO Auto-generated constructor stub
		this.nhasanxuat = nhasanxuat;
		this.ngaynhapkho = ngaynhapkho;
	}
	
	public String getNhasanxuat() {
		return nhasanxuat;
	}

	public void setNhasanxuat(String nhasanxuat) {
		this.nhasanxuat = nhasanxuat;
	}

	public Ngay getNgaynhapkho() {
		return ngaynhapkho;
	}

	public void setNgaynhapkho(Ngay ngaynhapkho) {
		this.ngaynhapkho = ngaynhapkho;
	}

	public void Input()
	{
		super.Input();
		sc.nextLine();
		System.out.print("Nha san xuat:	"); String d  = sc.nextLine();
		System.out.println("Ngay nhap kho:	"); Ngay e = new Ngay(); e.Input();
		setNhasanxuat(d);
		setNgaynhapkho(e);
	}
	@Override
	String MucDoBuonBan() {
		Ngay check = new Ngay(18,4,2023);
		if(this.getSoluongton() > 50 && check.KiemTraNgayTruocSau(this.getNgaynhapkho()) > 10)
			return "Ban cham";
		return "Khong danh gia";
	}

	@Override
	double getVAT() {
		// TODO Auto-generated method stub
		return 0.1;
	}

	@Override
	public String toString() {
		return "Sanhsu [nhasanxuat=" + nhasanxuat + ", ngaynhapkho=" + ngaynhapkho + ", mahang=" + mahang + ", tenhang="
				+ tenhang + ", soluongton=" + soluongton + ", dongia=" + dongia + ", MucDoBuonBan()=" + MucDoBuonBan()
				+ "]";
	}
	
	
}
