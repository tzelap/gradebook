import java.util.ArrayList;
import java.util.HashMap;

public class gradebook{
	private HashMap<student, ArrayList<assignment>> gradebook = new HashMap<>();
	private int courseId;
	private int sectionId;
	private int teacherId;
	private double points = 0;
	private ArrayList<assignment> masterlist = new ArrayList<>();
	
	public gradebook(int cid, int sid, int tid) {
		courseId = cid;
		sectionId = sid;
		teacherId = tid;
	}
	
	public int getTeach() {
		return teacherId;
	}
	public void setTeach(int id) {
		teacherId = id;
	}
	public int getCourse() {
		return courseId;
	}
	public void setCourse(int id) {
		courseId = id;
	}
	public int getSect() {
		return sectionId; 
	}
	public void setSect(int id) {
		sectionId = id;
	}
	public void addAssn(assignment e) {
		masterlist.add(e);
		points += e.getWeight();
	}
	
	public void addGrade(student stud, assignment assn ) {
		gradebook.get(stud).add(assn);
		
	}
	public void calcGrade() {
		
	}
}
