package za.co.xgileit.operators;
// Assignment operators are used to assign values to variables.
public class AssignmentOperators {
    public AssignmentOperators() {
    }

    public void assignment(int number)
    {
        int x = number;
        System.out.println(x);
    }

    public void additionAssignment(int number)
    {
        int x = number;
        x+=5;
        System.out.println(x);
    }

    public void subtractionAssignment(int number)
    {
        int x = number;
        x-=5;
        System.out.println(x);
    }

    public void multiplicationAssignment(int number)
    {
        int x = number;
        x*=5;
        System.out.println(x);
    }

    public void divisionAssignment(int number)
    {
        int x = number;
        x/=5;
        System.out.println(x);
    }

    public void modulusAssignment(int number) {
        int x = number;
        x %= 5;
        System.out.println(x);
    }
    }
