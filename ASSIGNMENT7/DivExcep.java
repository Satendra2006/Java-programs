import java.util.Scanner;
class DivExcep {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean valid = false;
		System.out.print("Enter the first number: ");
		int n1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		int n2 = sc.nextInt();		
		try {
			int res = n1 / n2;
			System.out.println("Result is: "+res);
		}
		catch (ArithmeticException e) {
			System.out.println("MathError: Can't be divide by 0!");
		}
	}
}