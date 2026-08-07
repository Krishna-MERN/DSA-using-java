package Methods;

import java.util.Scanner;

public class P8 {
  
    public static int maximum(int a , int  b, int c ){
      if (a>b && a>c ) return a;
      else if (b>c) return b;
      else return c ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int max = maximum(4,10,9);
        System.out.println(max);
    }
}
