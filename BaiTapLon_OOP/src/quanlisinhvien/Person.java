package quanlisinhvien;
import java.util.*;
public abstract class Person {
	protected String hoten,diachi;
	Scanner sc = new Scanner(System.in);
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String hoten, String diachi) {
		super();
		this.hoten = hoten;
		this.diachi = diachi;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	
	public void Input()
	{
		System.out.print("Ho ten: "); String a = sc.nextLine(); 
		System.out.print("Dia chi: "); String b = sc.nextLine();
		this.hoten =a ;
		this.diachi=b ;
	}
	@Override
	public String toString() {
		return "Person [hoten=" + hoten + ", diachi=" + diachi + "]";
	}
	
}
