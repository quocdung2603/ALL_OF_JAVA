package quanlialbumcd;

import java.util.*;

public class CDfc {
	ArrayList<CD> a = new ArrayList<CD>();
	Scanner sc = new Scanner(System.in);

	public CDfc() {
		// TODO Auto-generated constructor stub
	}

	public CDfc(ArrayList<CD> a) {
		this.a = a;
	}

	public ArrayList<CD> getA() {
		return a;
	}

	public void setA(ArrayList<CD> a) {
		this.a = a;
	}

	public void ThemCD() {
		CD k = new CD();
		k.Input();
		for (int i = 0; i < a.size(); i++) {
			if (k.macd.compareTo(a.get(i).macd) == 0) {
				System.out.println("Them that bai!");
				return;
			}
		}
		System.out.println("Them thanh cong!");
		a.add(k);
	}

	public int soluongCD() {
		return a.size();
	}

	public double TongGiaThanhCD() {
		double s = 0;
		for (int i = 0; i < a.size(); i++) {
			s += a.get(i).getGiathanh();
		}
		return s;
	}

	public void SapXepGiamDanGiaThanhCD() {
		for (int i = 0; i < a.size() - 1; i++) {
			for (int j = i + 1; j < a.size(); j++) {
				if (a.get(i).giathanh < a.get(j).giathanh)
					Collections.swap(a, i, j);
			}
		}
	}

	public void SapXepTangDanTuaCD() {
		for (int i = 0; i < a.size() - 1; i++) {
			for (int j = i + 1; j < a.size(); j++) {
				if (a.get(i).tuacd.compareTo(a.get(j).tuacd) > 0)
					Collections.swap(a, i, j);
			}
		}
	}

	public void XuatToanBo() {
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
	}
}
