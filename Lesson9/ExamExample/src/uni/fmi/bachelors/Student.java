package uni.fmi.bachelors;

public class Student extends APerson{
	double avgGrade;
	
	public Student(String name, String gender, String egn, double avgGrade) {
		super(name, gender, egn);
		this.avgGrade = avgGrade;
	}

	public double getGrades() {
		return avgGrade;
	}

	public void setGrades(double avgGrade) {
		this.avgGrade = avgGrade;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Average Grade: " + avgGrade);
	}
}
