package Bai1;

public class QLTruong extends Nhanvien{
    int capQL;

    public QLTruong() {
    }

    public QLTruong(int manv , String hoten ,int capQL) {
        super(manv, hoten);
        this.capQL = capQL;
    }

    public int getCapQL() {
        return this.capQL;
    }

    public void setCapQL(int capQL) {
        this.capQL = capQL;
    }

    public void Input()
    {
        super.Input();
        System.out.print("Cap bac quan ly: "); 
        int c = sc.nextInt();
        this.capQL = c;
    }   
    public void Output()
    {
        super.Output();
        System.out.println("Cap bac quan ly: "  + this.getCapQL());
    }
}
