import java.util.Random;
import java.util.UUID;

public class person {
	private String first, last;
	private int id;
	
	
	public person(String fname, String lname){
		first = fname;
		last = lname;
		
		
	}
	public String getName() {
		return this.first +" "+ this.last;
	}
	public void setfName(String fName) {
		this.first = fName;
	}
	public void setlName(String lName) {
		this.last = lName;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
