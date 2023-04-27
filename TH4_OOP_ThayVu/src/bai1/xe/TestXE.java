package bai1.xe;
import java.util.*;
public class TestXE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<XE> b = new ArrayList<XE>();
		XE_fc a = new XE_fc(b);
		int t;
		while(true)
		{
			System.out.println("Chon menu:" + '\n'+'\t' + "1. Nhap xe may" + '\n'+'\t' + "2. Nhap o to" + '\n'+'\t' + "3. Tim kiem"+ '\n'+'\t' + "4. Thoat chuong trinh" + '\n' + "-->");
			t = sc.nextInt();
			if(t==1)
			{
				XEMAY k = new XEMAY();
				k.Input();
				a.a.add(k);
			}
			else if(t==2)
			{
				OTO k = new OTO();
				k.Input();
				a.a.add(k);
			}
			else if(t==3)
			{
				a.Find();
			}
			else if(t==0)
			{
				break;
			}
		}
		sc.close();
	}
}
