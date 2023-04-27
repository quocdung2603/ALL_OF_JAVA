/*
 câu 1: quản lý danh sách món nhà hàng ăn nhanh 
	một iệm bán dồ ăn nhanh gồm 2 món : đồ ăn chính và đồ uống. 
    Mối món ăn có các thuộc tính chung: mã món , tên món và giá , và  các thông tin phụ thuộc vào sản phẩm cụ thể. 
    Đồ ăn có thêm thuộc tính : đồ ăn mặn hoặc đồ ăn chay . 
    Đồ uống có thêm thuộc tính : có ga hoặc ko có ga. 
    Danh sách các món ăn gồm ( đò ăn và đồ uống ) được lưu trữ trong 1 mảng 1 chiều với cấu trúc dữ liệu tự chọn. 
	Yêu cầu 
		Cài đặt class MonAn
		Cài đặt ckass MonChinh
		Cài đặt class DoUong
		Cài đặt class QLNhaHang theo yêu cầu sau :
			Sử dụng danh sách duy nhất để lưu trữ
			Viết chương trình thực hiện theo menu sau : 
				Thêm một món ăn 
				Thêm một món uống 
				Cập nhật một món ăn theo mã món ăn
				In danh sách món chính gia giam dan theo định dạng : STT \ Tên món \ Giá \ Loại
Hãy phân tích và thiết kế hệ thống đối tượng để quản lý các món ăn với các tính chất kế thừa , trừu tượng bạn thấy phù hợp
 */
package Bai2;
import java.util.ArrayList;
import java.util.Scanner;

public class QLNhaHang {
    static ArrayList<MonAn> a = new ArrayList<MonAn>();
    static void Inputs(Scanner sc)
    {
        System.out.println("Nhap so luong can them: ");
        int n = sc.nextInt();
        int loai;
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhap 1: Mon Chinh or Nhap 2: Do Uong ");
            loai = sc.nextInt();
            if(loai == 1)
            {
                MonChinh k = new MonChinh();
                k.Input();
                a.add(k);
            }
            else if(loai == 2)
            {
                DoUong k = new DoUong();
                k.Input();
                a.add(k);
            }
            else i--;
        }
    }
    static void Outputs(Scanner sc)
    {
        for(int i=0; i < a.size() ;i++) 
        {
            a.get(i).Output();
        }
    }
    static void CapNhatGia(String nma , double gia)
    {
        int k =0;
        for(int i=0;i<a.size();i++)
        {
            if(a.get(i).mamon == nma)
            {
                k=i;
                break;
            }
        }
        System.out.println("Mon dc chon: ");
        a.get(k).Output();
        System.out.println("Mon sau khi duoc cap nhat gia tien : ");
        a.get(k).giatien = gia;
        a.get(k).Output();
    }
    static void Outputs_MonChinh(Scanner sc)
    {
        for(int i=0;i<a.size();i++)
        {
            for(int j=i+1;j<a.size();j++)
            {
                if(a.get(i) instanceof MonChinh  && a.get(j) instanceof MonChinh)
                {
                    if(a.get(i).getGiatien() < a.get(j).getGiatien())
                    {
                        String tmp = new String();
                        String tmp1 = new String();
                        // String tmpl = new String();
                        tmp = a.get(i).mamon;
                        a.get(i).mamon = a.get(j).mamon;
                        a.get(j).mamon = tmp;
                        
                        tmp1 = a.get(i).tenmon;
                        a.get(i).tenmon = a.get(j).tenmon;
                        a.get(j).tenmon = tmp1;

                        double tmp2 = a.get(i).giatien;
                        a.get(i).giatien = a.get(j).giatien;
                        a.get(j).giatien = tmp2;
                        
                    }
                }
            }
        }
        System.out.println("Danh sach mon chinh giam dan: ");
        for(int i=0;i<a.size(); i++)
        {
            if(a.get(i) instanceof MonChinh)
            {
                System.out.print(i+1+" ");
                a.get(i).Output();
            }
        }
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        // int choose;
        // do
        // {
        //     choose = sc.nextInt();
        //     if(choose==0)
        //         return;
        //     if(choose==1)
        // }while(choose == 0);
        
        // Nhap Mang 
        Inputs(sc);
        System.out.println("");
        // Xuat Mang;
        Outputs(sc);
        System.out.println("");
        // Cap nhat gia theo ma mon an 
        System.out.println("Nhap ma mon an muon thay doi gia: ");    
        String nnma = new String();
        nnma = sc.next();
        System.out.println("Nhap gia tien moi: ");
        double nngia = sc.nextDouble();
        CapNhatGia(nnma, nngia);
        System.out.println("");
        // In danh sach giam dan theo gia mon chinh: 
        Outputs_MonChinh(sc);
        sc.close();
    }
}
