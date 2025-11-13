import java.util.Scanner;

class SquareThread extends Thread {
    int num;
    SquareThread(int n) { num = n; }

    public void run() {
        System.out.println("Square: " + (num * num));
    }
}

class SumThread extends Thread {
    int num;
    SumThread(int n) { num = n; }

    public void run() {
        int sum = 0, temp = num;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}

class TwoThreads {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        SquareThread s1 = new SquareThread(n);
        SumThread s2 = new SumThread(n);
        s1.start();
        s2.start();
    }
}
