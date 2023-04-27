package bai1;

import java.util.*;

public class TestClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0, y = 0;
		boolean c1 = false;
		do {

			try {
				System.out.print("Nhap a: ");
				x = sc.nextInt();
				if (x < -1000 || x > 1000) {
					throw new NumberOutOfRangeException();
				} else {
					System.out.println("So vua nhap: " + x);
					c1 = false;
				}
			} catch (NumberOutOfRangeException e) {
				System.out.println(e.getMessage());
				c1 = true;
			}
		} while (c1 == true);

		boolean c2 = false;
		do {
			try {
				System.out.print("Nhap b: ");
				y = sc.nextInt();
				if (y < -1000 || y > 1000) {
					throw new NumberOutOfRangeException();
				} else {
					System.out.println("So vua nhap: " + y);
					c2 = false;
				}
			} catch (NumberOutOfRangeException e) {
				System.out.println(e.getMessage());
				c2 = true;
			}
		} while (c2 == true);
		Calculator a = new Calculator(x,y);
		System.out.println("KQ Nhan: " + a.multiply(x, y));
		System.out.println("KQ chia: " + a.divide(x, y));
		sc.close();
	}

}
