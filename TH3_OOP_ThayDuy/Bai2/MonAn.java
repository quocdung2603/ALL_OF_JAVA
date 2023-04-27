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
				In danh sách món chính theo định dạng : STT \ Tên món \ Giá \ Loại
Hãy phân tích và thiết kế hệ thống đối tượng để quản lý các món ăn với các tính chất kế thừa , trừu tượng bạn thấy phù hợp
 */
package Bai2;

import java.util.Scanner;

public class MonAn {
    protected String mamon,tenmon;
    protected double giatien;
    Scanner sc = new Scanner(System.in);
    public MonAn() {
    }

    public MonAn(String mamon, String tenmon, double giatien) {
        this.mamon = mamon;
        this.tenmon = tenmon;
        this.giatien = giatien;
    }

    public String getMamon() {
        return this.mamon;
    }

    public void setMamon(String mamon) {
        this.mamon = mamon;
    }

    public String getTenmon() {
        return this.tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public double getGiatien() {
        return this.giatien;
    }

    public void setGiatien(double giatien) {
        this.giatien = giatien;
    }
    @Override
    public String toString() {
        return "{" +
            " mamon='" + getMamon() + "'" +
            ", tenmon='" + getTenmon() + "'" +
            ", giatien='" + getGiatien() + "'" +
            "}";
    }
    public void Input()
    {
        System.out.println("Nhap ma mon: ");
        String nma = new String();
        nma = sc.nextLine();
        System.out.println("Nhap ten mon: ");
        String nten = new String();
        nten = sc.nextLine();
        System.out.println("Nhap gia tien: ");
        Double ngia = sc.nextDouble();
        this.mamon = nma;
        this.tenmon= nten;
        this.giatien = ngia;
    }
    public void Output()
    {
        System.out.print("Ma mon: " + this.getMamon() + " | Ten Mon: " + this.getTenmon() + " | Gia tien: " + this.getGiatien() +" | ");
    }
}