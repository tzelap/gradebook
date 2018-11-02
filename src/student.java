import java.util.ArrayList;

public class student extends person {
	
	
	private double gpa;
	
	private ArrayList<Integer> courses = new ArrayList<>();
	
	public student(String fname, String lname) {
		super(fname, lname);
		
	}
	
	
	
	public double getGpa() {
		return this.gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public void addCourse() {
		
	}

}