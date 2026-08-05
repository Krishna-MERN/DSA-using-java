// Print following trangle using user input 
//  * 
//  *  * 
//  *  *  * 
//  *  *  *  * 
//  *  *  *  *  * 


import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of pattern : ");
        int size = sc.nextInt();
        for (int i = 1 ; i <= size ; i++){
            for (int j=1 ; j <= i ; j++){
            System.out.print(" * ");
        }
    System.out.println();
    }
    }
}
