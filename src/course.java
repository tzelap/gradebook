import java.util.ArrayList;
import java.util.UUID;

public class course extends discipline {
	

	private String name;
	private int courseId;
	private ArrayList<section> sec = new ArrayList<>();
	private int numofSections = 0;
	
	public course(String dname, String cname) {
		super(dname);
		this.name = cname;
		
	}
	
	public void addSection(UUID teachID) {
		section s = new section(this.name, numofSections++, teachID);
	}
	
}
