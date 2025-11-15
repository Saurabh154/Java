package DataStructure.Strings;

public class MainConcept {

    public static void main(String[] args) {

        String s1 = new String("Java"); // inside heap copy stored inside SCP
        String s2 = "Java"; // created inside SCP

        String s3 = "Java"; // created inside SCP pointing to the same S2

        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true

        System.out.println(s2 == s3); // true
        System.out.println(s2.equals(s3)); // true



    }
}
