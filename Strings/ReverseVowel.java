package Strings;

public class ReverseVowel {
    public static void main(String[] args) {
        String s = "hello";

        char[] s1 = s.toCharArray();

        int i=0;
        int j=s1.length-1;

        while(i<j){
            if(Character.isLowerCase(s1[i]) && Character.isLowerCase(s1[j])){
                char c = s1[i];
                s1[i] = s1[j];
                s1[j] = c;
                i++;
                j--;
            }
            else if(Character.isUpperCase(s1[i])){
                i++;
            }



        }
    }
}
