
public class arithmeticoperations{
    public static void main(String args[]){
//In Java, at args[0] is not the program name — it's the first command-line argument provided by the user.
//unlike c which has the programname at args[0] so need to remember this minute details.
        int a = Integer.parseInt(args[0]);  // converting commandline argument which are strings to an int primitive types
       // parseInt("123") method returns a primitive int
       //a is a primitive int
       // No boxing/unboxing needed as RHS returns a primitive int type to LHS
        Integer b = Integer.valueOf(args[1]); //valueOf("123") or valueOf(args[1])  returns an Integer object or wrapper class
        // no autoboxing is done as value from right side is also Integer object||wrapper class and on left side is also wrapper class
        int c = Integer.valueOf(args[2]);//valueOf("123") or valueOf(args[1])  returns an Integer object or wrapper class
        //later on depending on type of variable c autoboxing is done or not done if value returned is Integer object but
        //needs to be unboxed to primitve int
        Integer d = Integer.parseInt(args[3]);
        // Java will autobox that primitive int from RHS into an Integer object for LHS behind the scenes.
        int sum  = a +b;// primitive types eg int are faster/efficient in execution or in memory as Integer are object/class-Wrapper classes
        int prod = a*b;
        int quot = a/b;
        int rem = a%b;

          System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " * " + b + " = " + prod);
        System.out.println(a + " / " + b + " = " + quot);
        System.out.println(a + " % " + b + " = " + rem);
        System.out.println(a + " = " + quot + " * " + b + " + " + rem);


    }


}
