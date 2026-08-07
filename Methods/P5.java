package Methods;

public class P5 {
    public static void method3(){
        System.out.println("This is method 3rd");
    }
    public static void main(String[] args) {
        method1();
    }
    public static void method1(){
        System.out.println("this is method 1 , and it will call method 2 ");
        method2();
    }
    public static void method2(){
        method3();    // before printing method 2 it will call method 3 .
        System.out.println("this is method 2  ");
       
    }
    
}
