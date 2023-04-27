package quanlidichvukhachsan;
import java.util.*;
public class ThueXe implements IDichVu {
	private double sogiothuexe, dongiathuexe;
	Scanner sc = new Scanner(System.in);
	public ThueXe() {
		// TODO Auto-generated constructor stub
	}
	
	public ThueXe(double sogiothuexe, double dongiathuexe) {
		super();
		this.sogiothuexe = sogiothuexe;
		this.dongiathuexe = dongiathuexe;
	}
	
	public double getSogiothuexe() {
		return sogiothuexe;
	}

	public void setSogiothuexe(double sogiothuexe) {
		this.sogiothuexe = sogiothuexe;
	}

	public double getDongiathuexe() {
		return dongiathuexe;
	}

	public void setDongiathuexe(double dongiathuexe) {
		this.dongiathuexe = dongiathuexe;
	}
	
	public void Input()
	{
		System.out.print("So gio thue: "); double a=sc.nextDouble();
		System.out.print("So gio thue: "); double b=sc.nextDouble();
		setSogiothuexe(a);
		setDongiathuexe(b);
	}
	@Override
	public double getTienDichVu() {
		if(this.getSogiothuexe() > 12)
			return this.getSogiothuexe() * this.getDongiathuexe()*0.9;
		else 
			return this.getSogiothuexe() * this.getDongiathuexe();
	}

	@Override
	public String toString() {
		return "ThueXe [sogiothuexe=" + sogiothuexe + ", dongiathuexe=" + dongiathuexe + ", getTienDichVu()="
				+ getTienDichVu() + "]";
	}
	
	

}
