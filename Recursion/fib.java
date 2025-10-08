package Recursion;

public class fib {
    
    static int m1(int n){

        if(n == 0 || n==1) return n;

        return m1(n-1) + m1(n-2); 
    }
    public static void main(String[] args) {
        
        System.out.println(m1(6));
    }
}
