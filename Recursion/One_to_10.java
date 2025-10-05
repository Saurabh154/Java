package Recursion;

public class One_to_10 {
    static void display(int n){

        if(n>10) return;

        System.out.println(n);
        display(n+1);
    }
    public static void main(String[] args) {
        display(1);
    }
}
