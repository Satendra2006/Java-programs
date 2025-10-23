import java.util.Scanner;

public class MeasureExcep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int feet = 0, inches = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print("Enter feet: ");
                String feetInput = sc.next();
                feet = Integer.parseInt(feetInput);
                if (feet < 0) throw new NumberFormatException("Negative number not allowed.");

                System.out.print("Enter inches: ");
                String inchInput = sc.next();
                inches = Integer.parseInt(inchInput);
                if (inches < 0) throw new NumberFormatException("Negative number not allowed.");

                valid = true;

            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + e.getMessage() + " Please enter non-negative integers.");
            }
        }

        double totalInches = feet * 12 + inches;
        double cm = totalInches * 2.54;
        System.out.println("Equivalent length in centimetres: " + cm);

        sc.close();
    }
}