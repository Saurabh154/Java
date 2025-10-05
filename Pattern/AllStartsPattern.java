import java.util.Scanner;

public class AllStartsPattern {

    static void SquareStar(int n) {
        System.out.println("Square Star Pattern ");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
    }

    static void HollowSquareStar(int n) {

        System.out.println("Hollow Square Star Pattern ");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
    }

    static void RightTriangleStar(int n) {

        System.out.println("Right Triangle Star Pattern ");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
    }

    static void MirroredRightTriangleStar(int n) {

        System.out.println("Mirrored Right Triangle Star Pattern ");

        int spaces = n-1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
            spaces--;
        }

        System.out.println();
    }
    
    static void InvertedRightTriangleStar(int n) {

        System.out.println("Inverted Right Triangle Star Pattern ");

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
    }

    static void InvertedMirroredRightTriangleStar(int n) {

        System.out.println("Inverted Mirrored Right Triangle Star Pattern ");

        int spaces = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=spaces-1; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n-spaces+1; j++){
                System.out.print("*");
            }
            System.out.println();
            spaces++;
        }

        System.out.println();
    }
    
    static void PyramidStar(int n) {

        System.out.println("Pyramid Star Pattern ");

        int spaces = n-1;
        int stars = 1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            System.out.println();
            spaces--;
            stars += 2;
        }

        System.out.println();
    }
    
    static void HollowPyramidStar(int n) {

        System.out.println("Hollow Pyramid Star Pattern ");

        int spaces = n-1;
        int stars = 1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=stars; j++){
                if(j==1 || j==stars || i==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
            spaces--;
            stars += 2;
        }

        System.out.println();
    }
    
    static void DiamondStar(int n) {

        System.out.println("Diamond Star Pattern ");

        int spaces = n/2;
        int stars = 1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=stars; j++){
               System.out.print("*");
            }
            System.out.println();

            if (i <= n/2) {
                spaces--;
                stars += 2;
            }
            else {
                spaces++;
                stars -= 2;
            }
        }

        System.out.println();
    }
    
    static void HollowDiamondStar(int n) {

        System.out.println("Hollow Diamond Star Pattern ");

        int spaces = n/2;
        int stars = 1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=stars; j++){
                if(j==1 || j==stars)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();

            if (i <= n/2) {
                spaces--;
                stars += 2;
            }
            else {
                spaces++;
                stars -= 2;
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter n : " );
        int n = scn.nextInt();
        // int n = 7;
        
        // SquareStar(n);
        // HollowSquareStar(n);
        // RightTriangleStar(n);
        // MirroredRightTriangleStar(n);
        // InvertedRightTriangleStar(n);
        // InvertedMirroredRightTriangleStar(n);
        // PyramidStar(n);
        // HollowPyramidStar(n);
        // DiamondStar(n);
        HollowDiamondStar(n);

    }
}
