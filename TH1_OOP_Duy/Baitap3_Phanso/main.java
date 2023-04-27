package Baitap3_Phanso;

import java.util.*;
public class main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Phanso ps1 = new Phanso();
        Phanso ps2 = new Phanso();
        ps1.nhap();
        ps2.nhap();
        ps1.Cong(ps2);
        ps1.Tru(ps2);
        ps1.Chia(ps2);
        ps1.Nhan(ps2);
        sc.close();
    }
}
