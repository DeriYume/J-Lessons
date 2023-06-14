package uni.fmi.bachelors;

import java.util.ArrayList;

public class Student extends Person {
	private int year;
	private ArrayList<Subject> grades;

	public Student(String name, String gender, int year){
		super(name, gender);
		this.year = year;
		grades = new ArrayList<>();
	}
	
	public void printAllGrades(){
		for (Subject sub: grades){
			System.out.println(sub.toString());
		}
	}
	
	public void addGrade(String subject, int grade){
		Subject s = new Subject(subject, grade);
		
		for (int i = 0 ; i < grades.size() ; i++){
			if (grades.get(i).getName().equals(subject)){
				if (grades.get(i).getGrade() < grade){
					grades.remove(i);
					grades.add(s);
					
					return;
				}
			}
		}
		
		grades.add(s);
	}
}