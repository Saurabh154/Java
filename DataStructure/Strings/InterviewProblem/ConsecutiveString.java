package DataStructure.Strings.InterviewProblem;

public class ConsecutiveString {
    public static void main(String[] args) {

        // s = abbcccdde
        // s = abcde

        String s = "success";  // suces


        // logic - stack

        String res="";

        int[] a = new int[26];

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int index = (int)ch - 97;
            a[index]++;
        }

        for(int i=0; i<a.length; i++){
            char ch = (char)(i + 97);
            if(a[i] != 0){
                res += ch;
            }
        }

        System.out.println(res);

    }
}
