import java.util.Scanner;

public class AllNumberPattern {

    static void NumberDiamond(int n) {

        System.out.println("Number Diamond Pattern ");

        int spaces = n-1;
        int stars = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {

                if(i==j){
                    for(int k=i; k>=1; k--){
                        System.out.print(k);
                    }
                    break;
                }
                System.out.print(j);
            }
            System.out.println();

           spaces--;
           stars += 2;
        }

        System.out.println();
    }
    
    static void SnakeNumberPattern(int n) {

        System.out.println("Sanke Number Pattern ");

        for (int i = 1; i <= n; i++) {
           
            //odd lines
            if(i%2 != 0){
                int num = n*(i-1)+1;
                for(int j=1; j<=n; j++){
                    System.out.print(num++ + " ");
                }
            }
            else{
                int num = n * i;
                for (int j = 1; j <= n; j++) {
                    System.out.print(num-- + " ");
                }
            }

            System.out.println();

        }

        System.out.println();
    }



    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter n : " );
        int n = scn.nextInt();

        NumberDiamond(n);
        SnakeNumberPattern(n);
    }
}
