package Methods;

// pass by value and pass by referance
public class P11 {
    public static void change(int x ) {
        System.out.println(x);
        x = 16;
        System.out.println(x);
        
    }
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);
        change(x);
        System.out.println(x);
        
    }
    
}
