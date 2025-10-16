package Strings.School_Level;

public class Problem {
    public static void main(String[] args) {
        String s = "Hello World";

        // System.out.println(s.length());
        
        String str = s.toLowerCase();
        // System.out.println(str);

        // str = s.toUpperCase();
        // System.out.println(str);

        // System.out.println(s.charAt(0) + ", " + s.charAt(s.length()-1));

        // System.out.println(s == str);

        // String s2 = "hello";
        // String s3 = "Hello";
        // System.out.println(s2.equals(s3));
        // System.out.println(s2 == s3);

        String s1 = "Good";
        String s2 = "Morning";

        System.out.println(s1.concat(s2));

        // int mid = s2.length()/2;
        System.out.println(s2);

        System.out.println("Hello".concat("World"));

        String s3 = "Hello";
        String s4 = "helLo";

        System.out.println(s3.equalsIgnoreCase(s4));

        // System.out.println("Substring Generate:");
        // String s5 = "abcde";

        // for(int i=0; i<s5.length(); i++){
        //     for(int j=0; j<=s5.length(); j++){
        //         System.out.println(s5.substring(i, j));
        //     }
        // }

        String part = "beautifula";
        System.out.println(part.substring(3, 9));


        int index = part.indexOf('b');
        System.out.println(index);

        int index2 = part.indexOf("ful");
        System.out.println(index2);

        String result = part.replace('l', '#');
        String result2 = part.replace('a', '%');
        System.out.println(result);
        System.out.println(result2);

        boolean found = part.contains("beauti");
        System.out.println(found);


        // String word = "  you    are looking good let's have a fun     today  ";

        // String newSentence = word.trim();

        // System.out.println(word);
        // System.out.println(newSentence);

        // String[] arr = word.split(" ");
        // for(String ele : arr){
        //     System.out.println(ele);
        // }

        // input string having spaces, comma etc.
        String sentence = "This is,comma.fullstop  whitespace";

        // The regex [,\\.\\s] splits the string by
        // commas (,), spaces (\\s), and periods (\\.)
        String regex = "[,\\s\\.]";

        String[] arr = sentence.split(regex);
        for(String word : arr){
            System.out.println(word);
        }

        String sentence2 = "  flying,  in the, sky. let's catch     up.      ";

        String reg = "[,\\s\\.]";
        String[] coll = sentence2.split(reg);
        for(String e : coll){
            System.out.println(e);
        }
    }
}
