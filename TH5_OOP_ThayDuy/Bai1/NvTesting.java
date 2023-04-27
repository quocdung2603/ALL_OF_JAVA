package Bai1;

public class NvTesting extends Nhanvien{
    String loaikiemthu ; 

    public NvTesting() {
    }

    public NvTesting(int manv , String hoten,String loaikiemthu) {
        super(manv, hoten);
        this.loaikiemthu = loaikiemthu;
    }

    public String getLoaikiemthu() {
        return this.loaikiemthu;
    }

    public void setLoaikiemthu(String loaikiemthu) {
        this.loaikiemthu = loaikiemthu;
    }
    
    public void Input()
    {
        super.Input();
        System.out.println("Loai kiem thu:" + '\n'+'\t' + "Kiem thu he thong" + '\n'+'\t' + "Kiem thu chuc nang" );
        System.out.print("--> ");
        String c = sc.nextLine();
        this.loaikiemthu = c;
    }
    public void Output()
    {
        super.Output();
        System.out.println("Loai kiem thu: " + this.getLoaikiemthu());
    }

}
