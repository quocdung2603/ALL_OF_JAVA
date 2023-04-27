package QLNV;
import java.util.*;
public class qlnv_factory {
    ArrayList<NHANVIEN> a = new ArrayList<NHANVIEN>();
    Scanner sc = new Scanner(System.in);

    public qlnv_factory(){}
    public qlnv_factory(ArrayList<NHANVIEN> a)
    {
        this.a = a;
    }

    public ArrayList<NHANVIEN> getA() {
        return this.a;
    }

    public void setA(ArrayList<NHANVIEN> a) {
        this.a = a;
    }


    public void Indanhsach()
    {
        for(int i=0;i<a.size();i++)
        {
            a.get(i).xemthongtin();
        }
    }
}
