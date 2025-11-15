package DataStructure.Strings.InterviewProblem;

public class IntToRoman {
    public static void main(String[] args) {


        int [] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String [] sym = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int num = 58;
        String res="";
        for(int i=0; i<13; i++){
            if(num == 0) break;

            int times = num/val[i];
            while (times > 0){
                res += sym[i];
                times--;
            }

            num %= val[i];
        }

        System.out.println(res);

    }
}
