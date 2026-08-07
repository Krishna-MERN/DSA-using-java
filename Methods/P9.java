package Methods;
// permotation % combination


// Using loops

import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Value of n :");
        int n = sc.nextInt();
        System.out.println("Value of r :");
        int r = sc.nextInt();


        int nFact =1 ;
        int rFact =1 ;
        int nrFact =1 ;
        for (int i =1 ; i <= n ; i++){
            nFact *=i;    
        }
        for (int i =1 ; i <= r ; i++){
            rFact *=i;    
        }
        for (int i =1 ; i <= n-r ; i++){
            nrFact *= i;    
        }
        int nCr = nFact/(rFact*nrFact);
        System.out.println("n Factorial r is : "+nCr);

    }
}
