package DataStructure.Strings.InterviewProblem;

public class EncodingDecoding {

    static String encoding(String s, int level){

        char []alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String res="";
        char [] a = s.toCharArray();

        for(int i=0; i<a.length; i++){
            int index = a[i] - 'a';
            index += level;
            index = index%26;
            res += alpha[index];
        }

        return res;
    }

    static String decoding(String s, int level){

        char []alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String res="";
        char [] a = s.toCharArray();

        for(int i=0; i<a.length; i++){
            int index = a[i] - 'a';
            index -= level;
            index = index%26;
            res += alpha[index];
        }

        return res;
    }

    public static void main(String[] args) {

        String s = "java";
        System.out.println(encoding(s, 1));

        String s1 = "kbwb";
        System.out.println(decoding(s1, 1));

    }
}
