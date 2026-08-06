// print 

// A B C D E F 
// A B C D E F 
// A B C D E F 
// A B C D E F 
// A B C D E F 
// A B C D E F 
import java.util.Scanner;

public class P4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of size : ");
        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
        }
    }
