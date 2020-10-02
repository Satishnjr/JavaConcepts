package variables;

public class CommandLine {
	
	
	
		public static void main(String[] args)
		 {
		 	int a,b,add,sub,div,mul;
		 	float c,d,add2,sub2,mul2,div2;
		 	
		 	a = 1;
		 	b = 2;
		 	c = 3;
		 	d = 4;
		
			System.out.println("Arithmetic operation with integer");
			add=a+b;
			System.out.println("The addition is:"+add);
			sub=a-b;
			System.out.println("The subtraction is:"+sub);
			mul=a*b;
			System.out.println("The multiplication is:"+mul);
			div=a/b;
			System.out.println("The division is:"+div);
			System.out.println();
			
			System.out.println("Arithmetic operation with float type");
			add2=c+d;
			System.out.println("The addition is:"+add2);
			sub2=a-b;
			System.out.println("The subtraction is:"+sub2);
			mul2=a*b;
			System.out.println("The multiplication is:"+mul2);
			div2=a/b;
			System.out.println("The division is:"+div2);
		 }
	}


