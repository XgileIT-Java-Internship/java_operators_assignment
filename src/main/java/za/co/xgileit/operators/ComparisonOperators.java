package za.co.xgileit.operators;
/*
   Java Comparison Operators and their meaning
   1. == 	Equal to
   2. != 	Not equal
   3. > 	Greater than
   4. < 	Less than
   5. >= 	Greater than or equal to
   5. <= 	Less than or equal to
 * */
public class ComparisonOperators {
    public ComparisonOperators() {
    }
public void equalTo(int a, int b)
{
    System.out.println(a == b);
    System.out.println("\"a == b\" returns false because "+a+" is not equal to "+b);
}

    public void greater0rEqualTo(int a, int b)
    {

        System.out.println(a >= b);
        System.out.println(" "+a+" >= "+b+"\" returns true because" +a+" is greater, or equal to"+b);
    }

    public void greaterThan(int a, int b)
    {
        System.out.println(a > b);
        System.out.println("\" "+a+" >"+b+"\" returns true because "+a+" is greater than "+b);
    }

    public void lessThan(int a, int b)
    {
        System.out.println(a < b);
        System.out.println("\" "+a+""+" < "+b+"\" returns false because "+a+" is not less than "+b);
    }

    public void notEqualTo(int a, int b)
    {
        System.out.println(a != b);
        System.out.println( "\""+a+" != "+b+"\" returns true because "+a+" is not equal to "+b);
    }

}
