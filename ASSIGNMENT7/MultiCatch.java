import java.util.Scanner;

public class MultiCatch {
public static void main(String[] args) {
        		Scanner sc = new Scanner(System.in);

        		try {
            		System.out.print("Enter the first number: ");
            		int a = sc.nextInt();
            		System.out.print("Enter the second number: ");
            		int b = sc.nextInt();

            		int result = a / b;
            		System.out.println("Result of division: " + result);

            		int[] arr = {10, 20, 30};
            		System.out.print("Enter an array index to access: ");
            		int index = sc.nextInt();
            		System.out.println("Element at index " + index + ": " + arr[index]);
} 
catch (ArithmeticException e) {
            		System.out.println("Error: Division by zero is not allowed.");
        		} 
catch (ArrayIndexOutOfBoundsException e) {
            		System.out.println("Error: Invalid array index.");
        		} 
    	}
}