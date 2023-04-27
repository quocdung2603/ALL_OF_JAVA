package bai1.xe;
import java.util.*;
public class XE_fc {
	ArrayList<XE> a = new ArrayList<XE>();
	Scanner sc = new Scanner(System.in);
	public XE_fc() {
	}
	public XE_fc(ArrayList<XE> a)
	{
		this.a = a;
	}
	public ArrayList<XE> getA() {
		return a;
	}
	public void setA(ArrayList<XE> a) {
		this.a = a;
	}
	public void Find()
	{
		System.out.println('\t' + "1. Xe may" + '\n' + '\t' + "2. O to");
		int z= sc.nextInt();
		for(int i=0;i<a.size()-1;i++)
		{
			for(int j=i+1;j<a.size();j++)
			{
				if(a.get(i).gialanbanh > a.get(j).gialanbanh)
				{
					Collections.swap(a,i,j);
				}
			}
		}
		if(z==1)
		{
			for(int i=0;i<a.size();i++)
			{
				if(a.get(i) instanceof XEMAY)
				{
					System.out.println(a.get(i));
				}
			}
		}
		else if(z==2)
		{
			for(int i=0;i<a.size();i++)
			{
				if(a.get(i) instanceof OTO)
				{
					System.out.println(a.get(i));
				}
			}
		}
	}
	
}
