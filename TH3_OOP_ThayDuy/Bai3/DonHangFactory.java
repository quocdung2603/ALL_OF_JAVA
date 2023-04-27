package Bai3;

class DonHangFactory {
    static DonHang getDonHang(String loaidonhang)
    {
        DonHang x;
        if(loaidonhang.equals("Hoa Toc"))
            x= new HoaToc();
        else if(loaidonhang.equals("Giao Nhanh"))
            x= new GiaoNhanh();
        else x= new DiThuong();
        return x;
    }
}
