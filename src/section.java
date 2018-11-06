import java.util.UUID;

public class section extends course {
	private int section;
	private int teacherId;
	
	public section(String dname, String cname, int section, int teacherId) {
		super(dname, cname);
		this.section = section;
		this.teacherId = teacherId;
	}
	public int getTeach() {
		return teacherId;
	}
	public void setTeach(int id) {
		teacherId = id;
	}
	public int getSection() {
		return section;
	}
	public void setSection(int section) {
		this.section = section;
	}
}
