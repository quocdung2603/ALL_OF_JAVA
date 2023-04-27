package bai2.thuvien;
import java.util.*;
public class Ngay {
	int dd,mm,yy;
	Scanner sc = new Scanner(System.in);
	public Ngay() {
		// TODO Auto-generated constructor stub
	}
	public Ngay(int dd , int mm , int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	public void Input()
	{
		System.out.print("ngay: ");
		int d;
		do
		{
			 d = sc.nextInt();
			 if(d < 1 || d>31) 
			 {
				 System.out.print("Nhap lai: ");
			 }
		}while(d <1 || d > 31);
		System.out.print("Thang: "); 
		int e;
		do
		{
			 e = sc.nextInt();
			 if(e < 1 ||  e >12) 
			 {
				 System.out.print("Nhap lai: ");
			 }
		}while(e <1 || e > 31);
		
		System.out.print("Nam: "); 
		int f;
		do
		{
			 f = sc.nextInt();
			 if(f < 0) 
			 {
				 System.out.print("Nhap lai: ");
			 }
		}while(f <0);
		this.dd = d; 
		this.mm = e;
		this.yy =f;
	}
	@Override
	public String toString() {
		return "Ngay [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
	
}
