package quanliappicar;
import java.util.*;
public class IcarTestclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap loai xe(Honda hoac Toyota): "); String x = sc.nextLine();
		IcarFC a = new IcarFC();
		a.ViewCar(x);
		sc.close();
	}

}
