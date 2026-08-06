// Print
//    * * * * *
//      * * * *
//        * * *
//          * *
//            *

import java.util.Scanner;

public class P28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter size : ");
        int size = sc.nextInt();
        for (int i = 1 ; i <= size ; i++){

              for (int j=1 ; j <= i ; j++){
            System.out.print("  ");
            }
            for(int k = 0 ; k <= size-i ; k++){
                System.out.print(" *");
            }
         
            System.out.println();
        }
    }
}
