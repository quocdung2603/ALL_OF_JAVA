package bai2.thuvien;

public class Nguoilon extends CThuVien {
	String cmnn;
	public Nguoilon() {
		// TODO Auto-generated constructor stub
	}

	public Nguoilon(String hoten, Ngay ngaylapthe, int sothanghieuluc, String cmnn) {
		super(hoten, ngaylapthe, sothanghieuluc);
		// TODO Auto-generated constructor stub
		this.cmnn = cmnn;
	}

	public String getCmnn() {
		return cmnn;
	}

	public void setCmnn(String cmnn) {
		this.cmnn = cmnn;
	}
	
	public void Input()
	{
		super.Input();
		sc.nextLine();
		System.out.print("So cmnn: "); String f = sc.nextLine();
		this.cmnn =f;
	}

	@Override
	public String toString() {
		return "Nguoilon [cmnn=" + cmnn + ", hoten=" + hoten + ", ngaylapthe=" + ngaylapthe + ", sothanghieuluc="
				+ sothanghieuluc + "]";
	}
	
}
