package oops_concepts;

public class Classroom {

	private String sub1;
	private int stdCount1;
	
	
	public String getSub() {
		return sub1;
	}


	public void setSub(String sub) {
		this.sub1 = sub;
	}


	public int getStdCount() {
		return stdCount1;
	}


	public void setStdCount(int stdCount) {
		this.stdCount1 = stdCount;
	}


	public void displayDetails() {
		System.out.println("This is a " + sub1 + " classroom and it has " + stdCount1 + " students");
	}
	
}

