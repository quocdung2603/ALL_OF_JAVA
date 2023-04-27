package th2_bai2;
import java.util.*;
public class TextBanking {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong tai khoan: ");
        int n = sc.nextInt();
        ArrayList<BankAcc> bank = new ArrayList<BankAcc>();
        for(int i=0;i<n;i++)
        {
            SavingAcc sv = new SavingAcc();
            sv.Input();
            bank.add(sv);
        }
        for(int i=0;i<bank.size();i++)
        {
            System.out.println(bank.get(i));
        }
        sc.close();
    }
} 
