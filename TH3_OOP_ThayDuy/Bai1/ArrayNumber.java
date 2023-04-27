package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayNumber {
    private ArrayList<Caclulator> a = new ArrayList<Caclulator>();
    private int n;
    Scanner sc = new Scanner(System.in);
    public ArrayNumber()
    {
    }
    public ArrayNumber(ArrayList<Caclulator> ds , int nn)
    {
        this.a = ds;
        this.n = nn;
    }
    public void Inputs()
    {
        int chonkieu;
		System.out.println("Menu kieu: ");
		System.out.println("  +Kieu 1: So nguyen ");
		System.out.println("  +Kieu 2: Phan so ");
		System.out.println("  +Kieu 3: So phuc ");
		System.out.println("  +khac 1,2,3: Nhap lai :)) ");
		for(int i=0;i<n;i++)
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
			else i--;
		}
    }
    public void Outputs()
    {
        System.out.println("Trang thai mang: ");
        for(int i=0;i<a.size();i++)
            System.out.println(a.get(i));
    }
    public void Xuattongtheocap()
    {
        System.out.println("Phep cong theo tung cap so cung loai: ");
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
    }
}
