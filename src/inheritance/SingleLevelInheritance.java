package inheritance;

public class SingleLevelInheritance {

	public static void main(String[] args) {
		
		Mother_java mother= new Mother_java();
		Daughter daughter=new Daughter();
		
         mother.recipe();
         mother.look();
         
         daughter.study();
         daughter.hobbies();
         daughter.recipe();//using sub class object, calling super class method
         daughter.look();//using sub class object,calling super class method
         


	}
	




}






