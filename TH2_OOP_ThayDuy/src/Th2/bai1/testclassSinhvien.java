package Th2.bai1;
import java.util.*;
public class testclassSinhvien {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong sv: ");
		int n = sc.nextInt();
		ArrayList<Student> ds = new ArrayList<Student>();
		for(int i=0;i<n;i++)
		{
			Student sv1 = new Student();
			sv1.Input();
			ds.add(sv1);
		}
		System.out.println("Student List: ");
		for(int i=0;i<ds.size();i++)
		{
			System.out.println(ds.get(i));
		}
		System.out.println("Equals Medium Mark");
		new Student().EqualsMediumMark(ds);
		sc.close();
	}
}
