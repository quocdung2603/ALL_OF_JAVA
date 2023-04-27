package quanlikhohanghoa;

public class Thucpham extends Kho {
	Ngay ngaysanxuat , ngayhethan;
	String nhacungcap;
	public Thucpham() {
		// TODO Auto-generated constructor stub
	}

	public Thucpham(String mahang, String tenhang, int soluongton, double dongia , Ngay ngaysanxuat, Ngay ngayhethan, String nhacungcap) {
		super(mahang, tenhang, soluongton, dongia);
		// TODO Auto-generated constructor stub
		this.ngaysanxuat = ngaysanxuat;
		this.ngayhethan = ngayhethan;
		this.nhacungcap = nhacungcap;
	}
	
	
	public Ngay getNgaysanxuat() {
		return ngaysanxuat;
	}

	public void setNgaysanxuat(Ngay ngaysanxuat) {
		this.ngaysanxuat = ngaysanxuat;
	}

	public Ngay getNgayhethan() {
		return ngayhethan;
	}

	public void setNgayhethan(Ngay ngayhethan) {
		this.ngayhethan = ngayhethan;
	}

	public String getNhacungcap() {
		return nhacungcap;
	}

	public void setNhacungcap(String nhacungcap) {
		this.nhacungcap = nhacungcap;
	}

	public void Input()
	{
		super.Input();
		System.out.println("Ngay san xuat: "); Ngay d = new Ngay(); d.Input();
		System.out.println("Ngay het han: "); Ngay e = new Ngay();
		do
		{
			e.Input();
			if(e.KiemTraNgayTruocSau(d) < 0)
			{
				System.out.println("Nhap lai!");
			}
		}while(e.KiemTraNgayTruocSau(d) < 0);
		sc.nextLine();
		System.out.print("Nha cung cap: "); String f = sc.nextLine();
		setNgaysanxuat(d);
		setNgayhethan(e);
		setNhacungcap(f);
	}
	@Override
	String MucDoBuonBan() {
		Ngay check = new Ngay(18, 4, 2023);
		if(this.getSoluongton() > 0 && this.getNgayhethan().KiemTraNgayTruocSau(check) < 0)
			return "Ban cham";
		return "Khong danh gia";
	}

	@Override
	double getVAT() {
		return 0.05;
	}

	@Override
	public String toString() {
		return "Thucpham [ngaysanxuat=" + ngaysanxuat + ", ngayhethan=" + ngayhethan + ", nhacungcap=" + nhacungcap
				+ ", mahang=" + mahang + ", tenhang=" + tenhang + ", soluongton=" + soluongton + ", dongia=" + dongia
				+ ", MucDoBuonBan()=" + MucDoBuonBan() + "]";
	}

	
}
