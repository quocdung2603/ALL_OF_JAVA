package Bai5.Employee;

public class Employee {
	String id,fname;
	int yearj,numberdo;
	double salary;
	
	 public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String id, String fname, int yearj, int numberdo, double salary) {
		super();
		this.id = id;
		this.fname = fname;
		this.yearj = yearj;
		this.numberdo = numberdo;
		this.salary = salary;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public int getYearj() {
		return yearj;
	}

	public void setYearj(int yearj) {
		this.yearj = yearj;
	}

	public int getNumberdo() {
		return numberdo;
	}

	public void setNumberdo(int numberdo) {
		this.numberdo = numberdo;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSenioritySalary()
	{
		if(this.getYearj() >=5)
			return this.getYearj() * 1150*1.0 /100;
		else 
			return 0;
	}
	public String considerEmulation()
	{
		if(this.getNumberdo() <=1) return "A";
		else if(this.getNumberdo()<=2) return "B";
		else return "C";
	}
	public double getSalarys()
	{
		double emulationcoefficient=0;
		if(considerEmulation() =="A") emulationcoefficient=1.0;
		else if(considerEmulation()=="B") emulationcoefficient=0.75;
		else emulationcoefficient = 0.5;
		return 1150*this.getSalary()*emulationcoefficient + this.getSenioritySalary();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", yearj=" + yearj + ", numberdo=" + numberdo + ", salary="
				+ salary + ", getSalarys()=" + getSalarys() + "]";
	}
	
}