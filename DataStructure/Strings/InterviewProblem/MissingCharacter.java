package DataStructure.Strings.InterviewProblem;

public class MissingCharacter {
    public static void main(String[] args) {

        String s = "az";

        int []a = new int[26];

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int index = (int)ch - 97;
            a[index]++;
        }

        char start = s.charAt(0);
        char end = s.charAt(s.length()-1);

        String res = "";
        for(int i = ((int)start - 97)+1 ; i<(int)end-97; i++){
            char ch = (char)(i + 97);
            if(a[i] == 0){
                res += ch;
            }
        }

        System.out.println(res);

    }
}
