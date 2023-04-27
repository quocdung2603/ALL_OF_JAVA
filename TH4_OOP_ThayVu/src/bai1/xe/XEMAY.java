package bai1.xe;
import java.util.*;
public class XEMAY extends XE {

	double maxspeed;
	String loaixe;
	Scanner sc = new Scanner(System.in);
	public XEMAY() {
		// TODO Auto-generated constructor stub
	}

	public XEMAY(String nhanhieu, int namsx, int sobanhxe, double giasx, double gialanbanh, double maxspeed , String loaixe) {
		super(nhanhieu, namsx, sobanhxe, giasx, gialanbanh);
		// TODO Auto-generated constructor stub
		this.maxspeed = maxspeed;
		this.loaixe = loaixe;
	}	

	public double getMaxspeed() {
		return maxspeed;
	}

	public void setMaxspeed(double maxspeed) {
		this.maxspeed = maxspeed;
	}

	public String getLoaixe() {
		return loaixe;
	}

	public void setLoaixe(String loaixe) {
		this.loaixe = loaixe;
	}

	public void Input()
	{
		super.Input();
		System.out.println("Toc do toi da: "); double f = sc.nextDouble();
		sc.nextLine();
		System.out.print("Loai xe(Tay ga | Xe so): "); String g = sc.nextLine();
		this.maxspeed = f;
		this.loaixe = g;
		
	}

	@Override
	public String toString() {
		return "XEMAY [maxspeed=" + maxspeed + ", loaixe=" + loaixe + ", nhanhieu=" + nhanhieu + ", namsx=" + namsx
				+ ", sobanhxe=" + sobanhxe + ", giasx=" + giasx + ", gialanbanh=" + gialanbanh + "]";
	}
	
}
