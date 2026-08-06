// print 

// A A A A A A A 
// B B B B B B B 
// C C C C C C C 
// D D D D D D D 
// E E E E E E E 
// F F F F F F F 
// G G G G G G G 
import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Size : ");
        int size = sc.nextInt();
        for (int i = 1 ; i<=size ; i++){
            for (int j = 1 ; j <= size ; j++){
                System.out.print((char)(i+64) +" ");

        }
        System.out.println();
    }

    }
}


