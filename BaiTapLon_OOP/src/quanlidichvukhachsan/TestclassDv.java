package quanlidichvukhachsan;
import java.util.*;
public class TestclassDv {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<HoaDon> b = new Vector<HoaDon>();
		HoaDonFc a = new HoaDonFc(b);
		while(true)
		{
			System.out.println("chon di: " + '\n' + '\t' + "1. Them hoa don" + '\n' + '\t' + "2. In danh sach hoa don"+ '\n' + '\t' + "3. In chi tiet" + '\n' + '\t' + "0. Thoat");
			int z= sc .nextInt();
			if(z==1)
			{
				a.ThemHoaDon();
			}
			else if(z==2)
			{
				a.InDanhSachHoaDon();
			}
			else if(z==3)
			{
				a.InChiTiet();
			}
			else if(z==0)
			{
				sc.close();
				return;
			}
		}
	}

}
