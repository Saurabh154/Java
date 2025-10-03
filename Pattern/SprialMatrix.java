public class SprialMatrix {

    public static int[][] generateSpiral(int n) {

        int[][] mat = new int[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int num = 1;

        while(num <= n*n){
            
            //left -> right
            for(int c = left; c<=right && num<=n*n; c++){
                mat[top][c] = num++;
            }
            top++;

            // top → bottom
            for (int r = top; r <= bottom && num <= n * n; r++) {
                mat[r][right] = num++;
            }
            right--;

            // right → left
            for (int c = right; c >= left && num <= n * n; c--) {
                mat[bottom][c] = num++;
            }
            bottom--;

            // bottom → top
            for (int r = bottom; r >= top && num <= n * n; r--) {
                mat[r][left] = num++;
            }
            left++;
        }

        return mat;
    }
    public static void main(String[] args) {
        int n = 5; // size of matrix
        // int[][] result = generateSpiral(n);

        int[][] mat = new int[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int num = 1;

        while(num <= n*n){
            
            //left -> right
            for(int c = left; c<=right && num<=n*n; c++){
                mat[top][c] = num++;
            }
            top++;

            // top → bottom
            for (int r = top; r <= bottom && num <= n * n; r++) {
                mat[r][right] = num++;
            }
            right--;

            // right → left
            for (int c = right; c >= left && num <= n * n; c--) {
                mat[bottom][c] = num++;
            }
            bottom--;

            // bottom → top
            for (int r = bottom; r >= top && num <= n * n; r--) {
                mat[r][left] = num++;
            }
            left++;
        }


        // print the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", mat[i][j]); // pretty print
            }
            System.out.println();
        }
    }
}
