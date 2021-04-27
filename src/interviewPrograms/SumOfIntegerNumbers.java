package interviewPrograms;

import java.util.Scanner;

public class SumOfIntegerNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = scan.nextInt();
		int sum = 0;
		while (num > 0) {
			sum = sum + (num % 10);
			num = num / 10;
		}
		System.out.println("Sum of digits in a number: " + sum);
	}
}
