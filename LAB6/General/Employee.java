package General;

public class Employee {		
	protected int empid;
	private String ename;
	private double basic;

	public Employee(int empid, String ename, double basic) {
		this.empid = empid;
		this.ename = ename;
		this.basic = basic;
	}

	protected double getBasic() {
		return basic;
	}

	public int getEmpid() {
		return empid;
	}

	public double earnings() {
		double da = basic * 0.80;
		double hra = basic * 0.15;
		return basic + da + hra;
	}
}
