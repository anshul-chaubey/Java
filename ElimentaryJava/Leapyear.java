public class LeapYear {
    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);
        boolean isLeapYear;

        // divisible by 4
        isLeapYear = (year % 4 == 0); // i can remove the parenthesis around the RHS  no worries

        // divisible by 4 and not 100
        isLeapYear = isLeapYear && (year % 100 != 0);  //  here as well because != has higher precedence than && 

        // divisible by 4 and not 100 unless divisible by 400
        isLeapYear = isLeapYear || (year % 400 == 0);
      //Even though it works without parentheses, 
      //it's a good practice to keep them for readability and clarity, especially when mixing different operators.

        System.out.println(isLeapYear);
    }
}
