package Bai2;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class testXE {
    public static void main(String[] agrs)
    { 
        Scanner sc = new Scanner(System.in);
        ArrayList<XE> ds = new ArrayList<XE>();
        XE_Factory a = new XE_Factory(ds);
        System.out.println("Chon menu: " + '\n'+ "0. Thoat"+ '\n' + "1. Nhap xe" + '\n' +"2. Xuat tat ca xe" );
        while(true) 
        {
            System.out.print("Chon: ");
            int n = sc.nextInt();
            if(n==1) 
            {
                a.Input();
            }
            else if(n==2) 
            {
                a.ShownProduct();

            }
            else if(n==0) 
            {
                break;
            }
        }
        SerializationClass b = new SerializationClass(ds);
        b.serialize("dsxe.txt");

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("dsxe.txt"))) {
            SerializationClass list = (SerializationClass) in.readObject();
            ArrayList<XE> c = list.getDs();
            for(XE x : c)
            {
                x.Output();
            }
            System.out.println("Deserialization completed successfully!");
        } catch (Exception e) {
            System.err.println("Deserialization failed: " + e.getMessage());
        }
    }
}
