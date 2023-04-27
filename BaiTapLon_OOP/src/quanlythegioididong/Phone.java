package quanlythegioididong;

public class Phone extends Product {

	public Phone() {
		// TODO Auto-generated constructor stub
	}
	
	public Phone(int masp , String tensp, double giagoc)
	{
		super(masp, tensp,giagoc);
	}
	
	public void Input()
	{
		super.Input();
	}
	@Override
	double Tinhgiaban() {
		// TODO Auto-generated method stub
		return this.getGiagoc() + this.getGiagoc()*10/100;
	}

	@Override
	public String toString() {
		return "Phone [masp=" + masp + ", tensp=" + tensp + ", giagoc=" + giagoc + ", Gia ban=" + Tinhgiaban()
				+ "]";
	}
	
	
}
