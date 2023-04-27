package quanlythegioididong;
import java.util.*;
public class TestClass {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Vector<Product> b = new Vector<Product>();
		Productfc a = new Productfc(b);
		int t;
		do
		{
			System.out.println("Nhap lua chon: " + '\n' + '\t' + "1. Them dien thoai" + '\n' + '\t'
					+ "2. Them Laptop" + '\n' + '\t' + "3. Danh sach laptop gia cao nhat"
					+ '\n' + '\t' + "4. Xuat danh sach" 
					+'\n' + '\t' + "0. Thoat chuong trinh");
			System.out.print("--> ");
			t = sc.nextInt();
			if(t!=1 && t!=2 && t!=3 && t!=4 && t!=0)
			{
				System.out.println("Nhap lai: ");
			}
			if (t == 1) {
				Phone k = new Phone();
				k.Input();
				a.a.add(k);
			} else if (t == 2) {
				Laptop k = new Laptop();
				k.Input();
				a.a.add(k);
			} else if (t == 3) {
				a.LaptopGiaCaoNhat();
			} else if (t == 4) {
				a.Indanhsach();
			}else if(t==0)
			{
				sc.close();
				return;
			}
		}while(t!=1 && t!=2 && t!=3 && t!=4 && t!=0);
	}

}
