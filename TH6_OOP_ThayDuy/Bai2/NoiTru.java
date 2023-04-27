package Bai2;

public class NoiTru extends BenhNhan{
    int songaydieutri , giaphong; 

    public NoiTru() {
    }

    public NoiTru(String mabn , String tenbn, int songaydieutri, int giaphong) {
        super(mabn, tenbn);
        this.songaydieutri = songaydieutri;
        this.giaphong = giaphong;
    }

    public int getSongaydieutri() {
        return this.songaydieutri;
    }

    public void setSongaydieutri(int songaydieutri) {
        this.songaydieutri = songaydieutri;
    }

    public int getGiaphong() {
        return this.giaphong;
    }

    public void setGiaphong(int giaphong) {
        this.giaphong = giaphong;
    }

    @Override
    int Tinhvienphi() {
        return this.getSongaydieutri() * this.getGiaphong();
    }

    public void Input()
    {
        super.Input();
        System.out.print("So ngay dieu tri: ");
        int c = sc.nextInt();
        System.out.print("Don gia tien phong: ");
        int d = sc.nextInt();
        this.songaydieutri = c ;
        this.giaphong = d;      
    }

    public void Output()
    {
        super.Output();
        System.out.println('\t' + "|" + '\t' + "Noi tru" + '\t' + "|" + '\t' + this.Tinhvienphi());
    }
}
