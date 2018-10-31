
public class course {
	
	private String name;
	private int year;
	private int semester; //0 is fall, 1 is winter, 2 is spring, 4 is summer
	private int courseId;
	private int sectionId;
	
	public course(String name, int year, int semester) {
		this.name = name;
		this.year = year;
		this.semester = semester;
	}
	
}
