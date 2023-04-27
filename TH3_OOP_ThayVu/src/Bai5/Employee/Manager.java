package Bai5.Employee;

public class Manager extends Employee {
	String position;
	double coefficientsSalary;
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(String id, String fname, int yearj, int numberdo, double salary , String position , double coefficientsSalary) {
		super(id, fname, yearj, numberdo, salary);
		// TODO Auto-generated constructor stub
		this.position = position;
		this.coefficientsSalary = coefficientsSalary;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getCoefficientsSalary() {
		return coefficientsSalary;
	}

	public void setCoefficientsSalary(double coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}

	@Override
	public String considerEmulation() {
		return "A";
	}
	public double bonusByPosition()
	{
		return 	1150 * this.getCoefficientsSalary();
	}

	@Override
	public double getSalarys() {
		// TODO Auto-generated method stub
		return super.getSalarys() + this.bonusByPosition();
	}

	@Override
	public String toString() {
		return "Manager [position=" + position + ", coefficientsSalary=" + coefficientsSalary + ", id=" + id
				+ ", fname=" + fname + ", yearj=" + yearj + ", numberdo=" + numberdo + ", salary=" + salary
				+ ", getSalarys()=" + getSalarys() + "]";
	}
	
}
