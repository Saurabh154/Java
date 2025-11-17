package DataStructure.Strings.InterviewProblem;

public class ToUpperLowerCase {

    static void ToLowerCase(String s){
        // ABCDE -> abcde
        char []a = s.toCharArray();
        String str="";
        for(int i=0; i<a.length; i++){
            str += (char)(a[i] + 32);
        }
        System.out.println(str);
    }

    static void ToUpperCase(String s){
        // abcde -> ABCDE
        char []a = s.toCharArray();
        String str="";
        for(int i=0; i<a.length; i++){
            str += (char)(a[i] - 32);
        }
        System.out.println(str);
    }

    public static void main(String[] args) {

        System.out.print("To Lower Case ");
        ToLowerCase("HELLO");

        System.out.print("To Upper Case ");
        ToUpperCase("hello");

    }
}
