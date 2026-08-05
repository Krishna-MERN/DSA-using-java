//  Print following pattern using user input
// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5 
// 1 2 3 4 5 6 
// 1 2 3 4 5 6 7 



import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of pattern : ");
        int size = sc.nextInt();
        for (int i = 1 ; i <= size ; i++){
            for (int j=1 ; j <= i ; j++){
            System.out.print(j +" ");
        }
    System.out.println();
    }
    }
}
