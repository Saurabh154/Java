package DataStructure.Strings;

public class ReverseVowel {

    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u' ||
        ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }
        return false;
    }

    public static String solve(String s){
        int n = s.length();
        char []ch = s.toCharArray();
        int start = 0;
        int end = n-1;

        while(start<end){

            // start = vowel, end = vowel, swap, start++, end--
            if(!isVowel(ch[end])){
               end--;
            }
            // start=vowel, end = consonant, end--
            else if (!isVowel(ch[start])) {
                start++;
            }else{
                char t = ch[end];
                ch[start] = ch[end];
                ch[end] = t;
                start++;
                end--;
            }
        }

        return String.valueOf(ch);
    }
    public static void main(String[] args) {

        System.out.println(solve("leetcode"));

    }
}
