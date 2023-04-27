package quanliappicar;

public class IcarFC {
	
	public IcarFC() {
		// TODO Auto-generated constructor stub
	}
	
	public void ViewCar(String type)
	{
		if(type.toLowerCase().compareTo("honda")==0)
		{
			Honda k = new Honda();
			System.out.println(k.getName() + '\n' + k.YearOfManuFacture() + '\n' + k.getColor());
		}
		else if(type.toLowerCase().compareTo("toyota")==0)
		{
			Toyota k = new Toyota();
			System.out.println(k.getName() + '\n' + k.YearOfManuFacture() + '\n' + k.getColor());
		}
			
	}
}
