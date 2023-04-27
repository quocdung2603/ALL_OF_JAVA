package quanlisaphanghoa;
import java.util.*;
public class Stall_testclass {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Stall> b = new ArrayList<Stall>();
		StallFc a = new StallFc(b);
		while(true)
		{
			System.out.println("Chon di: " + '\n' + '\t' + "1. Them sap ban do an"
					+ '\n' + '\t' + "2. Them sap ban quan ao"
					+ '\n' + '\t' + "3. Them sap ban trang suc"
					+ '\n' + '\t' + "4. Tim kiem va xoa sap hang hoa"
					+ '\n' + '\t' + "5. In danh sach cac sap hang hoa"
					+ '\n' + '\t' + "0. Thoat chuong trinh");
			System.out.print("--> "); int t =sc.nextInt();
			if(t==1)
			{
				FoodStall k = new FoodStall();
				k.Input();
				a.a.add(k);
			}
			else if(t==2)
			{
				ClosingStall k = new ClosingStall();
				k.Input();
				a.a.add(k);
			}
			else if(t==3)
			{
				JewelryStall k = new JewelryStall();
				k.Input();
				a.a.add(k);
			}
			else if(t==4)
			{
				a.FindAndRemove();
			}
			else if(t==5)
			{
				a.ShowListStall();
			}
			else if(t==0)
			{
				sc.close();
				return;
			}
		}
	}

}
