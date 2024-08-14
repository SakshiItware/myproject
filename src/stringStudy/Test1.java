package stringStudy;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s="Velocity";// without using new keyword--> constant pool area
	String s1="Velocity";
	String s2="Vel";
	String s3="Test";
	
	String m= new String("Velocity");
	// using new keyword--> non-csonstant pool area
	String m1= new String("Velocity"),
	String  = new String ("VELOCITY");
	String m3= new String ("");
	String m4= new String ("Java classes");
	
	
	System.out.println(s==s1);//true
	System.out.println(s==m);//false
	System.out.println(m1.equals(m));//true 
	}
	
}
	
