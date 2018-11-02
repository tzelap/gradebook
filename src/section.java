import java.util.UUID;

public class section extends course {
	private int section;
	private UUID teacherId;
	
	public section(String name, int section, UUID teacherId) {
		super(name);
		this.section = section;
		this.teacherId = teacherId;
	}
	public UUID getTeach() {
		return teacherId;
	}
	public void setTeach(UUID id) {
		teacherId = id;
	}
}
