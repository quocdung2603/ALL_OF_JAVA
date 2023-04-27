package quanlidichvukhachsan;
import java.util.*;
public class GiatUi implements IDichVu {
	private double sokg,dongiaG;
	private int soluongDacbiet;
	Scanner sc = new Scanner(System.in);
	public GiatUi() {
		// TODO Auto-generated constructor stub
	}
	 
	//alt + s + a : const day du
	//alt s + r : getter setter
	
	public GiatUi(double sokg, double dongiaG, int soluongDacbiet) {
		super();
		this.sokg = sokg;
		this.dongiaG = dongiaG;
		this.soluongDacbiet = soluongDacbiet;
	}
	
	public double getSokg() {
		return sokg;
	}

	public void setSokg(double sokg) {
		this.sokg = sokg;
	}

	public double getDongiaG() {
		return dongiaG;
	}

	public void setDongiaG(double dongiaG) {
		this.dongiaG = dongiaG;
	}

	public int getSoluongDacbiet() {
		return soluongDacbiet;
	}

	public void setSoluongDacbiet(int soluongDacbiet) {
		this.soluongDacbiet = soluongDacbiet;
	}

	public void Input()
	{
		System.out.print("So kg: "); double a = sc.nextDouble();
		System.out.print("sl dac biet: "); int b = sc.nextInt();
		setSokg(a);
		setSoluongDacbiet(b);
		setDongiaG(12000);
	}
	@Override
	public double getTienDichVu() {
		if(this.getSokg() > 10)
			return this.getSokg() * this.getDongiaG() + this.getSoluongDacbiet()*25000 - (this.getSokg() * this.getDongiaG() + this.getSoluongDacbiet()*25000)*0.05;
		else 
			return this.getSokg() * this.getDongiaG() + this.getSoluongDacbiet()*25000;
	}

	@Override
	public String toString() {
		return "GiatUi [sokg=" + sokg + ", soluongDacbiet=" + soluongDacbiet + ", ThanhTien=" + getTienDichVu()
				+ "]";
	}

	
}
