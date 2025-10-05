import java.util.Scanner;
class Average {
    public void calAvg(int a, int b, int c) {
        double avg = (a + b + c) / 3.0;
        System.out.println("The avgerage is " + avg);
    }
}
class AverageMain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int n3 = sc.nextInt();
        Average avgObj = new Average();
        avgObj.calAvg(n1, n2, n3);
    }
}