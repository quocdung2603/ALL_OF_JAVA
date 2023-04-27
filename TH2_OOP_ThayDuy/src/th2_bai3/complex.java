package th2_bai3;
import java.util.*;
public class complex implements Caclulator {
    private double real;
	private double imag;
	Scanner sc = new Scanner(System.in);
	public complex()
	{
	}
	public complex(double r , double i)
	{
		super();
		this.real = r ; 
		this.imag = i ;
	}
	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImag() {
		return imag;
	}
	public void setImag(double imag) {
		this.imag = imag;
	}
	
	public void Nhap()
	{
		
		System.out.println("Nhap phan thuc: ");
		double t = sc.nextDouble();
		System.out.println("Nhap phan ao: ");
		double m = sc.nextDouble();
		this.real = t;
		this.imag = m;
	}
	
//	public void add(complex c)
//	{
//		real += c.getReal();
//		imag +=c.getImag();
//	}
//	public void minus(complex c)
//	{
//		real-=c.getReal();
//		imag-=c.getImag();
//	}
//	public void times(complex c)
//	{
//		real = real *c.getReal() - imag*c.getImag();
//		imag = real * c.getImag() + imag*c.getReal();
//	}
	public void add(Caclulator x)
	{
		double r,i;
		if(x instanceof complex)
		{
			complex tmp = (complex) x;
			r = this.getReal() + tmp.getReal();
			i = this.getImag() + tmp.getImag();
			if(i > 0 ) System.out.println("= " + r + " + " +i+"i");
			else if(i==0) System.out.println("= " + r);
			else System.out.println("= " + r + " - " + Math.abs(i)+"i)"); 
		}
	}
	@Override
	public String toString() {
		if(this.getImag() > 0) return "(" + this.getReal() +" + "+this.getImag() + "i)"; 
		else if(this.getImag() == 0) return "(" + this.getReal()+")";
		else return "(" + this.getReal() + " - " + Math.abs(this.getImag()) + "i)";
	}
	public void print()
	{
		if(this.getImag() > 0) System.out.println("complex: " + this.getReal() +" + "+this.getImag() + "i"); 
		else if(this.getImag() == 0) System.out.println("complex: " + this.getReal()); 
		else System.out.println("complex: " + this.getReal() + " - " + Math.abs(this.getImag()) + "i"); 
	}
}
