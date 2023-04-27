package quanliappicar;

public class Honda implements Icar {

	public Honda() {

	}

	@Override
	public String getName() {
		return "Brio";
	}

	@Override
	public int YearOfManuFacture() {
		return 2019;
	}

	@Override
	public String getColor() {
		return "Red, Blue, Black, Gray, White";

	}

	
}
