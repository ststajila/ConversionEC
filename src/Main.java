import java.util.*;
public class Main {
    public static void main(String[] args) {

        System.out.println("What number would you like to convert?");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("In what base?");
        int b = scan.nextInt();
        System.out.println( num + " in base " + b + " is " + convert(num, b));

    }

    public static String convert (int num, int b)
    {
        int quotient; // the quotient when num is divided by base b
        int remainder; // the remainder when num is divided by base b
        quotient = num/b;
        remainder = num%b;
        if (quotient == 0) //fill in base case
        {
            return ("" + support(remainder));
        }
        else
        {
// Recursive step: the number is the base b representation of
// the quotient concatenated with the remainder

            return ( convert(quotient, b) + "" + support (remainder));
       
        }
    }

  public static String support(int num){
    if (num < 10){
      return ""+ num;
    }
    else if (num == 10){
      return "A";
    }
    else if (num == 11){
      return "B";
    }
    else if (num == 12){
      return "C";
    }
    else if (num == 13){
      return "D";
    }
    else if (num == 14){
      return "E";
    }
    else if (num == 15){
      return "F";
    }
    else{
      return "G";
    }

}
}