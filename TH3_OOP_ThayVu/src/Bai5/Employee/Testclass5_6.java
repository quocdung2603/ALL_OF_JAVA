package Bai5.Employee;

import java.util.*;

public class Testclass5_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> a = new ArrayList<Employee>();
		Employee k = new Employee("1","A",6,2,2.4);
//		Manager z  = new Manager("2","B",12,1,6.0,)
		Manager z = new Manager("2", "B",12 , 1, 6.0, "mid", 1.0);
		a.add(k);
		a.add(z);
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		sc.close();
	}

}
