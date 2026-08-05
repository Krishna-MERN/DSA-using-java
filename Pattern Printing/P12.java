import java.util.Scanner;
public class P12{
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = sc.nextInt();
        for (int i = 1 ; i <= size ; i++){
            for (int j = 1 ; j <= i ; j++){
                if (i%2 == 0){
                    System.out.print((char)(j+64) +" ");
                }else{
                    System.out.print(j +" ");
                }
            }
            System.out.println();
        }
    }
}