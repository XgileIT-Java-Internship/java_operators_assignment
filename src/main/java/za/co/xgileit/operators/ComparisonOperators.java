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
     a = 5;
     b = 3;
    System.out.println(a == b); // returns false because 5 is not equal to 3
}

    public void greater0rEqualTo(int a, int b)
    {
        int x = 5;
        int y = 3;
        System.out.println(x >= y); // returns true because 5 is greater, or equal, to 3
    }

    public void greaterThan(int a, int b)
    {
        int x = 5;
        int y = 3;
        System.out.println(x > y); // returns true because 5 is greater than 3
    }

    public void lessThan(int a, int b)
    {
        int x = 5;
        int y = 3;
        System.out.println(x < y); // returns false because 5 is not less than 3
    }

    public void notEqualTo(int a, int b)
    {
        int x = 5;
        int y = 3;
        System.out.println(x != y); // returns true because 5 is not equal to 3
    }

}
