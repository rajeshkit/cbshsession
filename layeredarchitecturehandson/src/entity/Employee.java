package entity;

public class Employee {
	private int empNo;
	private String firstName;
	private String city;
	private int salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empNo, String firstName, String city, int salary) {
		super();
		this.empNo = empNo;
		this.firstName = firstName;
		this.city = city;
		this.salary = salary;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
