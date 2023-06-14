package uni.fmi.bachelors;

public class Subject{
	private String name;
	private int grade;
	
	public Subject(String name, int grade){
		this.name = name;
		this.grade = grade;
	}
	
	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public int getGrade(){
		return grade;
	}

	public void setGrade(int grade){
		this.grade = grade;
	}
	
	private String gradeToText(){
		switch(grade){
			case 6: return "Excellent!";
			case 5: return "Very Good!";
			case 4: return "Good!";
			case 3: return "Average!";
			case 2: return "Poor!";
			case 1: return "2Bad4You!";
			default: return "Error!";
		}
	}
	
	@Override
	public String toString(){
		return name + ": " + grade + " - " + gradeToText();
	}
}
