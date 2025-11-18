package DataStructure.Strings.InterviewProblem;

public class BalancedString {
    public static void main(String[] args) {
        String s="{[]()}";
        System.out.println(balanced(s));
    }

    static String removeChars(String s){
        String s1="";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='[' || c==']' || c=='{' || c=='}' || c=='(' || c==')'){
                s1 += c;
            }
        }
        return s1;
    }

    static boolean balanced(String s){
        s = removeChars(s);
        while (s.contains("[]") || s.contains("{}") || s.contains("()")) {
            s = s.replace("[]", "");
            s = s.replace("{}","");
            s = s.replace("()","");
        }
        return s.length()==0;
    }
}
