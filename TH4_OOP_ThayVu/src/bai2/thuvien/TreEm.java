package bai2.thuvien;
import java.util.*;
public class TreEm extends CThuVien {
	String hotennguoidaidien;
	Scanner sc = new Scanner(System.in);
	public TreEm() {
		// TODO Auto-generated constructor stub
	}

	public TreEm(String hoten, Ngay ngaylapthe, int sothanghieuluc, String hotennguoidaidien) {
		super(hoten, ngaylapthe, sothanghieuluc);
		this.hotennguoidaidien = hotennguoidaidien;
	}

	public String getHotennguoidaidien() {
		return hotennguoidaidien;
	}

	public void setHotennguoidaidien(String hotennguoidaidien) {
		this.hotennguoidaidien = hotennguoidaidien;
	}
	
	public void Input()
	{
		super.Input();
		System.out.print("Ho ten nguoi dai dien: "); String f = sc.nextLine();
		this.hotennguoidaidien = f;
	}

	@Override
	public String toString() {
		return "TreEm [hotennguoidaidien=" + hotennguoidaidien + ", hoten=" + hoten + ", ngaylapthe="
				+ ngaylapthe + ", sothanghieuluc=" + sothanghieuluc + "]";
	}
	
}
