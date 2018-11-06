import java.util.HashMap;


public class discipline {
	
	
	protected String disc_name;
	protected int numStudents = 0;
	protected int code;
	private int numcourses = 0;
	private HashMap<String, course> courses = new HashMap<>();
	
	public discipline(String name) {
		disc_name = name;
	}
	public void addCourse(String course_name) {
		if(courses.containsKey(course_name)) {
			System.out.println("Course already exists, please access the course directly to modify");
		}
		else {
			course c = new course(disc_name, course_name);
			courses.put(c.course_name, c);
			c.courseId = ++numcourses;
		}
	}
	public String getDiscName() {
		return disc_name;
	}
	public course getCourse(String course_name) {
		return courses.get(course_name);
	}
}
