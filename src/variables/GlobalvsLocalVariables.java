package variables;

public class GlobalvsLocalVariables {
	
	//Global Variables -- Class Variables
	String name = "Tom";
	int age = 25;

	public static void main(String[] args) {
		int i =10; //Local Variable for main() method
		
		System.out.println(i);
		
		GlobalvsLocalVariables obj = new GlobalvsLocalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
				
	}
	
	public void sum() {
		
		//Local variables
		int i = 10; //this is local variable for sum() method
		int j = 20;
		int k = 30;
		
	}

}
