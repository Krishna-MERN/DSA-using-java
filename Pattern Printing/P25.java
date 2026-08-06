// print
//         A 
//       B B 
//     C C C 
//   D D D D 
// E E E E E


import java.util.Scanner;

public class P25 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of pattern : ");
        int size = sc.nextInt();
        for (int i = 1 ; i <= size ; i++){

            for (int j=1 ; j <= size-i ; j++){
            System.out.print("  ");
            }
            for (int k=1 ; k <= i ; k++){
            System.out.print( (char)(i+64) +" ");
        }
    System.out.println();
    } 

    }
}
