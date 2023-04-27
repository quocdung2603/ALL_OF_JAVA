package quanlihoadontiendien;

public class KhachVN extends Tiendien {
	String doituongkh;
	double dinhmuc;
	public KhachVN() {
		// TODO Auto-generated constructor stub
	}

	public KhachVN(String makh, String hoten, Ngay ngayrahdl, double soluongkw, double dongia, String doituongkh, double dinhmuc) {
		super(makh, hoten, ngayrahdl, soluongkw, dongia);
		this.doituongkh = doituongkh;
		this.dinhmuc = dinhmuc;
	}
	
	
	public String getDoituongkh() {
		return doituongkh;
	}

	public void setDoituongkh(String doituongkh) {
		this.doituongkh = doituongkh;
	}

	public double getDinhmuc() {
		return dinhmuc;
	}

	public void setDinhmuc(double dinhmuc) {
		this.dinhmuc = dinhmuc;
	}
	
	public void Input()
	{
		super.Input();
		sc.nextLine();
		System.out.print("Doi tuong khach hang(sinh hoat, san xuat, kinh doanh):"); String f = sc.nextLine();
		System.out.print("Dinh muc: "); double g = sc.nextDouble();
		this.doituongkh = f;
		this.dinhmuc = g;
	}
	
	@Override
	double Thanhtien() {
		if(this.getSoluongkw() <= this.getDinhmuc()) return this.getSoluongkw() * this.getDongia();
		return this.getSoluongkw() * this.getDongia()* this.getDinhmuc() + Math.abs(this.getDinhmuc()-this.getSoluongkw())*this.getDongia()*2.5;
	}

	@Override
	public String toString() {
		return "KhachVN [doituongkh=" + doituongkh + ", dinhmuc=" + dinhmuc + ", makh=" + makh + ", hoten=" + hoten
				+ ", ngayrahdl=" + ngayrahdl + ", soluongkw=" + soluongkw + ", dongia=" + dongia + "]";
	}
	
}
