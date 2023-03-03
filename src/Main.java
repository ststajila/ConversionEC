import java.util.*;
public class Main {
    public static void main(String[] args) {

        System.out.println("What number would you like to convert?");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("In what base?");
        int b = scan.nextInt();
        System.out.println( num + " in base " + b + " is" + convert(num, b));

    }

    public static String convert (int num, int b)
    {
        int quotient; // the quotient when num is divided by base b
        int remainder; // the remainder when num is divided by base b
        quotient = num/b;
        remainder = num%b;
        if ( quotient == 0 ) //fill in base case
        {
            return ("" + remainder );
        }
        else
        {
// Recursive step: the number is the base b representation of
// the quotient concatenated with the remainder

            return ( convert(quotient, remainder) + "" + remainder);
        }
    }


}