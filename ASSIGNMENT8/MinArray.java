import java.util.Scanner;

class MinFinder extends Thread {
    int[] arr;
    int start, end;
    static int globalMin = Integer.MAX_VALUE;
    static final Object lock = new Object();

    MinFinder(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    public void run() {
        int localMin = Integer.MAX_VALUE;
        System.out.println(getName() + " checking from index " + start + " to " + end);
        for (int i = start; i <= end; i++) {
            if (arr[i] < localMin) localMin = arr[i];
        }

        synchronized (lock) {
            if (localMin < globalMin) globalMin = localMin;
            System.out.println(getName() + " finished. Local Min = " + localMin + ", Global Min = " + globalMin);
        }
    }
}

public class MinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter number of threads: ");
        int m = sc.nextInt();
        MinFinder[] threads = new MinFinder[m];
        int part = n / m;
        int start = 0;

        for (int i = 0; i < m; i++) {
            int end = (i == m - 1) ? (n - 1) : (start + part - 1);
            threads[i] = new MinFinder(arr, start, end);
            threads[i].setName("Thread-" + (i + 1));
            threads[i].start();
            start = end + 1;
        }

        for (int i = 0; i < m; i++) {
            try { threads[i].join(); } catch (Exception e) {}
        }
        System.out.println("Minimum element in the array = " + MinFinder.globalMin);
    }
}
