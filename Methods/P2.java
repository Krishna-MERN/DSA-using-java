// finding largest no among of 3 no


package Methods;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b , c ;
        System.out.print("Enter a : ");
        a = sc.nextInt();
        System.out.print("Enter b : ");
        b = sc.nextInt();
        System.out.print("Enter c : ");
        c = sc.nextInt();
        if(a > b && a > c ){
            System.out.println("Greatest no is : " + a);
        }else if(b > c ){
            System.out.println("Greatest no is : "+b);
        }else{
            System.out.println("Greatest no is " + c);
        }

        
    }
}
