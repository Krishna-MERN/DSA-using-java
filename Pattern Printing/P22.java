// Print

//         * 
//       * * 
//     * * * 
//   * * * * 
// * * * * * 

// method 1 

import java.util.Scanner;

public class P22 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = sc.nextInt();
        for (int i = 1 ; i <=size ; i++){
            for (int j = 1; j <= size ; j++ ){
                if(i+j > size){
                System.out.print("*"+" ");
                }else{
                    System.out.print(" " +" ");
                }
           
                
            }
            System.out.println();
        }
    }
}
