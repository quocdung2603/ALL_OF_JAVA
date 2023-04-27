package Bai1;

public class NvLapTrinh extends Nhanvien {
    int namkn;

    public NvLapTrinh() {
    }

    public NvLapTrinh(int manv, String hoten, int namkn) {
        super(manv, hoten);
        this.namkn = namkn;
    }

    public int getNamkn() {
        return this.namkn;
    }

    public void setNamkn(int namkn) {
        this.namkn = namkn;
    }

    public void Input()
    {
        super.Input();
        System.out.print("So nam kinh nghiem: ");
        int c = sc.nextInt();
        this.namkn =c;
    }
    public void Output()
    {
        super.Output();
        System.out.println("So nam kinh nghiem: " +  this.getNamkn());
    }
}
