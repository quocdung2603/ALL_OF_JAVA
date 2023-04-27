package quanlisach;

public class SachThamKhao extends Sach {
	double thue;
	public SachThamKhao() {
		// TODO Auto-generated constructor stub
	}

	public SachThamKhao(String masach, String nhaxuatban, Ngay ngaynhap, double dongia, int soluong,double thue) {
		super(masach, nhaxuatban, ngaynhap, dongia, soluong);
		// TODO Auto-generated constructor stub
		this.thue=thue;
	}
	
	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}
	
	public void Input()
	{
		super.Input();
		System.out.print("Thue: "); double f = sc.nextDouble();
		this.thue = f;
	}
	@Override
	public double Thanhtien() {
		return this.getDongia() *this.getSoluong() + this.getThue();
	}

	@Override
	public String toString() {
		return "SachThamKhao [thue=" + thue + ", masach=" + masach + ", nhaxuatban=" + nhaxuatban + ", ngaynhap="
				+ ngaynhap + ", dongia=" + dongia + ", soluong=" + soluong + ", Thanhtien=" + Thanhtien() + "]";
	}
	
	
}
