package QLNV;
import java.util.*;
public class CHINHTHUC extends NHANVIEN {
	
	int bacluong;
	
	public CHINHTHUC(){}
	public CHINHTHUC(String manv, String hoten, ArrayList<BANGCAP > bangcap, int bacluong)
	{
		super(manv, hoten , bangcap);
		this.bacluong = bacluong;
	}
	public int getBacluong() {
		return bacluong;
	}

	public void setBacluong(int bacluong) {
		this.bacluong = bacluong;
	}
	public int tangluong()
	{
		int cnt1=0, cnt2=0,ans=0;
		for(int i=0;i<certificates.size();i++)
		{
			if(certificates.get(i).loaibangcap.toLowerCase().equals("Dai hoc")) cnt1++;
			else if(certificates.get(i).loaibangcap.toLowerCase().equals("Thac si")) cnt2++;
		}
		ans = cnt1*10 + cnt2*15;
		return ans;
	}
	double Tinhluong() {
		// TODO Auto-generated method stub
		return this.getBacluong()*2000000 + (this.getBacluong()*2000000* this.tangluong() *1.0 /100) ;
	}
	@Override
	void xemthongtin() {
		System.out.println(this.getManv() + '\t' + this.getHoten() + '\t' + this.Tinhluong());
	}
	
	public void Input()
	{
		super.Input();
		System.out.print("Bac luong: "); int d = sc.nextInt();
		this.bacluong  = d;
	}

}
