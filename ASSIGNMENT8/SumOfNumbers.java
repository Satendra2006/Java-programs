import java.util.Scanner;

class SumThread extends Thread {
    int start, end;
    static int total = 0;
    static final Object lock = new Object();

    SumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        int sum = 0;
        System.out.println(getName() + " adding numbers from " + start + " to " + end);
        for (int i = start; i <= end; i++) sum += i;

        synchronized (lock) {
            total += sum;
            System.out.println(getName() + " finished. Partial sum = " + sum + ", Total = " + total);
        }
    }
}

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter number of threads: ");
        int m = sc.nextInt();

        SumThread[] t = new SumThread[m];
        int part = n / m;
        int start = 1;

        for (int i = 0; i < m; i++) {
            int end = (i == m - 1) ? n : (start + part - 1);
            t[i] = new SumThread(start, end);
            t[i].setName("Thread-" + (i + 1));
            t[i].start();
            start = end + 1;
        }

        for (int i = 0; i < m; i++) {
            try { t[i].join(); } catch (Exception e) {}
        }
        System.out.println("Final Sum of first " + n + " natural numbers = " + SumThread.total);
    }
}
