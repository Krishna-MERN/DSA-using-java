package Methods;

import java.util.Scanner;

public class P6 {
    public static void sum(int a, int b ){
        System.out.println(a+b);
    }
    public static void maximum(int a , int  b, int c ){
      if (a>b && a>c ) System.out.println(a);
      else if (b>c) System.out.println(b);
      else System.out.println(c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int b = sc.nextInt();
        sum(a,b);
        maximum(4,2,9);
    }
}
