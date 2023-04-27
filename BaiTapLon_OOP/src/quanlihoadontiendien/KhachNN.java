package quanlihoadontiendien;

public class KhachNN extends Tiendien {
	String quoctich;
	public KhachNN() {
		// TODO Auto-generated constructor stub
	}

	public KhachNN(String makh, String hoten, Ngay ngayrahdl, double soluongkw, double dongia ,String quoctich) {
		super(makh, hoten, ngayrahdl, soluongkw, dongia);
		this.quoctich = quoctich;
	}
	
	
	public String getQuoctich() {
		return quoctich;
	}

	public void setQuoctich(String quoctich) {
		this.quoctich = quoctich;
	}
	
	public void Input()
	{
		super.Input();
		sc.nextLine();
		System.out.print("Quoc tich: "); String f = sc.nextLine();
		this.quoctich = f;
	}
	@Override
	double Thanhtien() {
		// TODO Auto-generated method stub
		return this.getSoluongkw()*this.getDongia();
	}

	@Override
	public String toString() {
		return "KhachNN [quoctich=" + quoctich + ", makh=" + makh + ", hoten=" + hoten + ", ngayrahdl=" + ngayrahdl
				+ ", soluongkw=" + soluongkw + ", dongia=" + dongia + "]";
	}
	
	
}
