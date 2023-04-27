package th2_bai2;
import java.util.*;
public class SavingAcc extends BankAcc {

    double rate;

    public SavingAcc() {
    }

    public SavingAcc(String number , double balance, double rate) {
        super(number, balance);
        this.rate = rate;
    }
    public double getRate() {
        return this.rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    public void Input()
    {
        super.Input();
        System.out.println("Nhap % lai suat: ");
        double newrate = sc.nextDouble();
        this.rate = newrate;
    }

    @Override
    public String toString() {
        super.print();
        return " | " + "rate: " + getRate();
    }
}
