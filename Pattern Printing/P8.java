// print 
// a a a a a a a 
// B B B B B B B 
// c c c c c c c 
// D D D D D D D 
// e e e e e e e 
// F F F F F F F 
// g g g g g g g 


import java.util.Scanner;

public class P8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Size : ");
        int size = sc.nextInt();

        for (int i = 1; i <= size; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j <= size; j++) {
                    System.out.print((char) (i + 64) + " ");
                }
            } else {
                for (int j = 1; j <= size; j++) {
                    System.out.print((char) (i + 96) + " ");
                }
            }
            System.out.println();
        }
    }
}


