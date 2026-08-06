// print

// 1 
// 1 3 
// 1 3 5 
// 1 3 5 7 
// 1 3 5 7 9 
// 1 3 5 7 9 11 



import java.util.Scanner;

public class P21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Pattern Size : ");
        int size = sc.nextInt();
        // System.out.print("Enter start point : ");
        // int start = 1;
        for (int i = 1 ; i <=size ; i++){
            for (int j = 1 ; j <= i ; j++){
                // System.out.print(start+" ");
                System.out.print(2*j-1 +" ");
            // start = start +2;
            }
            // start = 1;
            System.out.println();
        }
    }
}
