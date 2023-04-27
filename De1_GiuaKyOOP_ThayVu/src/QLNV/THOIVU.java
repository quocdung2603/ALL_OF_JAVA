	package QLNV;
import java.util.*;
public class THOIVU extends NHANVIEN {
	int thoihanhd;
	public THOIVU () {}
	public THOIVU (String manv, String hoten, ArrayList<BANGCAP> bangcap,int thoihanhd )
	{
		super(manv, hoten, bangcap);
		this.thoihanhd = thoihanhd;
	}

	public int getThoihanhd() {
		return this.thoihanhd;
	}

	public void setThoihanhd(int thoihanhd) {
		this.thoihanhd = thoihanhd;
	}
	public int tangluong()
	{
		int cnt1=0, cnt2=0,ans=0;
		for(int i=0;i<certificates.size();i++)
		{
			if(certificates.get(i).loaibangcap.equals("Dai hoc")) cnt1++;
			else if(certificates.get(i).loaibangcap.equals("Thac si")) cnt2++;
		}
		ans = cnt1*10 + cnt2*15;
		return ans;
	} 
	@Override
	double Tinhluong() {
		// TODO Auto-generated method stub
		int phucap=1000000;
		if(this.getThoihanhd() <90) phucap=0;
		return 2000000*2 + phucap + ((2000000*2 + phucap)*this.tangluong()*1.0/100);
	}

	@Override
	void xemthongtin() {
		System.out.println(this.getManv() + '\t' + this.getHoten() + '\t' + this.Tinhluong());
	}

	public void Input()
	{
		super.Input();
		System.out.print("Thoi han hop dong:"); int d = sc.nextInt();
		this.thoihanhd = d;
	}

}
