package DataStructure.Strings;

public class GenerateSubstrings {
    public static void main(String[] args) {
        
        String str = "abcd";

        for(int i=0; i<str.length(); i++){
            for(int j=0; j<=str.length(); j++){
                System.out.print(str.substring(i, j));
            }
        }

        System.out.println();

//        String s2 = "saurabh";
//
//        for(int i=0; i<s2.length(); i++){
//            for(int j=0; j<=s2.length(); j++){
//                System.out.println(s2.substring(i,j));
//            }
//        }
    }
}
