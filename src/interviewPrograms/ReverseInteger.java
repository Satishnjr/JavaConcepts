package interviewPrograms;

public class ReverseInteger {

	public static void main(String[] args) {
		int num = 12345;
		int rev = 0;

		// 1.using algo:
		while (num != 0) {
			rev = rev * 10 + num % 10; // 54321
			num = num / 10;
		}

		System.out.println(rev);

		int num1 = 3545667;

		// 1.using StringBuffer class:
		StringBuffer sb = new StringBuffer(String.valueOf(num1));
		System.out.println(sb.reverse());

	}
}
