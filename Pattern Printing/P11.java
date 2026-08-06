// print
// A 
// A B 
// A B C 
// A B C D 
// A B C D E 
// A B C D E F 


import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter size : ");
        int size = sc.nextInt();
        for (int i =1 ; i<=size ; i++){
            for (int j = 1 ; j<= i ; j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}


//  System.out.print((char)(j+64)+" "); for 
// A 
// A B 
// A B C 
// A B C D 
// A B C D E 

//  System.out.print((char)(i+64)+" "); for
// A
// B B 
// C C C 
// D D D D
// E E E E E
