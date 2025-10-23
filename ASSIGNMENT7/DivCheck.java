import java.util.Scanner;
class DivCheck {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
System.out.print("Enter the first number: ");
		int n1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		int n2 = sc.nextInt();
		
		try {
			double res = n1 / (n1-n2);
			System.out.println("Result: "+res);
		}
		
		catch (ArithmeticException e) {
			System.out.println("Error: "+e+" Can't divide by 0!");
		}
	}
}