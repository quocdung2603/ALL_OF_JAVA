package bai2.thuvien;
import java.util.*;
public class CTThuvien_fc {
	ArrayList<CThuVien> a = new ArrayList<CThuVien>();
	Scanner sc = new Scanner(System.in);
	public CTThuvien_fc() {
		// TODO Auto-generated constructor stub
	}
	public CTThuvien_fc(ArrayList<CThuVien> a)
	{
		this.a = a;
	}
	public void InsertMember()
	{
		System.out.println("Lua chon: " + '\n'+'\t' + "1. Tre em" + '\n'+'\t' + "2. Nguoi lo`n" );
		System.out.print("--> ");
		int t = sc.nextInt();
		if(t==1)
		{
			TreEm k = new TreEm();
			k.Input();
			a.add(k);
		}
		else if(t==2)
		{
			Nguoilon k = new Nguoilon();
			k.Input();
			a.add(k);
		}
	}
	public void ShowList()
	{
		for(int i=0;i<a.size();i++)
			System.out.println(a.get(i));
	}
	public long Total()
	{
		long s=0;
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i) instanceof TreEm)  s+=20000;
			else s=s+ a.get(i).getSothanghieuluc()*10000;
		}
		return s;
	}
}
