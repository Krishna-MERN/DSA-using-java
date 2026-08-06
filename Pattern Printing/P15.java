// Print 

// A B C D E F 
// A B C D E 
// A B C D 
// A B C 
// A B 
// A 


import java.util.Scanner;

public class P15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr size : ");
        int size = sc.nextInt();
        int b = size ; 
        for (int i =1 ;i<=size ; i++){
            for(int j = 1 ; j<= b ; j++){
                System.out.print((char)(j+64)+" ");
            }
            b-- ; 
            System.out.println();
        }
    }
    
}
