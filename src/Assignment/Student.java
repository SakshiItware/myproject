package Assignment;

public class Student {
	
	int rollno;
	String name;
	

	public static void main(String[] args) {
		Student stud = new Student();
		stud.setstudentInfo(85, "Sakshi");
		stud.getstudentInfo();
		
	}
	
	public void setstudentInfo(int sRoll, String sName) {
		rollno = sRoll;
		name = sName;
	
	}
	
	public void getstudentInfo() {
		System.out.println("Student roll no is " + rollno);
		System.out.println("Student name is " + name);
	}

}
