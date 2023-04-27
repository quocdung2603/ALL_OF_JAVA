package quanliphonghoc;

public class LyThuyet extends PHONG {
	String maychieu;
	public LyThuyet() {
		
	}

	public LyThuyet(String maphong, String daynha, double dientich, int sobongden, String maychieu) {
		super(maphong, daynha, dientich, sobongden);
		this.maychieu = maychieu;
	}

	public String getMaychieu() {
		return maychieu;
	}

	public void setMaychieu(String maychieu) {
		this.maychieu = maychieu;
	}
	
	public void Input()
	{
		super.Input();
		sc.nextLine();
		System.out.print("May chieu(co/khong): "); String e = sc.nextLine()	;
		setMaychieu(e);
	}

	

	@Override
	public String PhongHocDatChuan() {
		double check = this.getDientich() /  this.getSobongden();
		if(check == 10 && this.getMaychieu().toLowerCase().compareTo("co")==0) return "Dat";
		return "Chua dat";
	}

	@Override
	public String toString() {
		return "LyThuyet [maychieu=" + maychieu + ", maphong=" + maphong + ", daynha=" + daynha + ", dientich="
				+ dientich + ", sobongden=" + sobongden + ", PhongHocDatChuan()=" + PhongHocDatChuan() + "]";
	}
	
	
}
