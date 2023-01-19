public class TernaryOperator {
    public static void main(String[] args) {
        int a, b, c, d;
        String result = "";
        String value = "";

        a = 5;
        b = 6;
        c = 7;
        d = 8;
        

        // If Else

        if (a == b)
            result = "true";
        else
            result = "false";

            System.out.println(result);

        
        // Ternary Operator

        value = c==d ?"true" : "false";

        System.out.println(value);
        }

}
