// print 
// a b c d e 
// a b c d 
// a b c 
// a b 
// a 



import java.util.Scanner;
public class P14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = sc.nextInt();
        for(int i =1; i<=size ; i++){
            for(int j =1 ; j<= size+1-i ; j++){
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }
    }
}
