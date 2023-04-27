package quanligiaodich;

public class GdVang extends GiaoDich {
	String loaivang;
	public GdVang() {
		
	}

	public GdVang(String magd, Ngay ngaygd, double dongia, int soluong, String loaivang) {
		super(magd, ngaygd, dongia, soluong);
		this.loaivang = loaivang;
	}
	
	public String getLoaivang() {
		return loaivang;
	}

	public void setLoaivang(String loaivang) {
		this.loaivang = loaivang;
	}
	
	public void Input()
	{
		super.Input();
		sc.nextLine();
		System.out.print("loai vang: "); String f = sc.nextLine();
		setLoaivang(f);
		
	}
	
	public double ThanhTien() {
		return this.getSoluong() * this.getDongia();
	}

	@Override
	public String toString() {
		return "GdVang [loaivang=" + loaivang + ", magd=" + magd + ", ngaygd=" + ngaygd + ", dongia=" + dongia
				+ ", soluong=" + soluong + ", ThanhTien=" + ThanhTien() + "]";
	}
 
	
	
	
}
