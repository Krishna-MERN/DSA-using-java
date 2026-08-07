package Methods;


// finding maximum using methods

import java.util.Scanner;

public class P3 {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int a , b , c ,d ;
        System.out.print("Enter a : ");
        a = sc.nextInt();
        System.out.print("Enter b : ");
        b = sc.nextInt();
        System.out.print("Enter c : ");
        c = sc.nextInt();
        System.out.print("Enter c : ");
        d = sc.nextInt();
        
        System.out.println(Math.max(Math.max(Math.max(a,b) , c),d));
   } 
}
