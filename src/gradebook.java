import java.util.ArrayList;
import java.util.HashMap;

public class gradebook{
	
	private HashMap<student, ArrayList<assignment>> gradebook = new HashMap<>();
	private double maxpoints = 0;
	private ArrayList<assignment> masterlist = new ArrayList<>();
	private int numStudents;
	
	public gradebook(int numStudents) {
		this.numStudents = numStudents;
	}
	
	public void addAssn(assignment e) {
		masterlist.add(e);
		maxpoints += e.getWeight();
	}
	
	public void addGrade(student stud, assignment assn ) {
		gradebook.get(stud).add(assn);
		
	}
	public void calcGrade() {
		
	}
}
