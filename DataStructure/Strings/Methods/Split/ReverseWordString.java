package DataStructure.Strings.Methods.Split;

public class ReverseWordString {

    static String withSplit(String s){

        String [] str = s.split(" ");

        String res="";

        for(int i=str.length-1; i>=0; i--){
            res += str[i];
            if(i>0) res += " ";
        }
        return res;
    }

    static String withoutSplit(String s){

        char [] a  = s.toCharArray();

        String res="";

        int i = a.length-1;
        int j = a.length-1;

        while(i>=0){
            while(i>=0 && a[i] != ' ') i--;

            String t = "";
            for(int k=i+1; k<=j; k++){
                t += a[k];
            }
            res += t;
            if(i>=0) res += " ";
            i--;
            j=i;
        }

        return res;
    }
    public static void main(String[] args) {

        // i/p : "Java is a oop lang"
        // o/p : "lang oop is a Java"

        String s = "Java is a oop lang";

        System.out.println(withSplit(s));
        System.out.println(withoutSplit(s));

    }
}
