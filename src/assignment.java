
public class assignment {
	private String assn;
	private double weight;
	private student student;
	private int courseId;
	private int sectionId;
	private double grade;
	
	
	public assignment(double weight, int cid, int sid) {
		this.weight = weight;
		courseId = cid;
		sectionId = sid;
	}
	public void setStud(student stud) {
		student = stud;
	}
	public double getWeight() {
		return weight;
	}
	
}
