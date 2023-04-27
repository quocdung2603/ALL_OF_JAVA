package th2_bai3;

import java.util.*;
public class TestCaculator {
    public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in);
		ArrayList<Caclulator> a= new ArrayList<Caclulator>();
		int chonkieu;
		System.out.println("Menu kieu: ");
		System.out.println("  +Kieu 1: So nguyen ");
		System.out.println("  +Kieu 2: Phan so ");
		System.out.println("  +Kieu 3: So phuc ");
		System.out.println("  +khac 1,2,3: Thoat");

		while(true)
		{
			System.out.println("Nhap kieu: ");
			chonkieu = sc.nextInt();
			if(chonkieu==1)
			{
				integer num = new integer();
				num.Nhap();
				a.add(num);
			}
			else if(chonkieu==2)
			{
				fraction k = new fraction();
				k.Nhap();
				a.add(k);
			}
			else if(chonkieu==3)
			{
				complex k = new complex();
				k.Nhap();
				a.add(k);
			}
			else break;
		}
		System.out.println("Danh sach cac so: ");
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		for(int i=0;i<a.size();i++)
		{
			for(int j=i+1;j<a.size();j++)
			{
				if(a.get(i) instanceof integer  && a.get(j) instanceof integer || a.get(i) instanceof fraction  && a.get(j) instanceof fraction || a.get(i) instanceof complex  && a.get(j) instanceof complex)
				{
					System.out.print(a.get(i) + " + " + a.get(j) + " ");
					a.get(i).add(a.get(j));
				}
			}
		}
		// integer songuyen = new integer(0);
		// fraction phanso = new fraction(0,1);
		// complex sophuc = new complex(0,0);
		// System.out.println("Danh sach cac so sau khi cong: ");
		// for(Caclulator x : a)
		// {
			
		// 	if(x instanceof integer)
		// 	{
		// 		integer tmp  = (integer) x;
		// 		songuyen.setNum(songuyen.getNum() + tmp.getNum());
		// 	}
		// 	if(x instanceof fraction)
		// 	{
		// 		fraction tmp = (fraction) x;
		// 		phanso.setTu(phanso.getTu()*tmp.getMau() + tmp.getTu() * phanso.getMau());
		// 		phanso.setMau(phanso.getMau()*tmp.getMau());
		// 		phanso.toigian();
		// 	}
		// 	if(x instanceof complex)
		// 	{
		// 		complex tmp = (complex) x;
		// 		sophuc.setReal(sophuc.getReal() + tmp.getReal());
		// 		sophuc.setImag(sophuc.getImag() + tmp.getImag());
		// 	}
		// }
		// songuyen.print();
		// phanso.print();
		// sophuc.print();
		sc.close();
	}
}
