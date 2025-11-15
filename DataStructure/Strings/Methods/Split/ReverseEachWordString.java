package DataStructure.Strings.Methods.Split;


public class ReverseEachWordString {


    static String reverseWord(String s){

        char [] a = s.toCharArray();
        int i=0, j=a.length-1;

        while(i<j){
            char t = a[i];
            a[i] = a[j];
            a[j] = t;
            i++;
            j--;
        }

        String res = "";
        for(char ch : a){
            res += ch;
        }

        return res;
    }

    static String withoutSplit(String s){

        char [] a  = s.toCharArray();

        String res="";

        int i = 0;
        int j = 0;

        while(i<a.length){
            while(i<a.length && a[i] != ' ') i++;

            String t = "";
            for(int k=j; k<=i-1; k++){
                t += a[k];
            }
            res += t;
            if(i<a.length) res += " ";
            i--;
            j=i;
        }

        return res;
    }

    static String withSplit(String s){

        String[] str = s.split(" ");
        String res = "";

        for(int i=0; i<str.length; i++){
            String rev = reverseWord(str[i]);
            res += rev;
            if(i< str.length) res += " ";
        }
        return res;
    }

    public static void main(String[] args) {

        // i/p : "Java is an oop lang"
        // o/p : "avaJ si na poo gnal"

        String s = "Java is a oop lang";

        System.out.println(withSplit(s));
        System.out.println(withoutSplit(s));

    }
}
