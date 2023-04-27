package Bai2;

public class NgoaiTru extends BenhNhan {
    int tiencongkham;

    public NgoaiTru() {
    }

    public NgoaiTru(String mabn, String tenbn,int tiencongkham) {
        super(mabn, tenbn);
        this.tiencongkham = tiencongkham;
    }

    public int getTiencongkham() {
        return this.tiencongkham;
    }

    public void setTiencongkham(int tiencongkham) {
        this.tiencongkham = tiencongkham;
    }

    @Override
    int Tinhvienphi() {
        return this.getTiencongkham();
    }

    public void Input()
    {
        super.Input();
        System.out.print("Tien cong kham: "); 
        int c = sc.nextInt();
        this.tiencongkham = c;
    }
    public void Output()
    {
        super.Output();
        System.out.println('\t' + "|" + '\t' + "Ngoai tru" + '\t' + "|" + '\t' + this.Tinhvienphi());
    }
}
