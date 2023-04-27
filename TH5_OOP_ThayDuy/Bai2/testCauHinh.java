package Bai2;

import java.util.Scanner;

public class testCauHinh {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        CauHinh a = CauHinh.getInstance();
        while(true)
        {
            System.out.println("Nhap lua chon: " + '\n'+'\t' + "1. Tang giam am thanh" + '\n'+'\t' + "2. Tang giam do sang" + '\n'+'\t' + "3. Xem am thanh, do sang"  +'\n'+'\t' + "4. Thoat" );
            System.out.print("--> ");
            int n = sc.nextInt();
            if(n==1)
            {
                a.TangGiamAmthanh();
            }
            else if(n==2)
            {
                
                a.TangGiamDoSang();
            }
            else if(n==3)
            {
                a.Print();
            }
            else 
            {
                return;
            }
        }
        
    }
}
