package uni.fmi.bachelors;

public class Teacher extends APerson {

	private int salary;
	
	public Teacher(String name, String gender, String egn, int salary) {
		super(name, gender, egn);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Salary: " + salary);
	}
	
}
