package quanlikhohanghoa;
import java.util.*;
public abstract class Kho {
	protected String mahang,tenhang;
	protected int soluongton;
	protected double dongia;
	abstract String MucDoBuonBan();	
	abstract double getVAT();
	Scanner sc = new Scanner(System.in);
	
	public Kho() {
		// TODO Auto-generated constructor stub
	}
	public Kho(String mahang, String tenhang, int soluongton, double dongia) {
		super();
		this.mahang = mahang;
		this.tenhang = tenhang;
		this.soluongton = soluongton;
		this.dongia = dongia;
	}
	public String getMahang() {
		return mahang;
	}
	public void setMahang(String mahang) {
		this.mahang = mahang;
	}
	public String getTenhang() {
		return tenhang;
	}
	public void setTenhang(String tenhang) {
		this.tenhang = tenhang;
	}
	public int getSoluongton() {
		return soluongton;
	}
	public void setSoluongton(int soluongton) {
		this.soluongton = soluongton;
	}
	public double getDongia() {
		return dongia;
	}
	public void setDongia(double dongia) {
		this.dongia = dongia;
	}
	
	public void Input()
	{
		System.out.print("Ma hang hoa: "); String a;
		do
		{
			a= sc.nextLine();
			if(a.length()==0) 
			{
				System.out.print('\n'+ "Nhap lai:");
			}
			
		}while(a.length()==0); String b;
		System.out.print("Ten hang hoa: ");
		do
		{
			b= sc.nextLine();
			if(b.length()==0) 
			{
				System.out.print('\n'+ "Nhap lai:");
			}
			
		}while(b.length()==0);
		System.out.print("So luong ton: "); int c;
		do
		{
			c= sc.nextInt();
			if(c <0) 
			{
				System.out.print('\n'+ "Nhap lai:");
			}
			
		}while(c<0);
		System.out.print("Don gia: "); double d;
		do
		{
			d= sc.nextDouble();
			if(d <=0) 
			{
				System.out.print('\n'+ "Nhap lai:");
			}
			
		}while(d<=0);
		setMahang(a);
		setTenhang(b);
		setSoluongton(c);
		setDongia(d);
	}
}
