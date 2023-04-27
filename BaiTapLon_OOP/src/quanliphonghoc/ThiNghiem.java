package quanliphonghoc;

public class ThiNghiem extends PHONG {
	String chuyennganh;
	int succhua;
	String bonrua;
	public ThiNghiem() {
		// TODO Auto-generated constructor stub
	}

	public ThiNghiem(String maphong, String daynha, double dientich, int sobongden, String chuyennganh , int succhua, String bonrua) {
		super(maphong, daynha, dientich, sobongden);
		// TODO Auto-generated constructor stub
		this.chuyennganh = chuyennganh;
		this.succhua = succhua;
		this.bonrua = bonrua;
	}
	
	
	public String getChuyennganh() {
		return chuyennganh;
	}

	public void setChuyennganh(String chuyennganh) {
		this.chuyennganh = chuyennganh;
	}

	public int getSucchua() {
		return succhua;
	}

	public void setSucchua(int succhua) {
		this.succhua = succhua;
	}

	public String getBonrua() {
		return bonrua;
	}

	public void setBonrua(String bonrua) {
		this.bonrua = bonrua;
	}
	
	public void Input()
	{
		super.Input();
		sc.nextLine();
		System.out.print("Phong TN cua nganh: "); String e = sc.nextLine();
		System.out.print("Suc chua: "); int f = sc.nextInt();
		sc.nextLine();
		System.out.print("Bon rua tay(co|khong): "); String g = sc.nextLine();
		setChuyennganh(e);
		setSucchua(f);
		setBonrua(g);
	}
	@Override
	public String PhongHocDatChuan() {
		double check = this.getDientich() / this.getSobongden();
		if(check == 10 && this.getBonrua().toLowerCase().compareTo("co")==0) return "Dat";
		return "Chua dat";
	}

	@Override
	public String toString() {
		return "ThiNghiem [chuyennganh=" + chuyennganh + ", succhua=" + succhua + ", bonrua=" + bonrua + ", maphong="
				+ maphong + ", daynha=" + daynha + ", dientich=" + dientich + ", sobongden=" + sobongden
				+ ", PhongHocDatChuan()=" + PhongHocDatChuan() + "]";
	}
	
	
}
