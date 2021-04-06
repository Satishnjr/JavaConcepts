package arrays;

// - ArrayIndexOutOfBoundsException
//The Java Virtual Machine (JVM) throws an ArrayIndexOutOfBoundsException if length of the array in negative, 
//equal to the array size or greater than the array size while traversing the array.

//Java Program to demonstrate the case of   
//ArrayIndexOutOfBoundsException in a Java Array.  
public class TestArrayException {
	public static void main(String args[]) {
		int arr[] = { 50, 60, 70, 80 };
		for (int i = 0; i <= arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
