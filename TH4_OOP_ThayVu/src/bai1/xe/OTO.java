package bai1.xe;

import java.util.Scanner;

public class OTO extends XE {
	int soluongcua, soluongxe;
	Scanner sc = new Scanner(System.in);
	public OTO() {
		// TODO Auto-generated constructor stub
	}

	public OTO(String nhanhieu, int namsx, int sobanhxe, double giasx, double gialanbanh, int soluongcua,
			int soluongxe) {
		super(nhanhieu, namsx, sobanhxe, giasx, gialanbanh);
		this.soluongcua = soluongcua;
		this.soluongxe = soluongxe;
	}

	public int getSoluongcua() {
		return soluongcua;
	}

	public void setSoluongcua(int soluongcua) {
		this.soluongcua = soluongcua;
	}

	public int getSoluongxe() {
		return soluongxe;
	}

	public void setSoluongxe(int soluongxe) {
		this.soluongxe = soluongxe;
	}

	public void Input() {
		super.Input();
		System.out.print("So luong cua xe: "); int f = sc.nextInt();
		System.out.print("So luong xe:  "); int g = sc.nextInt();
		setSoluongcua(f);
		setSoluongxe(g);
		setGialanbanh(this.getGiasx() + this.getGiasx()*10.0/100 + 2000000);
	}

	@Override
	public String toString() {
		return "OTO [soluongcua=" + soluongcua + ", soluongxe=" + soluongxe + ", nhanhieu=" + nhanhieu + ", namsx="
				+ namsx + ", sobanhxe=" + sobanhxe + ", giasx=" + giasx + ", gialanbanh=" + gialanbanh + "]";
	}
	
}
