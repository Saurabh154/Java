package ExceptionHandling.TryCatchFinally;

public class TryCatch {
    public static void main(String[] args) {
        try {
            // ArithmeticException
            int res = 10/0;   // if here the exception found then rest are skipped

            //NullPointerException
            String s = null;
            System.out.println(s.length());

            //ArrayIndexOutOfBoundsException
            int []arr = {1,2,3,4};
            arr[5] = 12;
        }
        catch (ArithmeticException e){
            System.out.println("Caught ArithmeticException : " + e);
        }
        catch (NullPointerException e){
            System.out.println("Caught NullPointerException: " + e);
        } catch (Exception e) {
            System.out.println("Caught global exception " + e);
        }

        System.out.println("Always Execute");
    }
}
