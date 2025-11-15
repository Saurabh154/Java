package DataStructure.Strings.Methods.Replace;

public class ReplaceCharacter {
    public static void main(String[] args) {

        String s = "pool";

        String res = "";

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == 'o'){
                res+='@';
            }else{
                res += ch;
            }
        }

        System.out.println(res);



    }
}
