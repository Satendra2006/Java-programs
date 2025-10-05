import java.util.Scanner;
class days
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of the day (1-7):");
        int day=sc.nextInt();
        String dayName;
        switch(day)
        {
            case 1:
                dayName="Monday";
                break;
            case 2:
                dayName="Tuesday";
                break;
            case 3:
                dayName="Wednesday";
                break;
            case 4:
                dayName="Thursday";
                break;
            case 5:
                dayName="Friday";
                break;
            case 6:
                dayName="Saturday";
                break;
            case 7:
                dayName="Sunday";
                break;
            default:
                dayName="Invalid input! Please enter a number between 1 and 7.";
        }
        System.out.println("The day is: "+dayName);
    }
}