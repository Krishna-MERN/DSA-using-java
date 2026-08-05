
import java.util.Scanner;

// 04/08/2026   

// Printing the rectunguler star.


public class P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter no of Rows");
        int rows = sc.nextInt();
        System.out.println("Enter no of Rows");
        int column = sc.nextInt();
        for (int i = 0 ; i < rows ; i++){      // first loop runs for Rows 
            for (int j = 0 ; j < column ; j++){          // second loop runs for column
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}