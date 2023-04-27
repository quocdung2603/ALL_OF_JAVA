package Bai2.Person;
import java.util.*;
public class TestClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Person> a = new ArrayList<Person>();
		Student b = new Student("A","B","ABCDF",2020,185000.96);
		Staff c = new Staff("C","D","TDMU",2000000);
		a.add(b);
		a.add(c);
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
	}

}
