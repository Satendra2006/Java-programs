import java.util.Scanner;

public class JaggedArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int[][] jaggedArray = new int[rows][];

        for(int i = 0; i < rows; i++) 
        {
            System.out.print("Enter number of columns for row " + (i+1) + ": ");
            int cols = sc.nextInt();

            jaggedArray[i] = new int[cols];

            System.out.println("Enter elements for row " + (i+1) + ":");
            for(int j = 0; j < cols; j++) 
            {
                jaggedArray[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nJagged Array:");
        for(int i = 0; i < rows; i++) 
        {
            System.out.print("Row " + (i+1) + ": ");
            for(int j = 0; j < jaggedArray[i].length; j++) 
            {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}