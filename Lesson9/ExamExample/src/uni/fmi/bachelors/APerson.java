package uni.fmi.bachelors;

public abstract class APerson {
	
	private String name, gender, egn;
	
	
	public APerson(String name, String gender, String egn) {
		this.name = name;
		this.gender = gender;
		this.egn = egn;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getEgn() {
		return egn;
	}
	
	public void setEgn(String egn) {
		this.egn = egn;
	}
	
	public void printInfo() {
		System.out.println("===INFO===");
		System.out.println("Name: " + name);
		System.out.println("gender: " + gender);
		System.out.println("egn: " + egn);
	}
}
