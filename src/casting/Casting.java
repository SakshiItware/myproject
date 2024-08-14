package casting;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte a=9;//-128 127
		System.out.println(a);//data loss-->No
		float b=a;// memory--->loss, increase
		System.out.println(b);//wideing casting
		System.out.println("=========================");
		
		//explicit
		
		float x=99.99f;
		System.out.println(x);
		
		byte y=(byte) x;//memory-->save, decrease
		System.out.println(y);//narrowing

	}

}
