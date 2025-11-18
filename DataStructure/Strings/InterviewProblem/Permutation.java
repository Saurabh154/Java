package DataStructure.Strings.InterviewProblem;

public class Permutation {

    static String swap(String s, int i, int j){
        char []a = s.toCharArray();
        char ch = a[i];
        a[i] = a[j];
        a[j] = ch;
        return new String(a);
    }

    static void generatePermutation(String s, int start, int end){
        if(start == end){
            System.out.println(s);
            return;
        }

        for(int i=start; i<=end; i++){
            String s1 = swap(s, start, i);
            generatePermutation(s1, start+1, end);
        }
    }

    public static void main(String[] args) {

        String s = "abcd";
        generatePermutation(s, 0, s.length()-1);

    }
}
