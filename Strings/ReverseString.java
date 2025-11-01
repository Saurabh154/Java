package Strings;

public class ReverseString {
    static void reverseString(String str){
        char[] c = str.toCharArray();

        int i=0; int j=str.length()-1;
        while(i<j){
            char t = c[i];
            c[i] = c[j];
            c[j] = t;
        }

        System.out.println(c);
    }
    public static void main(String[] args) {
        String str = "Palindrome";
//        System.out.println("Reverse of " + str + " : " + reverseString(str));
        reverseString(str);


    }
}
