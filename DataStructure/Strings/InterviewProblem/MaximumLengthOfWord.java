package DataStructure.Strings.InterviewProblem;

public class MaximumLengthOfWord {
    public static void main(String[] args) {
        String s = "i love programming because it is CREATIVE and LOgical things there";

        s = s.toLowerCase();

        char [] a = s.toCharArray();

        int i = a.length-1;
        int j = a.length-1;

        int maxCount = 0;
        String maxWord="";

        while(i>=0){
            while(i>=0 && a[i] != ' ') i--;

            String word="";
            for(int k=i+1; k<=j; k++){
                word += a[k];
            }

            if(word.length() > maxCount){
                maxCount = word.length();
                maxWord = word;
            }

            i--;
            j = i;
        }

        System.out.println(maxWord + " -> " + maxCount);

    }
}
