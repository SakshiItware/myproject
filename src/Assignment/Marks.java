package Assignment;

public class Marks  extends Student {
	
	int mark1;
	int mark2;
	

	public static void main(String[] args) {
		
		Marks marks = new Marks();
		marks.setMarks(80,70);
		marks.getMark();
	}
	
	public void setMarks (int m1, int m2) {
		mark1 = m1;
		mark2 = m2;

	}
   public void getMark() {
	   System.out.println("Marks1 "+ mark1);
	   System.out.println("Marks2 "+ mark2);
   }
}
