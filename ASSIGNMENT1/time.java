import java.util.Scanner;  
class time
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the time in seconds:");
        int sec=sc.nextInt();
        int hr=sec/3600;
        int rem=sec%3600;
        int min=rem/60;
        int s=rem%60;
        System.out.println("Time is "+hr+" hours "+min+" minutes "+s+" seconds.");
    }
}   