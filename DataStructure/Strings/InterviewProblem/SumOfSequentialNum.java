package DataStructure.Strings.InterviewProblem;

public class SumOfSequentialNum {
    public static void main(String[] args) {
        String s = "o4b47c57";
        char [] a = s.toCharArray();
        int sum = 0;
        int num = 0;

        for(char c : a){
            if(c>='0' && c<='9'){
                num = (num*10) + (c-'0');
            }else{
                sum += num;
                num = 0;
            }
        }
        sum += num;

        System.out.println(sum);
    }
}
