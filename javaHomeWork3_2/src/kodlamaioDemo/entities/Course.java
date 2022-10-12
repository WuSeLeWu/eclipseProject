package kodlamaioDemo.entities;

public class Course {
	int id;
	String courseName;
	String instructorName;
	double unitPrice;

	public Course() {

	}

	public Course(int id, String courseName, String instructorName, double unitPrice) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.instructorName = instructorName;
		this.unitPrice = unitPrice;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

}
