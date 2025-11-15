package DataStructure.Array.InterviewProblem;

public class CountEvenSumSubarray {
    public static void main(String[] args) {

        int [] a = {1,2,3}; // 1, 1 , 1

        int n = a.length;
        int count = 0;

        for(int ele : a){
            if(ele%2 == 0) count++;
        }

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += a[j];
                if(sum % 2 == 0){
                    count++;
                }
            }
        }

        System.out.println("Even-sum subarrays : " + count);

    }
}
