package quanligiaodich;

public class GdNgoaiTe extends GiaoDich {
	double tigia;
	String loaitien;
	public GdNgoaiTe() {
		// TODO Auto-generated constructor stub
	}
	
	public GdNgoaiTe(String magd, Ngay ngaygd, double dongia, int soluong, double tigia , String loaitien) {
		super(magd, ngaygd, dongia, soluong);
		this.tigia = tigia;
		this.loaitien = loaitien;
	}

	public double getTigia() {
		return tigia;
	}

	public void setTigia(double tigia) {
		this.tigia = tigia;
	}

	public String getLoaitien() {
		return loaitien;
	}

	public void setLoaitien(String loaitien) {
		this.loaitien = loaitien;
	}
	
	public void Input()
	{
		super.Input();
		System.out.print("Ti gia: "); double f = sc.nextDouble();
		sc.nextLine();
		System.out.print("Loai tien: "); String g = sc.nextLine();
		this.tigia = f;
		this.loaitien = g;
	}
	
	@Override
	public double ThanhTien() {
		if(this.getLoaitien()=="VN")
			return this.getSoluong() * this.getDongia();
		return this.getSoluong() * this.getDongia() * this.getTigia();
	}

	@Override
	public String toString() {
		return "GdNgoaiTe [tigia=" + tigia + ", loaitien=" + loaitien + ", magd=" + magd + ", ngaygd=" + ngaygd
				+ ", dongia=" + dongia + ", soluong=" + soluong + ", ThanhTien=" + ThanhTien() + "]";
	}
	
	

}
