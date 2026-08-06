// Print

//           1 
//         1 2 3 
//       1 2 3 4 5 
//     1 2 3 4 5 6 7 
//   1 2 3 4 5 6 7 8 9 
// 1 2 3 4 5 6 7 8 9 10 11 

import java.util.Scanner;

public class P31 {
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
                System.out.print(k +" ");
                
            }
            nsp--;
            nst = nst+2;
            System.out.println();
        }

    }
}

