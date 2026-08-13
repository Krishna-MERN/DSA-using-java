package Array;

// Array is a linear data structure.

public class P1 {
    public static void main(String[] args) {
        
    // declearing array
    int [] arr = {2,5,6,3,9,5};
    System.out.print(arr[1]);     // this will print 5 
    // printing array elemets
    for (int i =0 ; i< arr.length ; i++){
        System.out.println(arr[i]+ ",");
    }

    // updating element
    System.out.println("before update 3rd element : "+arr[2]); // before updating
    arr[2] = 9; // updation
    System.out.println("After update 3rd element : "+arr[2]); // after updation
    }
}
