package bai1;
public class Calculator {
	int a,b;
	public Calculator() {
		// TODO Auto-generated constructor stub
	}
	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}

	public int multiply(int a, int b)
	{
		return a*b;
	}
	
	public double divide(int a, int b)
	{
		double s=0;
		try {
			s= a/b;
		} catch (ArithmeticException e) {
			System.out.println("Chia cho so 0!");
		}
		return s;
	}
	
}
