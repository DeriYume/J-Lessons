package uni.fmi.bachelors;

public class MainClass {
	public static void main(String[] args) {
		Student s = new Student("Joe", "male", 4);
		//System.out.println(s.toString());
		
		s.addGrade("Math", 3);
		s.addGrade("OOP", 6);
		s.addGrade("C#", 5);
		s.addGrade("Math", 6);
		
		s.printAllGrades();
	}
}