package uni.fmi.bachelors;

public class MainClass {

	public static void main(String[] args) {
		Student stu = new Student("2356467", 22, 6);
		
		stu.setName("George Hlills");
		
		stu.printInfo();
		
		stu.fillGrades();
		
		System.out.println(stu.getAverageGrade());
	}

}
