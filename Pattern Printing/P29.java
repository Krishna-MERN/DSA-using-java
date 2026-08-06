//            *
//          * * *
//        * * * * *
//      * * * * * * *
//    * * * * * * * * *
//  * * * * * * * * * * *


// METHOD 1

import java.util.Scanner;

public class P29{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = sc.nextInt();
        for (int i = 1 ; i <= size ; i++) {

            for(int k = 1 ; k <= size-i; k++ ) {
                System.out.print("  ");
            }

            for (int j = 1 ; j <= 2*i-1; j++ ){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}