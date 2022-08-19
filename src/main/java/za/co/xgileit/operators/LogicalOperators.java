package za.co.xgileit.operators;
/*
    Java Logical Operators
    &&  	Logical and 	Returns true if both statements are true
    ||  	Logical or 	Returns true if one of the statements is true
    ! 	Logical not 	Reverse the result, returns false if the result is true
*/

public class LogicalOperators {

    public LogicalOperators() {
    }

    public void logicalAnd()
    {
        int x = 5;
        System.out.println(x > 3 && x < 10); // returns true because 5 is greater than 3 AND 5 is less than 10
    }


    public void logicalOr()
    {
        int x = 5;
        System.out.println(x > 3 || x < 4); // returns true because one of the conditions are true (5 is greater than 3, but 5 is not less than 4)
    }

    public void logicalNot()
    {
        int x = 5;
        System.out.println(!(x > 3 && x < 10)); // returns false because ! (not) is used to reverse the result
    }
}
