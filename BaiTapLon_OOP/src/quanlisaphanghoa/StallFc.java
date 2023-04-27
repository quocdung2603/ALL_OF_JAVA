package quanlisaphanghoa;
import java.util.*;
public class StallFc {
	ArrayList<Stall> a = new ArrayList<Stall>();
	Scanner sc = new Scanner(System.in);
	public StallFc() {
		// TODO Auto-generated constructor stub
	}
	
	public StallFc(ArrayList<Stall> a) {
		super();
		this.a = a;
	}
	
	public void FindAndRemove()
	{
		System.out.print("Nhap id can xoa: "); int x=sc.nextInt();
		for(int i=0;i<a.size();i++)
		{
			if(x==a.get(i).getId())
			{
				System.out.println("Xoa thanh cong");
				a.remove(i);
				return;
			}
		}
		System.out.println("Khong tim thay thong tin");
	}
	
	public void ShowListStall()
	{
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
	}
	
}
