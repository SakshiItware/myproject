package Assignment;

public class Result extends Marks {
	
	int total;

	public static void main(String[] args) {
		Student stud = new Student();
		stud.setstudentInfo(85, "Sakshi");
		stud.getstudentInfo();
		
		Marks marks = new Marks();
		marks.setMarks(80, 70);
		marks.getMark();
		
		Result result = new Result();
		result.setMarks(80, 70);
		result.calculate();
		result.getresult();
	}
	
	public void calculate() {
		total = mark1 + mark2;
		
	}
	
	public void getresult() {
		System.out.println("Total marks for student " + total);
	}
		
		

	}


