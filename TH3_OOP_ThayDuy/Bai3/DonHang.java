package Bai3;

abstract class DonHang {
   int dai, rong , cao ;
   boolean phatthanhcong; 
   abstract double getKhoiluong(int dai , int rong , int cao);
   abstract String tostring();
   public void Input() {
   }
}
