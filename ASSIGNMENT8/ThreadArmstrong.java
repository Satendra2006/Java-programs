import java.util.Scanner;

class ArmstrongCheck implements Runnable {
    int n;
    ArmstrongCheck(int n) {
        this.n = n;
    }

    public void run() {
        int temp = n, sum = 0, rem;
        while (temp != 0) {
            rem = temp % 10;
            sum += rem * rem * rem;
            temp /= 10;
        }
        if (sum == n)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }
}

class ThreadArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        ArmstrongCheck a = new ArmstrongCheck(n);
        Thread t = new Thread(a);
        t.start();
    }
}