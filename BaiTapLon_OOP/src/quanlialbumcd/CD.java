package quanlialbumcd;
import java.util.*;
public class CD {
	String macd,tuacd,casi;
	int sobaihat;
	double giathanh;
	Scanner sc = new Scanner(System.in);
	public CD() {
		// TODO Auto-generated constructor stub
	}
	public CD(String macd, String tuacd, String casi, int sobaihat, double giathanh) {
		super();
		this.macd = macd;
		this.tuacd = tuacd;
		this.casi = casi;
		this.sobaihat = sobaihat;
		this.giathanh = giathanh;
	}
	public String getMacd() {
		return macd;
	}
	public void setMacd(String macd) {
		this.macd = macd;
	}
	public String getTuacd() {
		return tuacd;
	}
	public void setTuacd(String tuacd) {
		this.tuacd = tuacd;
	}
	public String getCasi() {
		return casi;
	}
	public void setCasi(String casi) {
		this.casi = casi;
	}
	public int getSobaihat() {
		return sobaihat;
	}
	public void setSobaihat(int sobaihat) {
		this.sobaihat = sobaihat;
	}
	public double getGiathanh() {
		return giathanh;
	}
	public void setGiathanh(double giathanh) {
		this.giathanh = giathanh;
	}
	public void Input()
	{
		System.out.print("Ma CD: ");  String a= sc.nextLine();
		System.out.print("Tua CD: "); String b = sc.nextLine();
		System.out.print("Ca si: "); String c = sc.nextLine();
		System.out.print("So bai hat: "); int d;
		do
		{
			d=sc.nextInt();
			if(d < 0) 
			{
				System.out.print('\n' + '\t' + "Nhap lai:");
			}
		}while(d < 0);
		System.out.print("Gia thanh: "); double e;
		do
		{
			e=sc.nextDouble();
			if(e<0)
			{
				System.out.print('\n' + '\t' + "Nhap lai:");
			}
		}while(e<0);
		setMacd(a);
		setTuacd(b);
		setCasi(c);
		setSobaihat(d);
		setGiathanh(e);
	}
	@Override
	public String toString() {
		return "CD [macd=" + macd + ", tuacd=" + tuacd + ", casi=" + casi + ", sobaihat=" + sobaihat + ", giathanh="
				+ giathanh + "]";
	}
	
	
}
