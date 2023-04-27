package th2_bai2;

import java.util.*;
public class BankAcc {
	protected String number;
	protected double balance;
	protected Scanner sc = new Scanner(System.in);
	public BankAcc()
	{
		
	}
	public BankAcc(String newnumber, double newbalance)
	{
		setNumber(newnumber);
		setBalance(newbalance);
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void Input()
	{
		String newnumber = new String();
		System.out.println("Nhap stk: ");
		newnumber = sc.next();
		System.out.println("Nhap so du: ");
		double newbalance = sc.nextDouble();
		this.balance = newbalance;
		this.number = newnumber;
	}

	@Override
	public String toString() {
		return "{" + " Number: " + getNumber() + " | " +" Balance: " + getBalance() +"}";
	}
	public void Withdraw()
	{
		System.out.println("Nhap so tien: ");
		double amount = sc.nextDouble();
		if(this.getBalance() < amount)
		{
			System.out.println("Khong du so du: ");
			return;
		}
		double tmp = this.balance;
		tmp-=amount;
		setBalance(tmp);
	}
	public void Deposit()
	{
		System.out.println("Nhap so tien: ");
		double amount = sc.nextDouble();
		double tmp = this.balance;
		tmp+=amount;
		setBalance(tmp);
	}
	public void print()
	{
		System.out.print("Number: " + this.getNumber() + " | " + "Balance: " + this.getBalance());
	}

}
