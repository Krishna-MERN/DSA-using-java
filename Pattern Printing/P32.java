//          *
//        * * *
//      * * * * *
//    * * * * * * *
//  * * * * * * * * *
//    * * * * * * *
//      * * * * *
//        * * *
//          *



import java.util.Scanner;

public class P32 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Size :");
        int size = sc.nextInt();
        
        int nsp = size-1;
        int nst = 1;
        for(int i =1 ; i <= size ; i++){
            for (int j =1 ; j <= nsp; j++){
                System.out.print("  ");
               
            }
            for (int k = 1 ; k <= nst ; k++){
                System.out.print(" *");
                
            }
            nsp--;
            nst = nst+2;
            System.out.println();
        }
        
        nsp = 1;
        nst = 2*size-3;
        for(int i =1 ; i <= size-1 ; i++){
            for (int j =1 ; j <= nsp; j++){
                System.out.print("  ");
               
            }
            for (int k = 1 ; k <= nst ; k++){
                System.out.print(" *");
                
            }
            nsp++;
            nst = nst-2;
            System.out.println();
        }
    }
}

