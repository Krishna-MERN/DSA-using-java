
import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Size of pattern : ");
        int size = scan.nextInt();
        for (int i = 1 ; i <= size ; i++ ){
            for (int j = 1 ; j <= size ; j++){
                System.out.print((char)(j+96) + " ");
            }
            System.out.println();
        }
    }
}
