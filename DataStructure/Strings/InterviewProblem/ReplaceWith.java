package DataStructure.Strings.InterviewProblem;

public class ReplaceWith {
    public static void main(String[] args) {

        // i/p : Hello World  o/p : llo - xx

        String s = "Hello World";
        char [] str = s.replace(" ", "").toLowerCase().toCharArray();
        char []a = {'l','l','o'};
        String res="";

        int i=0;
        int j=0;

        while(i<str.length && j<a.length){
            if(str[i] == a[j]){
                j++;
            }
            i++;
        }






    }
}
