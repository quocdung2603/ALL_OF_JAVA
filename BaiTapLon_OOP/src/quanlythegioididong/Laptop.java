package quanlythegioididong;

public class Laptop extends Product {
	int sothangbaohanh;
	public Laptop() {
		// TODO Auto-generated constructor stub
	}

	public Laptop(int masp, String tensp, double giagoc, int sothangbaohanh) {
		super(masp, tensp, giagoc);
		// TODO Auto-generated constructor stub
		this.sothangbaohanh = sothangbaohanh;
	}
	
	
	public int getSothangbaohanh() {
		return sothangbaohanh;
	}

	public void setSothangbaohanh(int sothangbaohanh) {
		this.sothangbaohanh = sothangbaohanh;
	}
	
	public void Input()
	{
		super.Input();
		System.out.print("So thang bao hanh: "); int d = sc.nextInt();
		setSothangbaohanh(d);
	}

	@Override
	double Tinhgiaban() {
		// TODO Auto-generated method stub
		return this.getGiagoc() + this.getSothangbaohanh()*100000;
	}

	@Override
	public String toString() {
		return "Laptop [sothangbaohanh=" + sothangbaohanh + ", masp=" + masp + ", tensp=" + tensp + ", giagoc=" + giagoc
				+ ", Gia ban=" + Tinhgiaban() + "]";
	}
	
	

}
