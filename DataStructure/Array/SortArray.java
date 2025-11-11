package DataStructure.Array;

public class SortArray {
    public static void main(String[] args) {

        int[] arr = {0,1,0,1,1,0,0,1};

        int n = arr.length-1;
        int i=0;
        int j=n-1;

        while(j<n){
            if(arr[i]==0 && arr[j]!=0){
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
                j--;
            }

            if(arr[i]==0){
                i++;
            }

            if(arr[j]==1){
                j--;
            }

            if(arr[i]==1 && arr[j]==0){
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
                j--;
            }

        }

        for(int k=0; k<n; k++)
        {
            System.out.println(arr[k]);
        }
    }
}
