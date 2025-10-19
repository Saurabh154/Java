package Array;


import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {


        int[] arr = new int[5];

        arr[0]  = 12;
        arr[1]  = 22;
        arr[2]  = 23;
        arr[3]  = 5;
        arr[4]  = 20;

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

//        System.out.println("Taking input from user");
//        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter the size of the array:");
//        int n = sc.nextInt();
//
//        int[] a = new int[n];
//
//        for(int i=0; i<n; i++){
//            a[i] = sc.nextInt();
//        }
//
//        System.out.println("Elements are present in the array:");
//        for(int i=0; i<n; i++){
//            System.out.println(a[i]);
//        }

        System.out.println("Shallow copy");
        int[] arr2 = arr;
        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }

        arr2[0] = 23;
        
        System.out.println("Changing the array element:");
        System.out.println(arr[0]);

        arr2 = arr.clone();

        for(int i=0; i<arr2.length; i++){
            arr2[i] = 0;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
