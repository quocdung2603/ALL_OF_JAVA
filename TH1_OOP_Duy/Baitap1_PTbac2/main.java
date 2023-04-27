package Baitap1_PTbac2;

import java.util.*;

/**
 * main
 */
public class main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Dieukien dk  = new Dieukien();
        dk.nhappt();
        dk.check();
        sc.close();
    }
}