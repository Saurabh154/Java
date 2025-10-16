package Collections.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class Demo {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>();

        arr.add(12);
        arr.add(10);
        arr.add(30);
        arr.add(20);
        arr.add(50);
        
        // System.out.println(arr);

        for(int e : arr){
            System.out.print(e + " ");
        }

        System.out.println();
        arr.add(2, 100);
        System.out.println(arr);

        System.out.println(arr.get(2));
        System.out.println(arr.get(1));
        System.out.println(arr.get(4));

        System.out.println("Modifying the array element");

        System.out.println(arr.set(0, 1000));
        System.out.println(arr.set(4, 2000));

        System.out.println(arr);

        System.out.println("Removeing an element from index");
        System.out.println(arr.remove(2));
        System.out.println(arr.remove(1));
        System.out.println(arr.remove(1));
        System.out.println(arr);

        System.out.println("Remove element from list");
        System.out.println(arr.remove(Integer.valueOf(1000)));
        System.out.println(arr);
        

        System.out.println(arr.remove(Integer.valueOf(1000)));
        System.out.println(arr);

        System.out.println("Checking an element does exist or not");

        System.out.println(arr.contains(50));
        System.out.println(arr.contains(1000));

        System.out.println("sorting array element using collections");
        Collections.sort(arr);
        System.out.println("Sorted array : " + arr);
        
        arr.add(20);
        arr.add(10);
        arr.add(90);

        Collections.sort(arr);
        System.out.println(arr);

        Collections.reverse(arr);
        System.out.println(arr);
    }
}
