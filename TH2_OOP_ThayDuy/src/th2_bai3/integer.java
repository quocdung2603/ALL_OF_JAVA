package th2_bai3;

import java.util.*;
public class integer implements Caclulator {
    private int num;
	Scanner sc=  new Scanner(System.in);
	public integer()
	{
		
	}
	public integer(int z)
	{
		super();
		this.num = z;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void Nhap()
	{
		System.out.println("Nhap so nguyen: ");
		int z = sc.nextInt();
		this.num = z;
	}
//	public void add(integer c)
//	{
//		System.out.println(c.getNum() + this.getNum());
//	}
//	public void minus(integer c)
//	{
//		System.out.println(c.getNum() - this.getNum());
//	}
//	public void times(integer c)
//	{
//		System.out.println(c.getNum() * this.getNum());
//	}
//	public void divide(integer c)
//	{
//		System.out.println((double)c.getNum() / this.getNum());
//	}
	public void add (Caclulator x)
	{
		int ketqua;
		if(x instanceof integer)
		{
			integer tmp = (integer) x;
			ketqua =this.getNum() + tmp.getNum();
			System.out.println("= "+ketqua);
		}
	}
	@Override
	public String toString() {
		return  ""+ this.getNum();
	}
	public void print()
	{
		System.out.println("Integer: "+this.getNum());
	}
}
