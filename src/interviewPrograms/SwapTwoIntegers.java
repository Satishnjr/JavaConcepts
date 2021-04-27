package interviewPrograms;

public class SwapTwoIntegers {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;

		// 1. with using third variable : t
		int t;
		t = x; // 10
		x = y; // 20
		y = t; // 10

		// 2. without using third variable : using + operator
		x = x + y; // 10+20=30
		y = x - y; // 30-20=10
		x = x - y; // 30-10=20

		// 3. without using third variable : using * operator
		x = x * y; // 10*20=200
		y = x / y; // 200/20=10
		x = x / y; // 200/10=20

		// 4. without using third variable : using ^(XOR-bitwise) operator
		x = x ^ y; // 30-->10100(binary number)
		y = x ^ y; // 10-->1010
		x = x ^ y; // 20

		System.out.println(x);
		System.out.println(y);
	}
}
