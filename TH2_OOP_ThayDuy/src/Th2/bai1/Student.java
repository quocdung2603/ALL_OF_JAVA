package Th2.bai1;

import java.util.*;
public class Student {
	private String name,id;
	private double mark;
	public Student()
	{
		
	}
	public Student(String name , String id , double mark)
	{
		setName(name);
		setMark(mark);
		setId(id);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	public void Input()
	{
		Scanner sc = new Scanner(System.in);
		String newname,newid = new String();
		double newmark;
		System.out.println("Name: ");
		newname = sc.nextLine();
		System.out.println("Id: ");
		newid = sc.next();
		System.out.println("Medium Mark: ");
		newmark = sc.nextDouble();
		this.name = newname;
		this.id= newid;
		this.mark= newmark;
	}
	@Override
	public int hashCode() {
		return Objects.hash(mark);
	}
	@Override
	public String toString() {
		return "Student [name=" + this.getName() + ", id=" + this.getId() + ", mark=" + this.getMark() + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Double.doubleToLongBits(mark) == Double.doubleToLongBits(other.mark);
	}
	public void EqualsMediumMark(ArrayList<Student>ds)
	{
		int b[] = new int[ds.size()];
        boolean check=false;
        for(int i=0;i<ds.size();i++)
        {
            if(b[i]==0)
            {
                int kt=0;
                for(int j=i+1;j<ds.size();j++)
                {
                    if(ds.get(i).mark == ds.get(j).mark && b[j]==0)
                    {
                        System.out.println(ds.get(j));
                        b[j]=1;
                        kt++;
                        check=true;
                    }
                }
                if(kt!=0)
                {
                    System.out.println(ds.get(i));
                }
            }
        }
        if(check==false) System.out.println("Khong co sinh vien phu hop.");
	}
	
}
