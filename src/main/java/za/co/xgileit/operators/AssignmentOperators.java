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
        x+=number;
        System.out.println(x);
        System.out.println("x += 5 same as \"x = x + 5\" equal to "+(x+number));
    }

    public void subtractionAssignment(int number)
    {
        int x = number;
        x-=number;
        System.out.println(x);
        System.out.println("x -= 5 same as \"x = x - 5\" equal to "+(x-number));
    }

    public void multiplicationAssignment(int number)
    {
        int x = number;
        x*=number;
        System.out.println(x);
        System.out.println(" x *= 5 same as \" x *= 5\" equal to "+(x*number));
    }

    public void divisionAssignment(int number)
    {
        int x = 10;
        x/=number;
        System.out.println(x);
        System.out.println("x /= 5 same as \"x = x / 5\" equal to "+(x/number));
    }

    public void modulusAssignment(int number) {
        int x = 10;
        x %= number;
        System.out.println(x);
        System.out.println("x %= 5 same as \"x = x % 5\" equal to "+x%number);
    }
    }
