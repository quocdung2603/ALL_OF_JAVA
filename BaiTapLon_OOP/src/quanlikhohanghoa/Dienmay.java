package quanlikhohanghoa;

public class Dienmay extends Kho {
	int Thoigianbaohanh;
	double congsuatKW;
	public Dienmay() {
		// TODO Auto-generated constructor stub
	}

	public Dienmay(String mahang, String tenhang, int soluongton, double dongia, int tgbh , double congsuatKW) {
		super(mahang, tenhang, soluongton, dongia);
		// TODO Auto-generated constructor stub
		this.Thoigianbaohanh =tgbh;
		this.congsuatKW = congsuatKW;
	}

	

	public int getThoigianbaohanh() {
		return Thoigianbaohanh;
	}

	public void setThoigianbaohanh(int thoigianbaohanh) {
		Thoigianbaohanh = thoigianbaohanh;
	}

	public double getCongsuatKW() {
		return congsuatKW;
	}

	public void setCongsuatKW(double congsuatKW) {
		this.congsuatKW = congsuatKW;
	}

	public void Input()
	{
		super.Input();
		System.out.print("Thoi gian bao hanh(Thang): "); int d = sc.nextInt();
		System.out.print("Cong suat: "); double e = sc.nextDouble();
		setThoigianbaohanh(d);
		setCongsuatKW(e);
	}
	@Override
	String MucDoBuonBan() {
		if(this.getSoluongton() < 3) return "Ban duoc";
		return "Khong danh gia" ;
	}

	@Override
	double getVAT() {

		return 0.1;
	}

	@Override
	public String toString() {
		return "Dienmay [Thoigianbaohanh=" + Thoigianbaohanh + ", congsuatKW=" + congsuatKW + ", mahang=" + mahang
				+ ", tenhang=" + tenhang + ", soluongton=" + soluongton + ", dongia=" + dongia + ", MucDoBuonBan()="
				+ MucDoBuonBan() + "]";
	}
 
	
}
