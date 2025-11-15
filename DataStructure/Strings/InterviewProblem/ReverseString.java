package DataStructure.Strings.InterviewProblem;

public class ReverseString {

    static void reverseString(String s){

        char[] a = s.toCharArray();

        int i=0, j=a.length-1;
        while(i<j){
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }

        System.out.println(a);

    }
    public static void main(String[] args) {
        reverseString("saurabh");
    }

    public static class MaxOccurenceOfChar {
        public static void main(String[] args) {
            String s1 = "bananaainyannairbbbbbb";
            String s2 = "";

            // output : b - 1 , a - 3 , n - 2  return a - 3

            int maxOccurence = 0;
            char thatChar=' ';

            while(s1.length() > 0){
                char ch = s1.charAt(0);
                s2=s1.replace(ch+"", "" );

                int count = s1.length()-s2.length();
                if(count > maxOccurence){
                    maxOccurence = count;
                    thatChar = ch;
                }
                s1 = s2;
            }

            System.out.println(thatChar + " -> " + maxOccurence);

        }
    }
}
