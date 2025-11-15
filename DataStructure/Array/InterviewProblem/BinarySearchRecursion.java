package DataStructure.Array.InterviewProblem;

public class BinarySearchRecursion {

    static int binarySeach(int []arr, int start, int end, int target){

        if(start > end) return -1;

        int mid = start + (end-start)/2;

        if(target == arr[mid]) return mid;

        else if(arr[mid] > target) return binarySeach(arr, start, mid-1, target);
        else return binarySeach(arr, mid+1, end, target);

    }

    public static void main(String[] args) {

        int [] a = {1,3,4,2,4,2};
        int s = 0;
        int e = a.length-1;

        int result = binarySeach(a, s, e , 3);
        if(result != -1){
            System.out.println("Found at index : " + result);
        }else{
            System.out.println("Not Found!!");
        }

    }

}
