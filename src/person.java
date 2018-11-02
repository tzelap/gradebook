import java.util.UUID;

public class person {
	private String first, last;
	private UUID ident;
	
	public person(String fname, String lname){
		first = fname;
		last = lname;
		ident = UUID.randomUUID();
		
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
	public UUID getId() {
		return this.ident;
	}
	public void setId(UUID id) {
		this.ident = id;
	}
	
}
