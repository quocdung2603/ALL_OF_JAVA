package Bai1;

import java.util.*;
public class TestCaculator {
    public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in);
		ArrayList<Caclulator> a = new ArrayList<Caclulator>();
		System.out.println("Nhap so luong phan tu: ");
		int n = sc.nextInt();
		ArrayNumber b = new ArrayNumber(a,n);
		b.Inputs();
		System.out.println("");
		b.Outputs();
		System.out.println("");
		b.Xuattongtheocap();
		sc.close();
	}
}
