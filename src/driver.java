
public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		discipline math = new discipline("Mathematics");
		math.addCourse("Calculus");
		course tmp = math.getCourse("Calculus");
		System.out.println("Course code: " + tmp.code);
		person p = new person("Edmund", "Law");
		assignment a = new assignment(null);
		a.setOwner(p);
		
	}

}
