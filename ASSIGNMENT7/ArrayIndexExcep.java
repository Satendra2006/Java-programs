import java.util.Scanner;

public class ArrayIndexExcep {
public static void main(String[] args) {
        		Scanner sc = new Scanner(System.in);
		
        		System.out.print("Enter the size of the array: ");
        		int size = sc.nextInt();
        		int[] arr = new int[size];

        		System.out.println("Enter " + size + " elements:");
        		for (int i = 0; i < size; i++) {
            		arr[i] = sc.nextInt();
        		}

        		System.out.println("Array elements are: ");
        		for (int i = 0; i < arr.length; i++) {
            		System.out.print(arr[i] + " ");
        		}

        		try {
System.out.print("\nEnter the index position to access: ");
			int index = sc.nextInt();
            		System.out.println("Element at index " + index + " is: " + arr[index]);
        		} 
		catch (ArrayIndexOutOfBoundsException e) {
            		System.out.println("Error: Invalid index. Please enter an index between 0 and " + (arr.length - 1) + ".");
        		}
    	}
}