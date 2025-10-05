import java.util.Scanner;

class binary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int dec = sc.nextInt();
        
        int num = dec;
        String bin = ""; // use String to build binary
        
        if(num == 0) {
            bin = "0";
        }
        
        while(num != 0) {
            int digit = num % 2;
            bin = digit + bin; // prepend the digit
            num /= 2;
        }
        
        System.out.println("The binary value of " + dec + " is = " + bin);
        sc.close();
    }
}
