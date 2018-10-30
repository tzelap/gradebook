public class student {
	
	private String firstname;
	private String lastname;
	private double gpa;
	private int id;
	
	public student(String fName, String lName, int id) {
		firstname = fName;
		lastname = lName;
		this.id = id;
	}
	
	public String getName() {
		return this.firstname +" "+ this.lastname;
	}
	public void setfName(String fName) {
		this.firstname = fName;
	}
	public void setlName(String lName) {
		this.lastname = lName;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getGpa() {
		return this.gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	

}