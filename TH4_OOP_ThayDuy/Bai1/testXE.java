package Bai1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class testXE {
    public static void main(String[] agrs)
    { 
        Scanner sc = new Scanner(System.in);
        ArrayList<XE> ds = new ArrayList<XE>();
        XE_Factory a = new XE_Factory(ds);
        System.out.println("Chon menu: " + '\n'+ "0. Thoat"+ '\n' + "1. Them xe may" + '\n' +"2. Them xe hoi"  + '\n' + "3. Xuat tat ca xe"  + '\n' + "4. Xem lich su thao tac");
        while(true) 
        {
            System.out.print("Chon: ");
            int n = sc.nextInt();
            if(n==1) 
            {
                XEMAY k = new XEMAY();
                k.Input();
                a.a.add(k);
                LOG x = LOG.getInstance();
                x.writeLOG(n);
            }
            else if(n==2)
            {
                XEHOI k = new XEHOI();
                k.Input();
                a.a.add(k);
                LOG x = LOG.getInstance();
                x.writeLOG(n);
            }
            else if(n==3) 
            {
                a.ShownProduct();
                LOG x = LOG.getInstance();
                x.writeLOG(n);
            }
            else if(n==4)
            {
                try {
                    FileReader mf = new FileReader("log.txt");
                    BufferedReader bf = new BufferedReader(mf);
                    String line;
                    while((line=bf.readLine())!=null)
                    {
                        System.out.println(line);
                    }
                    bf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else if(n==0) 
            {
                LOG x = LOG.getInstance();
                x.writeLOG(n);
                return;
            }
        }
    }
}
