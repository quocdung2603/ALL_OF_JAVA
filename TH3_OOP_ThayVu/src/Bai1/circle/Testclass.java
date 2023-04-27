package Bai1.circle;

import java.util.Scanner;

public class Testclass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Circle a = new Circle(); System.out.println(a.getArea());
		 */
		Cylinder b = new Cylinder(1.0);
		System.out.println(b.getVolume());
		sc.close();
	}
}
