import java.util.Date;

public class assignment {
	private double points;
	private person owner;
	Date due;
	
	public assignment(Date due) {
		this.due = due;
	}
	public void setOwner(person owner) {
		if (!(owner instanceof teacher || owner instanceof student)){
			System.out.println("User is not a student or teacher, please try again");
		}
		else {
			this.owner = owner;
		}
	}
	public person getOwner() {
		return owner;
	}
	public void setWeight(double points) {
		this.points = points;
	}
	public double getWeight() {
		return points; //place holder
	}
	
}
