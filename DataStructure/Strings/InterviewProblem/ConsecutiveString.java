package DataStructure.Strings.InterviewProblem;

import java.util.Stack;

public class ConsecutiveString {
    public static void main(String[] args) {

        String s = "success";
        Stack<Character> st = new Stack<>();

        st.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!st.isEmpty() && st.peek() == ch) {
                continue;
            } else {
                st.push(ch);
            }
        }

        String res = "";
        for (char c : st) {
            res += c;
        }

        System.out.println(res);
    }
}
