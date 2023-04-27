package th2_bai3;

import java.util.*;
public class fraction implements Caclulator {
	private int tu,mau;
	Scanner sc = new Scanner(System.in);
	public fraction()
	{
		
	}
	public fraction(int t,  int m)
	{
		super();
		this.tu= t;
		this.mau = m;
	}
	public int getTu() {
		return tu;
	}
	public void setTu(int tu) {
		this.tu = tu;
	}
	public int getMau() {
		return mau;
	}
	public void setMau(int mau) {
		this.mau = mau;
	}
	public void Nhap()
	{
		
		System.out.println("Nhap tu so: ");
		int t = sc.nextInt();
		System.out.println("Nhap mau so: ");
		int m = sc.nextInt();
		this.tu = t;
		this.mau = m;
	}
	public int UCLN(int a, int b)
	{
		if(a==0 || b==0)
			return a+b;
		else 
		{
			while(a!=b)
			{
				if(a>b) a-=b;
				else b-=a;
			}
			return a;
		}
	}
	public void toigian()
	{
		int k = UCLN(this.getTu(), this.getMau());
		this.setTu(this.getTu() / k);
		this.setMau(this.getMau()/k);
	}
//	public void add(fraction c)
//	{
//		int t = this.getTu()*c.getMau() + c.getTu()*this.getMau();
//		int m = this.getMau()* c.getMau();
//		fraction k = new fraction(t,m);
//		k.toigian();
//		System.out.println(k.tu +'/'+k.mau);
//	}
//	public void minus(fraction c)
//	{
//		int t = this.getTu()*c.getMau() - c.getTu()*this.getMau();
//		int m = this.getMau()* c.getMau();
//		fraction k = new fraction(t,m);
//		k.toigian();
//		System.out.println(k.tu +'/'+k.mau);
//	}
//	public void times(fraction c)
//	{
//		int t = this.getTu()*c.getTu();
//		int m = this.getMau()* c.getMau();
//		fraction k = new fraction(t,m);
//		k.toigian();
//		System.out.println(k.tu +'/'+k.mau);
//	}
//	public void devide(fraction c)
//	{
//		int t = this.getTu()*c.getMau();
//		int m = this.getMau()* c.getTu();
//		fraction k = new fraction(t,m);
//		k.toigian();
//		System.out.println(k.tu +'/'+k.mau);
//	}
	public void add(Caclulator x)
	{
		int t,m;
		if(x instanceof fraction)
		{
			fraction tmp = (fraction) x;
			t = this.getTu()* tmp.getMau() + tmp.getTu()*this.getMau();
			m = this.getMau() * tmp.getMau();
			fraction k = new fraction(t,m);
			k.toigian();
			System.out.println("= " + k.tu + " / " + k.mau);
		}
	}
	@Override
	public String toString() {
		return this.getTu() + " / " + this.getMau();
	}
	public void print()
	{
		System.out.println("fraction: " + this.getTu() + " / " + this.getMau());
	}
}
