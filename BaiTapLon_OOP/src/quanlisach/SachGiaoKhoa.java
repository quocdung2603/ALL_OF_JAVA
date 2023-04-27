package quanlisach;

public class SachGiaoKhoa extends Sach {
	String tinhtrang;
	public SachGiaoKhoa() {
		// TODO Auto-generated constructor stub
	}

	public SachGiaoKhoa(String masach, String nhaxuatban, Ngay ngaynhap, double dongia, int soluong, String tinhtrang) {
		super(masach, nhaxuatban, ngaynhap, dongia, soluong);
		// TODO Auto-generated constructor stub
		this.tinhtrang = tinhtrang;
	}
	
	public String getTinhtrang() {
		return tinhtrang;
	}

	public void setTinhtrang(String tinhtrang) {
		this.tinhtrang = tinhtrang;
	}

	public void Input()
	{
		super.Input();
		System.out.print("Tinh trang: "); String f = sc.nextLine();
		this.tinhtrang = f;
	}
	@Override
	public double Thanhtien() {
		if(this.getTinhtrang()=="moi") return this.getSoluong() * this.getDongia();
		return this.getSoluong() * this.getDongia() * 0.5;
	}

	@Override
	public String toString() {
		return "SachGiaoKhoa [tinhtrang=" + tinhtrang + ", masach=" + masach + ", nhaxuatban=" + nhaxuatban
				+ ", ngaynhap=" + ngaynhap + ", dongia=" + dongia + ", soluong=" + soluong + ", Thanhtien="
				+ Thanhtien() + "]";
	}
	
	
}
