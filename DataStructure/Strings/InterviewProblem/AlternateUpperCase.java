package DataStructure.Strings.InterviewProblem;

public class AlternateUpperCase {

    static void solve(){

        String s = "sAuRaBh";
        char [] a = s.toCharArray();

        String res = "";
        for(int i=0; i<a.length; i++){

            char ch =  a[i];

            if(i%2 != 0){
               if(ch >='a' && ch <= 'z'){ // in lowercase
                   ch=(char)(ch - 32);
                   res = res + ch;// uppercase
               }else{
                   res += ch;
               }
            }else{
                res += ch;
            }
        }

        System.out.println(res);

        // A - 65 a - 97
    }
    public static void main(String[] args) {

        //Alternate character uppercase
        String s = "Saurabh"; // SAuRaBh

        String res="";



        for(int i=0; i<s.length(); i++){

            if(i%2 != 0){
                res += Character.toUpperCase(s.charAt(i));
            }else{
                res += s.charAt(i);
            }

        }

        System.out.println(res);

        solve();


    }
}
