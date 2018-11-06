import java.util.ArrayList;
import java.util.UUID;

public class course extends discipline {
	

	protected String course_name;
	protected int courseId;
	private ArrayList<section> sec = new ArrayList<>();
	private int numofSections = 0;
	
	public course(String dname, String cname) {
		super(dname);
		course_name = cname;
		
	}
	
	public void addSection(int teachID) {
		section s = new section(super.disc_name, course_name, ++numofSections, teachID);
		sec.add(s);
	}
	
	
	
}
